import {customElement, property} from "lit/decorators.js";
import {css, html, LitElement} from "lit";
import UI from "../api/dtos/UI";
import '@vaadin/vertical-layout'
import '@vaadin/app-layout'
import '@vaadin/app-layout/vaadin-drawer-toggle'
import '@vaadin/vaadin-tabs'
import '@vaadin/vaadin-tabs/vaadin-tab'
import './starter/journey-starter'
import {notificationRenderer} from 'lit-vaadin-helpers';
import {MenuType} from "../api/dtos/MenuType";
import {MenuBarItem, MenuBarItemSelectedEvent} from "@vaadin/menu-bar";
import "@vaadin/menu-bar";
import MateuApiClient from "../api/MateuApiClient";
import Menu from "../api/dtos/Menu";

interface MyMenuBarItem extends MenuBarItem {

    journeyTypeId: string | undefined

}


@customElement('mateu-ui')
export class MateuUi extends LitElement {

    @property()
    baseUrl = ''

    @property()
    uiId = '';

    @property()
    ui: UI | undefined = undefined;

    @property()
    journeyTypeId: string | undefined;

    @property()
    loading: boolean = false;

    @property()
    items: MenuBarItem[] | undefined;

    @property()
    selectedItem?: MenuBarItem;

    @property()
    notificationOpened: boolean = false;

    @property()
    notificationMessage: string = '';

    renderNotification = () => html`${this.notificationMessage}`;


    async connectedCallback() {
        super.connectedCallback();
        this.ui = await new MateuApiClient(this.baseUrl).fetchUi(this.uiId);
        this.items = this.ui?.menu?.map(m => this.mapToMenuBarItem(m));
        if (window.location.hash) {
            this.journeyTypeId = window.location.hash.substring(1)
        }
        window.onpopstate = (e) => {
            console.log('popped', e);
            const w = e.target as Window
            this.journeyTypeId = w.location.hash.substring(1)
        };
    }

    private mapToMenuBarItem(m: Menu): { journeyTypeId: string | undefined; children: MenuBarItem[] | undefined; text: string } {
        return {
            journeyTypeId: m.journeyTypeId,
            text: m.caption,
            children: m.type == MenuType.Submenu?m.submenus?.map(s => this.mapToMenuBarItem(s)):undefined
        }
    }

    selectJourney(event: Event) {
        let journeyTypeId = (event.currentTarget as HTMLElement).getAttribute('journeytypeid');
        // @ts-ignore
        this.journeyTypeId = journeyTypeId
    }

    itemSelected(event: MenuBarItemSelectedEvent) {
        let item = event.detail.value as MyMenuBarItem
        this.journeyTypeId = item.journeyTypeId
        document.title = item.text!;
        window.history.pushState({},"", '#' + this.journeyTypeId!);
    }

    login() {
        // @ts-ignore
        window.location = this.ui?.loginUrl
    }

    logout() {
        // @ts-ignore
        window.location = this.ui?.logoutUrl
    }

    goHome() {
        // @ts-ignore
        window.location = ''
    }


    render() {
       return html`
        ${this.ui?html`
            <vaadin-vertical-layout style="align-items: center">
                
                ${this.ui.menu && this.ui.menu.length > 0?html`
                    <vaadin-app-layout>
                        <h3 slot="navbar" class="title ml-l mr-l" style="width: 200px;" @click=${this.goHome}>${this.ui.title}</h3>
                        <div class="container" slot="navbar">
                            ${this.ui.menu?html`
                    <vaadin-menu-bar slot="navbar"
                            .items="${this.items}"
                            @item-selected="${this.itemSelected}"
                                     theme="tertiary"
                    ></vaadin-menu-bar>
                `:''}

                        </div>                         
                        <div slot="navbar" style="width: 200px; text-align: right; padding-right: 10px;">
                                ${this.ui.loginUrl?html`
                                    <vaadin-button theme="tertiary" 
                                                   @click="${this.login}"
                                    >Login</vaadin-button>
                            `:''}
                                ${this.ui.logoutUrl?html`
                                    <vaadin-button theme="tertiary"
                                                   @click="${this.logout}"
                                    >Logout</vaadin-button>
                            `:''}
                        </div>
                    </vaadin-app-layout>
                `:''}

                <!--
                <div class="container">
                    <router-outlet></router-outlet>
                </div>
                -->
                
                ${this.ui.homeJourneyTypeId && !this.journeyTypeId?html`

                    <journey-starter journeytypeid="${this.ui.homeJourneyTypeId}" baseUrl="${this.baseUrl}"></journey-starter>
                    
                `:''}

            ${this.journeyTypeId?html`

                    <journey-starter journeytypeid=${this.journeyTypeId} baseUrl="${this.baseUrl}"></journey-starter>
                    
                `:''}

            </vaadin-vertical-layout>
        
        `:html``}


        <vaadin-notification
                .opened=${this.notificationOpened}
                position="bottom-end"
                duration="10000"
                theme="error"
                ${notificationRenderer(this.renderNotification)}
        >${this.notificationMessage}</vaadin-notification>


       `
    }

    static styles = css`
    :host {
        
    }
    
    .mr-l {
        margin-right: var(--lumo-space-l);
    }
    .ml-l {
        margin-left: var(--lumo-space-l);
    }
    
    h3.title {
        font-size: var(--lumo-font-size-xl);
        margin-bottom: 0.5em;
        font-weight: 600;
        padding-bottom: 6px;
    }
    
    vaadin-button {
        padding-bottom: 4px;
    }
   
    
    div {
        height: 44px;
    }
        
    .container {
      max-width: 1124px;
      margin: auto;
    }

  `
}

declare global {
    interface HTMLElementTagNameMap {
        'mateu-ui': MateuUi
    }
}

declare global {
    interface Window {
        __MATEU_REMOTE_BASE_URL__: any;
        __MATEU_UI_ID__: any;
    }
}

