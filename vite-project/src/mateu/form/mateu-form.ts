import { LitElement, css, html } from 'lit'
import { customElement, property } from 'lit/decorators.js'
import Form from "../dtos/Form";
import '../section/mateu-section'

/**
 * An example element.
 *
 * @slot - This element has a slot
 * @csspart button - The button
 */
@customElement('mateu-form')
export class MateuForm extends LitElement {
  /**
   * Copy for the read the docs hint.
   */
  @property()
  metadata!: Form

  @property()
  data!: object

  render() {
    return html`
      <div>
        
        <h1>Form ${this.metadata.title} ${this.metadata.subtitle}</h1>
        
        <ul>
          ${this.metadata.sections.map(s => html`<mateu-section .section="${s}"></mateu-section>`)}
        </ul>
        
        <slot></slot>
      </div>
    `
  }

  static styles = css`
    :host {
      max-width: 1280px;
      margin: 0 auto;
      padding: 2rem;
      text-align: center;
    }

  `
}

declare global {
  interface HTMLElementTagNameMap {
    'mateu-form': MateuForm
  }
}
