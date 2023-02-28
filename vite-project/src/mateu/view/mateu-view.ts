import { LitElement, css, html } from 'lit'
import { customElement, property } from 'lit/decorators.js'
import Crud from "../dtos/Crud";
import Form from "../dtos/Form";
import '../form/mateu-form';
import '../crud/mateu-crud';

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
  metadata: Form | Crud | undefined

  @property()
  data: object | undefined;

  render() {
    return html`
      <div>
        
        <h1>Hola View</h1>
        
        ${this.getElement()}
        
        <slot></slot>
      </div>
    `
  }

  getElement() {
    if (this.metadata?.type == 'Crud') {
      return html`<mateu-crud .metadata="${this.metadata}" .data="${this.data}"></mateu-crud>`
    }
    if (this.metadata?.type == 'Form') {
      return html`<mateu-form .metadata="${this.metadata}" .data="${this.data}"></mateu-form>`
    }
    return html`<h1>Unknown view type</h1>`
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
    'mateu-view': MateuView
  }
}
