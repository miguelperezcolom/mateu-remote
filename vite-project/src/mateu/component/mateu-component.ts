import {customElement, property} from "lit/decorators.js";
import {css, html, LitElement} from "lit";
import Component from "../dtos/Component";
import {ViewType} from "../dtos/ViewType";
import '../form/mateu-form'
import '../crud/mateu-crud'
import '../result/mateu-result'
import '../spikes/starter/journey-starter'
import '../spikes/starter/journey-step'
import JourneyStarter from "../dtos/JourneyStarter";
import JourneyRunner from "../dtos/JourneyRunner";


@customElement('mateu-component')
export class MateuComponent extends LitElement {

    @property()
    component: Component | undefined;

    @property()
    journeyId!: string

    @property()
    stepId!: string

    @property()
    setLoading!: (loading: boolean) => void;

    connectedCallback() {
        super.connectedCallback();
    }


    render() {
        return html`
        
            ${this.component?.metadata.type == ViewType.Form?
                    html`<mateu-form 
                            .metadata=${this.component.metadata} 
                            .data=${this.component.data}
                            journeyId="${this.journeyId}" stepId="${this.stepId}"
                            .setLoading=${this.setLoading}
                            .rules=${this.component.rules}
                    ><slot></slot></mateu-form>`
                    :html``}

            ${this.component?.metadata.type == ViewType.Crud?
                    html`<mateu-crud 
                            .metadata=${this.component.metadata} 
                            .data=${this.component.data}
                            journeyId="${this.journeyId}" stepId="${this.stepId}"
                            .setLoading=${this.setLoading}
                            .rules=${this.component.rules}
                    ><slot></slot></mateu-crud>`
                    :html``}

            ${this.component?.metadata.type == ViewType.Result?
                    html`<mateu-result 
                            .metadata=${this.component.metadata} 
                            .data=${this.component.data}
                            journeyId="${this.journeyId}" stepId="${this.stepId}"
                            .setLoading=${this.setLoading}
                            .rules=${this.component.rules}
                    ><slot></slot></mateu-result>`
                    :html``}

            ${this.component?.metadata.type == ViewType.JourneyStarter?
                    html`<journey-starter remoteUrl="${(this.component.metadata as JourneyStarter).baseUrl}"></journey-starter>`
                    :html``}

            ${this.component?.metadata.type == ViewType.JourneyRunner?
                    html`<journey-starter journeyType="${(this.component.metadata as JourneyRunner).journeyType}"></journey-starter>`
                    :html``}
        
        `
    }

    static styles = css`
    
  `
}

declare global {
    interface HTMLElementTagNameMap {
        'mateu-component': MateuComponent
    }
}

