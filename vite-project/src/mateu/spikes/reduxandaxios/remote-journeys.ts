import {customElement, property} from "lit/decorators.js";
import {css, html, LitElement} from "lit";
import {connect} from "pwa-helpers";
import {fetchItems, store} from "./store";
import JourneyType from "../../api/dtos/JourneyType";


@customElement('remote-journeys')
export class RemoteJourneys extends connect(store)(LitElement) {

    @property()
    cargando: boolean | undefined = undefined;

    @property()
    error: boolean | undefined = undefined;

    @property()
    tipos:JourneyType[] = [];

    stateChanged(state: any) {
        this.tipos = state.tiposJourney.journeyTypes;
        this.cargando = state.tiposJourney.loading;
        this.error = state.tiposJourney.error;
    }


    connectedCallback() {
        super.connectedCallback();
        store.dispatch(fetchItems())
    }

    render() {
        return html`<h1>Journey types</h1>
        
        <div>cargando = ${this.cargando}</div>
        <div>error = ${this.error}</div>
        
        <div>
            ${this.tipos.map(s => html`<p>${s.name}</p>`)}
        </div>
        
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
        'remote-journeys': RemoteJourneys
    }
}

