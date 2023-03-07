import {customElement, property} from "lit/decorators.js";
import {css, html, LitElement} from "lit";
import {connect} from "pwa-helpers";
import {getUi, setJourneyType, store} from "./store";
import UI from "../../dtos/UI";
import '@vaadin/vertical-layout'
import '@vaadin/app-layout'
import '@vaadin/app-layout/vaadin-drawer-toggle'
import '@vaadin/vaadin-tabs'
import '@vaadin/vaadin-tabs/vaadin-tab'
import './journey-starter'
import {MenuType} from "../../dtos/MenuType";
import {MenuBarItem, MenuBarItemSelectedEvent} from "@vaadin/menu-bar";
import "@vaadin/menu-bar";

interface MyMenuBarItem extends MenuBarItem {

    journeyTypeId: string | undefined

}


@customElement('mateu-ui')
export class MateuUi extends connect(store)(LitElement) {

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

    stateChanged(state: any) {
        console.log('nuevo state', state)
        this.loading = false;

        //debugger;
        this.ui = state.tiposJourney.ui;
        this.journeyTypeId = state.tiposJourney.journeyType;
        this.items = this.ui?.menu.map(m => {
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
        console.log('journeyTypeId', this.journeyTypeId)

    }

    connectedCallback() {
        super.connectedCallback();
        console.log('connected')
        this.loading = true;
        store.dispatch(getUi(this.uiId))
    }

    selectJourney(event: Event) {
        let journeyTypeId = (event.currentTarget as HTMLElement).getAttribute('journeytypeid');
        console.log('journeyTypeId', journeyTypeId)
        store.dispatch(setJourneyType(journeyTypeId))
    }

    itemSelected(event: MenuBarItemSelectedEvent) {
        console.log(event.detail.value)
        let item = event.detail.value as MyMenuBarItem
        store.dispatch(setJourneyType(item.journeyTypeId))
    }


    render() {

        console.log('ui', this.ui);

        return html`
        ${this.ui?html`

            <vaadin-vertical-layout style="align-items: center">

            <vaadin-app-layout>
                <h3 slot="navbar" class="title ml-l mr-l">${this.ui.title}</h3>
                <div class="container" slot="navbar">
                ${this.ui.menu?html`
                    <vaadin-menu-bar slot="navbar"
                            .items="${this.items}"
                            @item-selected="${this.itemSelected}"
                                     theme="tertiary"
                    ></vaadin-menu-bar>
                `:''}
                </div>
            </vaadin-app-layout>


                <!--
                <div class="container">
                    <router-outlet></router-outlet>
                </div>
                -->
                
                ${this.ui.homeJourneyTypeId?html`

                    <journey-starter journeytypeid="${this.ui.homeJourneyTypeId}"></journey-starter>
                    
                `:''}

            ${this.journeyTypeId?html`

                    <journey-starter journeytypeid=${this.journeyTypeId}></journey-starter>
                    
                `:''}

            </vaadin-vertical-layout>
        
        `:``}`
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
      max-width: 1024px;
      margin: auto;
    }

  `
}

declare global {
    interface HTMLElementTagNameMap {
        'mateu-ui': MateuUi
    }
}

