import { LitElement, css, html } from 'lit'
import { customElement, property } from 'lit/decorators.js'
import Section from "../dtos/Section";
import '../fieldGroup/mateu-fieldgroup'

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

  render() {
    return html`
      <div>
        
        <h1>Section ${this.section.caption}</h1>
        
        <ul>
          ${this.section.fieldGroups.map(s => html`<mateu-fieldgroup .fieldGroup="${s}"></mateu-fieldgroup>`)}
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
    'mateu-section': MateuSection
  }
}
