import {css, html, LitElement} from 'lit'
import {customElement, property, state} from 'lit/decorators.js'
import Crud from "../dtos/Crud";
import "@vaadin/horizontal-layout";
import "@vaadin/button";
import "@vaadin/vaadin-grid";
import "@vaadin/vaadin-grid/vaadin-grid-selection-column";
import "@vaadin/vaadin-grid/vaadin-grid-column";
import { columnBodyRenderer } from '@vaadin/grid/lit.js';
import {connect} from "pwa-helpers";
import {api, runStepAction, store} from "../spikes/starter/store";
import {Grid, GridDataProvider, GridSorterDefinition} from "@vaadin/vaadin-grid";
import {Button} from "@vaadin/button";

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
  metadata!: Crud

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

  edit(e:Event) {
    const button = e.currentTarget as Button;
    // @ts-ignore
    console.log(button.row);
    const obj = {
      // @ts-ignore
      _selectedRow: button.row
    };
    // @ts-ignore
    this.data = { ...this.data, ...obj}
    store.dispatch(runStepAction(this.journeyId, this.stepId, 'edit', this.data))
  }

  runAction(e:Event) {
    const button = e.currentTarget as Button;
    const grid = this.shadowRoot?.getElementById('grid') as Grid
    const obj = {
      // @ts-ignore
      _selectedRows: grid.selectedItems
    };
    // @ts-ignore
    const extendedData = { ...this.data, ...obj}
    store.dispatch(runStepAction(this.journeyId, this.stepId, button.getAttribute('actionid')!, extendedData))
  }



  render() {
    return html`

      <vaadin-horizontal-layout class="header">
        <div>
          <h1>${this.metadata.title}</h1>
          <h3>${this.metadata.subtitle}</h3>
        </div>
        <vaadin-horizontal-layout style="justify-content: end; flex-grow: 1; align-items: center;" theme="spacing">
          ${this.metadata.actions.map(a => html`
            <vaadin-button theme="secondary" @click=${this.runAction} actionId=${a.id}>${a.caption}</vaadin-button>
          `)}
        </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
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

        <vaadin-grid-column
            frozen-to-end
            auto-width
            flex-grow="0"
            ${columnBodyRenderer(
                (row) => html`<vaadin-button theme="tertiary-inline" .row="${row}" @click="${this.edit}">Edit</vaadin-button>`,
                []
            )}
        
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
