import {customElement, property} from "lit/decorators.js";
import {css, html, LitElement} from "lit";
import UI from "../../api/dtos/UI";
import '@vaadin/vertical-layout'
import '@vaadin/app-layout'
import '@vaadin/app-layout/vaadin-drawer-toggle'
import '@vaadin/vaadin-tabs'
import '@vaadin/vaadin-tabs/vaadin-tab'
import './journey-starter'
import {MenuType} from "../../api/dtos/MenuType";
import {MenuBarItem, MenuBarItemSelectedEvent} from "@vaadin/menu-bar";
import "@vaadin/menu-bar";
import MateuApiClient from "../../api/MateuApiClient";

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

    async connectedCallback() {
        super.connectedCallback();
        this.loading = true;
        this.ui = await new MateuApiClient(this.baseUrl).fetchUi(this.uiId);
        console.log('ui', this.ui)
        this.items = this.ui?.menu?.map(m => {
            return {
                journeyTypeId: m.journeyTypeId,
                text: m.caption,
                children: m.type == MenuType.Submenu?m.submenus?.map(s => {
                    return {
                        journeyTypeId: s.journeyTypeId,
                        text: s.caption,
                    }
                }):undefined
            }
        });
        console.log('items', this.items)
    }

    selectJourney(event: Event) {
        let journeyTypeId = (event.currentTarget as HTMLElement).getAttribute('journeytypeid');
        // @ts-ignore
        this.journeyTypeId = journeyTypeId
    }

    itemSelected(event: MenuBarItemSelectedEvent) {
        let item = event.detail.value as MyMenuBarItem
        this.journeyTypeId = item.journeyTypeId
    }


    render() {
       return html`
        ${this.ui?html`
            <vaadin-vertical-layout style="align-items: center">

            <vaadin-app-layout>
                <h3 slot="navbar" class="title ml-l mr-l" style="width: 200px;">${this.ui.title}</h3>
                <div class="container" slot="navbar">
                ${this.ui.menu?html`
                    <vaadin-menu-bar slot="navbar"
                            .items="${this.items}"
                            @item-selected="${this.itemSelected}"
                                     theme="tertiary"
                    ></vaadin-menu-bar>
                `:''}
                </div>
                <div slot="navbar" style="width: 200px;"></div>
            </vaadin-app-layout>


                <!--
                <div class="container">
                    <router-outlet></router-outlet>
                </div>
                -->
                
                ${this.ui.homeJourneyTypeId?html`

                    <journey-starter journeytypeid="${this.ui.homeJourneyTypeId}" baseUrl="${this.baseUrl}"></journey-starter>
                    
                `:''}

            ${this.journeyTypeId?html`

                    <journey-starter journeytypeid=${this.journeyTypeId} baseUrl="${this.baseUrl}"></journey-starter>
                    
                `:''}

            </vaadin-vertical-layout>
        
        `:html`<h1>No UI</h1>`}`
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

