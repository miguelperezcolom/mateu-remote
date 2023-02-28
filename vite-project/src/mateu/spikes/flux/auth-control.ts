import {html, LitElement} from "lit";
import {customElement} from "lit/decorators.js";
import {connect} from "pwa-helpers";
import {signIn, signOut, store} from "./store";


@customElement("auth-control")
export class AuthControl extends connect(store)(LitElement) {

    static get properties() {
        return {
            estaAutenticado: Boolean,
        }
    }

    stateChanged(state) {
        this.estaAutenticado = state.isAuthenticated;
    }

    handleSignIn() {
        console.log('sign in');
        store.dispatch(signIn())
    }

    handleSignOut() {
        console.log('sign out');
        store.dispatch(signOut())
    }


    render() {
        if (this.estaAutenticado) {
            return html`<button @click=${this.handleSignOut}>Sign out, please.</button>`;
        }
        return html`<button @click=${this.handleSignIn}>Sign in, please.</button>`;
    }

}

declare global {
    interface HTMLElementTagNameMap {
        'auth-control': AuthControl
    }
}