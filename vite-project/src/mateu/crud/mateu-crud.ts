import { LitElement, css, html } from 'lit'
import { customElement, property } from 'lit/decorators.js'
import Crud from "../dtos/Crud";

/**
 * An example element.
 *
 * @slot - This element has a slot
 * @csspart button - The button
 */
@customElement('mateu-crud')
export class MateuCrud extends LitElement {
  /**
   * Copy for the read the docs hint.
   */
  @property()
  metadata: Crud | undefined

  @property()
  data: object | undefined;

  render() {
    return html`
      <div>
        
        <h1>Crud ${this.metadata?.title}</h1>
        
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
    'mateu-crud': MateuCrud
  }
}
