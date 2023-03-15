import {css, html, LitElement} from 'lit'
import {customElement, property, state} from 'lit/decorators.js'
import Crud from "../dtos/Crud";
import "@vaadin/horizontal-layout";
import "@vaadin/button";
import "@vaadin/vaadin-grid";
import "@vaadin/vaadin-grid/vaadin-grid-selection-column";
import "@vaadin/vaadin-grid/vaadin-grid-column";
import {connect} from "pwa-helpers";
import {api, store} from "../spikes/starter/store";
import {Grid, GridDataProvider, GridSorterDefinition} from "@vaadin/vaadin-grid";


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

  @state()
  dataProvider: GridDataProvider<any> = async (params, callback) => {
    const { page, pageSize, sortOrders } = params;

    const { rows, count } = await this.fetchData({
      page,
      pageSize,
      sortOrders,
      filters: btoa(JSON.stringify(this.data)),
    });

    callback(rows, count);
  };

  search() {
    const grid = this.shadowRoot!.getElementById('grid') as Grid;
    grid.clearCache();
  }

  async fetchData(params: {
    page: number;
    pageSize: number;
    filters: string;
    sortOrders: GridSorterDefinition[];
  }) {
    const rows = await this.fetchRows(params);

    // Pagination
    const count = await this.fetchCount(params.filters);

    return { rows, count };
  }

  async fetchRows(params: {
    page: number;
    pageSize: number;
    filters: string;
    sortOrders: GridSorterDefinition[];
  }): Promise<any[]> {
    const response = await api.get("/journeys/" + this.journeyId + "/steps/" + this.stepId +
        "/lists/main/rows?page=" + params.page + "&page_size=" + params.pageSize +
        "&ordering=&filters=" + params.filters);
    return response.data;
  }

  async fetchCount(filters: string): Promise<number> {
    const response = await api.get("/journeys/" + this.journeyId + "/steps/" + this.stepId +
        "/lists/main/count?filters=" + filters);
    return response.data;
  }

  connectedCallback() {
    super.connectedCallback();
  }

  stateChanged(state: any) {
    //debugger;
    console.log('state changed in crud', state)

  }

  filterChanged(e:Event) {
    const input = e.target as HTMLInputElement;
    const obj = {};
    // @ts-ignore
    obj[input.id] = input.value;
    this.data = { ...this.data, ...obj}
  }



  render() {
    return html`
      
      <h1>${this.metadata?.title}</h1>

      <vaadin-horizontal-layout style="align-items: baseline;" theme="spacing">
        
        ${this.metadata?.searchForm.fields.map(f => html`
          <vaadin-text-field id="${f.id}" label="${f.caption}" @change=${this.filterChanged}></vaadin-text-field>
        `)}
        
        
        <vaadin-button theme="primary" @click="${this.search}">Search</vaadin-button>
        
      </vaadin-horizontal-layout>

      <vaadin-grid id="grid" .dataProvider="${this.dataProvider}">
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
