import { LitElement, css, html } from 'lit'
import { customElement, property } from 'lit/decorators.js'
import Field from "../dtos/Field";

/**
 * An example element.
 *
 * @slot - This element has a slot
 * @csspart button - The button
 */
@customElement('mateu-field')
export class MateuField extends LitElement {
  /**
   * Copy for the read the docs hint.
   */
  @property()
  field!: Field

  render() {
    return html`
      <div>
        
        <h1>Field ${this.field.caption}</h1>
        
        <input type="${this.field.type}" id="${this.field.id}" placeholder="${this.field.description}">
        
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
    'mateu-field': MateuField
  }
}
