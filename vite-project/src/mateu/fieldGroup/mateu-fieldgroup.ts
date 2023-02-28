import { LitElement, css, html } from 'lit'
import { customElement, property } from 'lit/decorators.js'
import FieldGroup from "../dtos/FieldGroup";
import '../field/mateu-field'

/**
 * An example element.
 *
 * @slot - This element has a slot
 * @csspart button - The button
 */
@customElement('mateu-fieldgroup')
export class MateuFieldGroup extends LitElement {
  /**
   * Copy for the read the docs hint.
   */
  @property()
  fieldGroup!: FieldGroup

  render() {
    return html`
      <div>
        
        <h1>Field Group ${this.fieldGroup.caption}</h1>
        
        <ul>
          ${this.fieldGroup.fields.map(s => html`<mateu-field .field="${s}"></mateu-field>`)}
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
    'mateu-fieldgroup': MateuFieldGroup
  }
}
