import { LitElement, css, html } from 'lit'
import { customElement, property } from 'lit/decorators.js'
import Crud from "../dtos/Crud";
import "@vaadin/horizontal-layout";
import "@vaadin/button";
import "@vaadin/vaadin-grid";
import "@vaadin/vaadin-grid/vaadin-grid-selection-column";
import "@vaadin/vaadin-grid/vaadin-grid-column";


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

  @property()
  items: object[] | undefined;


  connectedCallback() {
    super.connectedCallback();
    this.items = [
      {
        "name": "Mateu",
        "lastName": "Pérez",
        "email": "mateuperezgalmes@gmail.com"
      },
      {
        "name": "Antònia",
        "lastName": "Galmés",
        "email": "antagalmes@gmail.com"
      }
    ];

    console.log('metadata', this.metadata)
  }



  render() {
    return html`
      
      <h1>${this.metadata?.title}</h1>

      <vaadin-horizontal-layout style="align-items: baseline;" theme="spacing">
        
        ${this.metadata?.searchForm.fields.map(f => html`
          <vaadin-text-field id="${f.id}" label="${f.caption}"></vaadin-text-field>
        `)}
        
        
        <vaadin-button theme="primary">Search</vaadin-button>
        
      </vaadin-horizontal-layout>

      <vaadin-grid .items="${this.items}">
        <vaadin-grid-selection-column></vaadin-grid-selection-column>

      ${this.metadata?.columns.map(c => html`
        <vaadin-grid-column path="${c.id}" header="${c.caption}"></vaadin-grid-column>
      `)}
      
        </vaadin-grid>
    `
  }

  static styles = css`
    :host {

    }

  `
}

declare global {
  interface HTMLElementTagNameMap {
    'mateu-crud': MateuCrud
  }
}
