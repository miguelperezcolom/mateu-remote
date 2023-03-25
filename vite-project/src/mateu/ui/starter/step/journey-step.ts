import {customElement, property} from "lit/decorators.js";
import {css, html, LitElement} from "lit";
import Step from "../../../api/dtos/Step";
import './view/mateu-view';

@customElement('journey-step')
export class JourneyStep extends LitElement {

    @property()
    baseUrl = '';

    @property()
    journeyId = '';

    @property()
    stepId = '';

    @property()
    step: Step | undefined = undefined;

    connectedCallback() {
        super.connectedCallback();
    }

    render() {
        return html`<mateu-view 
                .view=${this.step?.view} 
                journeyId="${this.journeyId}" 
                stepId="${this.stepId}"
                baseUrl="${this.baseUrl}"
        ><slot></slot></mateu-view>`
    }

    static styles = css`

  `
}

declare global {
    interface HTMLElementTagNameMap {
        'journey-step': JourneyStep
    }
}

