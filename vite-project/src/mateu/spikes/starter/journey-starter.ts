import {customElement, property} from "lit/decorators.js";
import {css, html, LitElement} from "lit";
import {connect} from "pwa-helpers";
import {fetchItems, setJourneyType, store} from "./store";
import JourneyType from "../../dtos/JourneyType";
import '@vaadin/button'
import '@vaadin/horizontal-layout'

@customElement('journey-starter')
export class JourneyStarter extends connect(store)(LitElement) {

    @property()
    cargando: boolean | undefined = undefined;

    @property()
    error: boolean | undefined = undefined;

    @property()
    tipos:JourneyType[] = [];

    @property()
    journeyType: string | undefined = undefined;

    stateChanged(state: any) {
        console.log('nuevo state', state.tiposJourney)
        this.tipos = state.tiposJourney.journeyTypes;
        this.cargando = state.tiposJourney.loading;
        this.error = state.tiposJourney.error;
        this.journeyType = state.tiposJourney.journeyType;
    }


    connectedCallback() {
        super.connectedCallback();
        store.dispatch(fetchItems())
    }

    startJourney(event: Event) {
        const typeId = (event.target as HTMLElement).getAttribute('typeId');
        console.log('start', typeId)
        store.dispatch(setJourneyType(typeId))
    }

    render() {
        return html`<h1>Journey types</h1>
        
        <div>cargando = ${this.cargando}</div>
        <div>error = ${this.error}</div>
        <div>journey type = ${this.journeyType}</div>
        
        <div>
            ${this.tipos.map(s => html`<div class="card-journey-type">
                <vaadin-horizontal-layout theme="spacing padding" style="width: 100%;">
                    <div style="flex-grow: 1"><h2>${s.name}</h2></div>
                    <vaadin-horizontal-layout style="align-items: center;">
                        <vaadin-button theme="primary" @click=${this.startJourney} typeId="${s.id}">Start <journey></journey></vaadin-button>
                    </vaadin-horizontal-layout>
                </vaadin-horizontal-layout>
            </div>`)}
        </div>
        
        <slot></slot>`
    }

    static styles = css`
    :host {
      max-width: 1280px;
      margin: 0 auto;
      padding: 2rem;    
    }
    
    .card-journey-type {
        padding-left: 20px;
        padding-right: 20px;
        margin-bottom: 10px;
        border: 1px solid lightgrey;
        border-radius: 7px;
    }
  `
}

declare global {
    interface HTMLElementTagNameMap {
        'journey-starter': JourneyStarter
    }
}

