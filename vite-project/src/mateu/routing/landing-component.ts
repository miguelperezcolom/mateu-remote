import {customElement, property} from "lit/decorators.js";
import {css, html, LitElement} from "lit";
import '../spikes/starter/mateu-ui'


@customElement('landing-component')
export class LandingComponent extends LitElement {

    @property()
    uiId = window.__MATEU_UI_ID__;

    render() {
        return html`<mateu-ui uiId="${this.uiId}">
        </mateu-ui>`
    }

    static styles = css`
  `
}

declare global {
    interface HTMLElementTagNameMap {
        'landing-component': LandingComponent
    }
}

