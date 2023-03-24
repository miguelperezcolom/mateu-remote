import { LitElement, css, html } from 'lit'
import { customElement, property } from 'lit/decorators.js'
import '../component/mateu-component';
import '../crud/mateu-crud';
import View from "../api/dtos/View";

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
      <div>
        ${this.view?.components.map(c => html`<mateu-component 
            .component=${c}  journeyId="${this.journeyId}" stepId="${this.stepId}" 
            .setLoading=${this.setLoading}
            baseUrl="${this.baseUrl}"
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
