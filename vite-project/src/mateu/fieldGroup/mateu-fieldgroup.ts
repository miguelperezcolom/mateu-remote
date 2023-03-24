import { LitElement, css, html } from 'lit'
import { customElement, property } from 'lit/decorators.js'
import FieldGroup from "../api/dtos/FieldGroup";
import '../field/mateu-field'
import {FormElement} from "../form/mateu-form";

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

  @property()
  formElement!: FormElement;

  connectedCallback() {
    super.connectedCallback();
  }

  onValueChange(e: CustomEvent) {
    this.formElement.valueChanged(e.detail.key, e.detail.value)
  }


  render() {
    return html`
      <div>

        ${this.fieldGroup.caption?html`<h2>${this.fieldGroup.caption}</h2>`:''}
        
          ${this.fieldGroup.fields.map(s => html`<mateu-field .field="${s}" @change=${this.onValueChange} .formElement=${this.formElement} .value=${this.formElement.getValue(s.id)} .fieldWrapper=${this.formElement.getFieldWrapper(s)}></mateu-field>`)}
        
        <slot></slot>
      </div>
    `
  }

  static styles = css`
  /*
    :host {
      max-width: 1280px;
      margin: 0 auto;
      padding: 2rem;
      text-align: center;
    }
    */
  `
}

declare global {
  interface HTMLElementTagNameMap {
    'mateu-fieldgroup': MateuFieldGroup
  }
}
