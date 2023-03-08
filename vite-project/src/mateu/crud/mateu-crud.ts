import { LitElement, css, html } from 'lit'
import { customElement, property } from 'lit/decorators.js'
import Crud from "../dtos/Crud";
import "@vaadin/horizontal-layout";
import "@vaadin/button";
import "@vaadin/vaadin-grid";
import "@vaadin/vaadin-grid/vaadin-grid-selection-column";
import "@vaadin/vaadin-grid/vaadin-grid-column";
import {connect} from "pwa-helpers";
import {getCount, getRows, store} from "../spikes/starter/store";


/**
 * An example element.
 *
 * @slot - This element has a slot
 * @csspart button - The button
 */
@customElement('mateu-crud')
export class MateuCrud extends connect(store)(LitElement) {
  /**
   * Copy for the read the docs hint.
   */

  @property()
  journeyId!: string

  @property()
  stepId!: string

  @property()
  metadata: Crud | undefined

  @property()
  data: object | undefined;

  @property()
  items: object[] | undefined;

  search() {
    console.log('search')
    store.dispatch(getCount(this.journeyId, this.stepId, 'main', ''))
    store.dispatch(getRows(this.journeyId, this.stepId, 'main', ''))
  }

  connectedCallback() {
    super.connectedCallback();

    console.log('metadata', this.metadata)
  }

  stateChanged(state: any) {
    console.log('nuevo state', state)

    console.log(state.tiposJourney.items)

    //debugger;
    this.items = state.tiposJourney.items;

  }



  render() {
    return html`
      
      <h1>${this.metadata?.title}</h1>

      <vaadin-horizontal-layout style="align-items: baseline;" theme="spacing">
        
        ${this.metadata?.searchForm.fields.map(f => html`
          <vaadin-text-field id="${f.id}" label="${f.caption}"></vaadin-text-field>
        `)}
        
        
        <vaadin-button theme="primary" @click="${this.search}">Search</vaadin-button>
        
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
