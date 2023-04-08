import { LitElement, css, html } from 'lit'
import { customElement, property } from 'lit/decorators.js'
import FieldGroup from "../../../../../../../../api/dtos/FieldGroup";
import './field/mateu-field'
import {FormElement} from "../../mateu-form";
import Field from "../../../../../../../../api/dtos/Field";

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
  baseUrl!: string

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

  getStyle(f: Field) {
    const width = f.attributes.find(a => a.key == 'width')?.value;
    if (width) {
      return 'width: ' + width + ';'
    }
    return 'flex-grow: 1;'
  }


  render() {
    return html`
      <div>

        ${this.fieldGroup.caption?html`<h2>${this.fieldGroup.caption}</h2>`:''}

        ${this.fieldGroup.lines.map(l => html`

          <vaadin-horizontal-layout class="line" theme="spacing">
            
            ${l.fields.map(s => html`<mateu-field .field="${s}" 
                                                  @change=${this.onValueChange}
                                                    baseUrl=${this.baseUrl}
                                                    .formElement=${this.formElement} 
                                                    .value=${this.formElement.getValue(s.id)} 
                                                    .fieldWrapper=${this.formElement.getFieldWrapper(s)}
            style="${this.getStyle(s)}">

          </vaadin-horizontal-layout>
          
          
        
        `)}
        
          </mateu-field>`)}
        
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
    .line {
    }
  `
}

declare global {
  interface HTMLElementTagNameMap {
    'mateu-fieldgroup': MateuFieldGroup
  }
}
