import {customElement, property} from "lit/decorators.js";
import {css, html, LitElement} from "lit";
import Component from "../../../../../api/dtos/Component";
import {ViewType} from "../../../../../api/dtos/ViewType";
import './form/mateu-form'
import './crud/mateu-crud'
import './result/mateu-result'
import '../../../journey-starter'
import '../../journey-step'
import JourneyStarter from "../../../../../api/dtos/JourneyStarter";
import JourneyRunner from "../../../../../api/dtos/JourneyRunner";


@customElement('mateu-component')
export class MateuComponent extends LitElement {

    @property()
    baseUrl = ''

    @property()
    component: Component | undefined;

    @property()
    journeyId!: string

    @property()
    stepId!: string


    render() {
        return html`
        
            ${this.component?.metadata.type == ViewType.Form?
                    html`<mateu-form 
                            .metadata=${this.component.metadata} 
                            .data=${this.component.data}
                            journeyId="${this.journeyId}" 
                            stepId="${this.stepId}"
                            .rules=${this.component.rules}
                            baseUrl="${this.baseUrl}"
                    ><slot></slot></mateu-form>`
                    :html``}

            ${this.component?.metadata.type == ViewType.Crud?
                    html`<mateu-crud 
                            .metadata=${this.component.metadata} 
                            .data=${this.component.data}
                            journeyId="${this.journeyId}" 
                            stepId="${this.stepId}"
                            .rules=${this.component.rules}
                            baseUrl="${this.baseUrl}"
                    ><slot></slot></mateu-crud>`
                    :html``}

            ${this.component?.metadata.type == ViewType.Result?
                    html`<mateu-result 
                            .metadata=${this.component.metadata} 
                            .data=${this.component.data}
                            journeyId="${this.journeyId}" stepId="${this.stepId}"
                            .rules=${this.component.rules}
                            baseUrl="${this.baseUrl}"
                    ><slot></slot></mateu-result>`
                    :html``}

            ${this.component?.metadata.type == ViewType.JourneyStarter?
                    html`<journey-starter 
                            remoteUrl="${(this.component.metadata as JourneyStarter).baseUrl}"
                            baseUrl="${this.baseUrl}"
                    ></journey-starter>`
                    :html``}

            ${this.component?.metadata.type == ViewType.JourneyRunner?
                    html`<journey-starter 
                            journeyType="${(this.component.metadata as JourneyRunner).journeyType}"
                            baseUrl="${this.baseUrl}"
                    ></journey-starter>`
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

