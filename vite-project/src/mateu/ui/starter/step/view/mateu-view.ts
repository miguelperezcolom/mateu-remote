import { LitElement, css, html } from 'lit'
import { customElement, property } from 'lit/decorators.js'
import './component/mateu-component';
import './component/crud/mateu-crud';
import View from "../../../../api/dtos/View";

/**
 * An example element.
 *
 * @slot - This element has a slot
 * @csspart button - The button
 */
@customElement('mateu-view')
export class MateuView extends LitElement {
  /**
   * Copy for the read the docs hint.
   */

  @property()
  baseUrl = ''

  @property()
  view!: View

  @property()
  journeyTypeId!: string

  @property()
  journeyId!: string

  @property()
  stepId!: string

  @property()
  previousStepId!: string


  connectedCallback() {
    super.connectedCallback();
  }

  render() {
    return html`
      <div>
        ${this.view?.main?.components.map(c => html`<mateu-component 
            .component=${c} journeyTypeId="${this.journeyTypeId}" journeyId="${this.journeyId}" stepId="${this.stepId}" 
            baseUrl="${this.baseUrl}"
            previousStepId="${this.previousStepId}"
        >
          <slot></slot></mateu-component>
        `)}</div>`
  }

  static styles = css`
    `
}

declare global {
  interface HTMLElementTagNameMap {
    'mateu-view': MateuView
  }
}
