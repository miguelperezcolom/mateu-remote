import { LitElement, css, html } from 'lit'
import { customElement, property } from 'lit/decorators.js'
import Section from "../dtos/Section";
import '../fieldGroup/mateu-fieldgroup'
import {FormElement} from "../form/mateu-form";

/**
 * An example element.
 *
 * @slot - This element has a slot
 * @csspart button - The button
 */
@customElement('mateu-section')
export class MateuSection extends LitElement {
  /**
   * Copy for the read the docs hint.
   */
  @property()
  section!: Section

  @property()
  formElement!: FormElement;

  render() {
    return html`
      <div class="mateu-section">

        ${this.section.caption?html`<h1>${this.section.caption}</h1>`:''}
        
        ${this.section.fieldGroups.map(s => html`<mateu-fieldgroup .fieldGroup="${s}" .formElement=${this.formElement}></mateu-fieldgroup>`)}
        
        <slot></slot>
      </div>
    `
  }

  static styles = css`
    .mateu-section {
      text-align: left;
      border: 1px solid lightgrey;
      border-radius: 8px;
      padding: 2rem;  
      margin-bottom: 16px;    
    }

  `
}

declare global {
  interface HTMLElementTagNameMap {
    'mateu-section': MateuSection
  }
}
