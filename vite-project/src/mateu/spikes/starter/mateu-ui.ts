import {customElement, property} from "lit/decorators.js";
import {css, html, LitElement} from "lit";
import {connect} from "pwa-helpers";
import {getUi, setJourneyType, store} from "./store";
import UI from "../../dtos/UI";
import '@vaadin/app-layout'
import '@vaadin/app-layout/vaadin-drawer-toggle'
import '@vaadin/vaadin-tabs'
import '@vaadin/vaadin-tabs/vaadin-tab'
import './journey-starter'


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

    stateChanged(state: any) {
        console.log('nuevo state', state)
        this.loading = false;

        //debugger;
        this.ui = state.tiposJourney.ui;

    }

    connectedCallback() {
        super.connectedCallback();
        console.log('connected')
        this.loading = true;
        store.dispatch(getUi(this.uiId))
    }

    selectJourney(event: Event) {
        // @ts-ignore
        this.journeyTypeId = (event.currentTarget as HTMLElement).getAttribute('journeytypeid');
        console.log('journeyTypeId', this.journeyTypeId)
        store.dispatch(setJourneyType(this.journeyTypeId))
    }


    render() {

        console.log('ui', this.ui);
        console.log('this.ui.homeJourneyId', this.ui?.homeJourneyTypeId);

        return html`
        
        ${this.ui?html`

            <vaadin-app-layout>
                ${this.ui.menu?html`
                    <vaadin-drawer-toggle slot="navbar"></vaadin-drawer-toggle>
                `:''}
                <h1 slot="navbar">${this.ui.title}</h1>
                ${this.ui.menu?html`
                    <vaadin-tabs slot="drawer" orientation="vertical">
                        ${this.ui.menu.map(m => html`
                            <vaadin-tab>
                                <a tabindex="-1" @click=${this.selectJourney} journeyTypeId="${m.journeyTypeId}">
                                    ${m.icon?html`<vaadin-icon icon="vaadin:${m.icon}"></vaadin-icon>`:''}
                                    <span>${m.caption}</span>
                                </a>
                            </vaadin-tab>
                        `)}
                    </vaadin-tabs>
                `:''}
                
                ${this.ui.homeJourneyTypeId?html`

                    <journey-starter journeytypeid="com.example.demoremote.MyForm"></journey-starter>
                    
                `:''}

                ${this.journeyTypeId?html`

                    <journey-starter journeytypeid=${this.journeyTypeId}></journey-starter>
                    
                `:''}
                
            </vaadin-app-layout>
        
        `:``}
        
        
        <slot></slot>`
    }

    static styles = css`
    :host {
      max-width: 1280px;
      margin: 0 auto;
      padding: 2rem;
      text-align: center;      
    }
  `
}

declare global {
    interface HTMLElementTagNameMap {
        'mateu-ui': MateuUi
    }
}

