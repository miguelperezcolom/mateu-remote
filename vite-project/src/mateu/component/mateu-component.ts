import {customElement, property} from "lit/decorators.js";
import {css, html, LitElement} from "lit";
import Component from "../dtos/Component";
import {ViewType} from "../dtos/ViewType";
import '../form/mateu-form'
import '../crud/mateu-crud'


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
        console.log(this.component)
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

