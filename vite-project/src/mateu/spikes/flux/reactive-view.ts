import {html, LitElement} from "lit";
import {customElement} from "lit/decorators.js";
import {store} from "./store";
import {connect} from "pwa-helpers";


@customElement("reactive-view")
export class ReactiveView extends connect(store)(LitElement) {

    static get properties() {
        return {
            estaAutenticado: Boolean,
        }
    }

    stateChanged(state) {
        this.estaAutenticado = state.isAuthenticated;
    }


    render() {
        if (this.estaAutenticado) {
            return html`<h1>Está autenticado</h1>`;
        }
        return html`<h1>NO está autenticado</h1>`;
    }

}

declare global {
    interface HTMLElementTagNameMap {
        'reactive-view': ReactiveView
    }
}
