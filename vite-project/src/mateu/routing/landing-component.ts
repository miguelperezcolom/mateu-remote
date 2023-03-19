import {customElement, property} from "lit/decorators.js";
import {css, html, LitElement} from "lit";
import '../spikes/starter/mateu-ui'


@customElement('landing-component')
export class LandingComponent extends LitElement {

    @property()
    name = '';


    render() {
        return html`<mateu-ui uiId="com.example.demoremote.DemoApp">
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

