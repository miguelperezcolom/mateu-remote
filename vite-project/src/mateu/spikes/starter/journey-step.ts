import {customElement, property} from "lit/decorators.js";
import {css, html, LitElement} from "lit";
import MateuJourneyClient from "../../journey-starter/MateuJourneyClient";
import Step from "../../dtos/Step";
import '../../view/mateu-view';

@customElement('journey-step')
export class JourneyStep extends LitElement {

    @property()
    journeyId = '';

    @property()
    stepId = '';

    @property()
    step: Step | undefined = undefined;

    @property()
    setLoading!: (loading: boolean) => void;


    connectedCallback() {
        super.connectedCallback();
        console.log('stepId', this.stepId)
        console.log('step', this.step)
        if (false) this.step = new MateuJourneyClient().getStep();
        console.log(this.step)
    }


    render() {
        return html`
            <!--
            <h1>${this.step!.name}</h1>
            -->
            
            <mateu-view .view=${this.step?.view} journeyId="${this.journeyId}" stepId="${this.stepId}" .setLoading=${this.setLoading}><slot></slot></mateu-view>
            
            `
    }

    static styles = css`
    :host {
      max-width: 1280px;
      width: 800px;
      margin: 0 auto;
      padding: 2rem;    
    }
  `
}

declare global {
    interface HTMLElementTagNameMap {
        'journey-step': JourneyStep
    }
}

