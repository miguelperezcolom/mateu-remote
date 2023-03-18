import {css, html, LitElement} from 'lit'
import {customElement, property} from 'lit/decorators.js'
import Field from "../dtos/Field";
import Component from "./fields/interfaces/Component";
import {mapInputTypeToFieldType} from "./fields/FieldTypeMapper";
import './fields/field-text'
import './fields/field-number'
import './fields/field-double'
import './fields/field-radiobuttons'
import './fields/field-boolean'
import './fields/field-date'
import './fields/field-datetime'
import './fields/field-time'
import './fields/field-readonly'
import './fields/field-textarea'
import './fields/field-combobox'
import './fields/field-externalref'
import './fields/field-toggle'
import './fields/field-file'
import './fields/field-boolean-array'
import './fields/field-int-array'
import './fields/field-double-array'
import './fields/field-string-array'
import './fields/field-enum-array'
import './fields/field-externalref-array'
import './fields/field-closedlist'
import FieldWrapper from "../form/FieldWrapper";

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

  @property()
  value!: object

  @property()
  visible!: boolean

  @property()
  enabled!: boolean

  @property()
  fieldWrapper!: FieldWrapper


  firstUpdated() {
    const element = document.createElement(mapInputTypeToFieldType(this.field.type, this.field.stereotype));
    const container = this.shadowRoot!.getElementById('container')!;
    const component = element as unknown as Component;
    component.onValueChanged = (e) => {
      let change = new CustomEvent('change', {detail: {
          key: this.field.id,
          value: e.value
        }});
      this.dispatchEvent(change);
    }
    component.setLabel(this.field.caption);
    component.setPlaceholder(this.field.placeholder)
    component.setField(this.field);
    component.setValue(this.value)
    component.setRequired(this.field.validations.length > 0)
    container.appendChild(element);
    const wrapper = this.shadowRoot!.getElementById('wrapper')!;
    this.fieldWrapper.container = wrapper;
  }

  render() {
    return html`
      <div id="wrapper">
        <div id="container"></div>
        
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
    'mateu-field': MateuField
  }
}
