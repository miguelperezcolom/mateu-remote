import {css, html, LitElement, PropertyValues, TemplateResult} from 'lit'
import {customElement, property, state} from 'lit/decorators.js'
import Crud from "../api/dtos/Crud";
import "@vaadin/horizontal-layout";
import "@vaadin/button";
import "@vaadin/vaadin-grid";
import "@vaadin/vaadin-grid/vaadin-grid-selection-column";
import "@vaadin/vaadin-grid/vaadin-grid-sort-column";
import "@vaadin/vaadin-grid/vaadin-grid-column";
import {columnBodyRenderer} from '@vaadin/grid/lit.js';
import {Grid, GridDataProvider} from "@vaadin/vaadin-grid";
import {Button} from "@vaadin/button";
import {badge} from "@vaadin/vaadin-lumo-styles";
import {StatusType} from "../api/dtos/StatusType";
import Column from "../api/dtos/Column";
import '@vaadin/menu-bar';
import axios from "axios";
import MateuApiClient from "../api/MateuApiClient";


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
  baseUrl = ''

  @property()
  journeyId!: string

  @property()
  stepId!: string

  @property()
  metadata!: Crud

  @property()
  data: object | undefined;

  @state()
  private clickedRow:unknown;

  // @ts-ignore
  private contextMenuOpened?: boolean;

  @state()
  message = '';

  @state()
  canDownload = true;


  @state()
  dataProvider: GridDataProvider<any> = async (params, callback) => {
    const { page, pageSize } = params;

    const { rows, count } = await this.fetchData({
      page,
      pageSize,
      sortOrders: btoa(JSON.stringify(params.sortOrders.map(o => {
        let direction = 'None';
        if ('asc' == o.direction) direction = 'Ascending';
        if ('desc' == o.direction) direction = 'Descending';
        return {
          column: o.path,
          order: direction
        }
      }))),
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
    sortOrders: string;
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
    sortOrders: string;
  }): Promise<any[]> {
    const response = await axios.get(this.baseUrl + "/journeys/" + this.journeyId + "/steps/" + this.stepId +
        "/lists/main/rows?page=" + params.page + "&page_size=" + params.pageSize +
        "&ordering=" + params.sortOrders + "&filters=" + params.filters);
    return response.data;
  }

  async fetchCount(filters: string): Promise<number> {
    const response = await axios.get(this.baseUrl + "/journeys/" + this.journeyId + "/steps/" + this.stepId +
        "/lists/main/count?filters=" + filters);
    this.message = `${response.data} elements found.`;
    return response.data;
  }

  connectedCallback() {
    super.connectedCallback();
  }

  protected firstUpdated(_changedProperties: PropertyValues) {
      this.addEventListener('keydown', this.handleKey);
  }

  private handleKey(e: KeyboardEvent) {
    if (e.code == 'Enter') {
      setTimeout(() => this.search());
    }
  }

  stateChanged(state: any) {
    //debugger;
    console.log('state changed in crud', state)
  }

  filterChanged(e:Event) {
    const input = e.target as HTMLInputElement;
    const obj = {};
    // @ts-ignore
    obj[input.id] = input.value || null;
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
    new MateuApiClient(this.baseUrl).runStepAction(this.journeyId, this.stepId,
        'edit', this.data)
  }

  runAction(e:Event) {
    const button = e.currentTarget as Button;
    const grid = this.shadowRoot?.getElementById('grid') as Grid
    const obj = {
      // @ts-ignore
      _selectedRows: grid.selectedItems,
      _clickedRow: this.clickedRow
    };
    // @ts-ignore
    const extendedData = { ...this.data, ...obj}
    new MateuApiClient(this.baseUrl).runStepAction(this.journeyId, this.stepId,
        button.getAttribute('actionid')!, extendedData)
  }

  itemSelected(e: CustomEvent) {
    const obj = {
      // @ts-ignore
      _clickedRow: e.target.row
    };
    // @ts-ignore
    const extendedData = { ...this.data, ...obj}
    new MateuApiClient(this.baseUrl).runStepAction(this.journeyId, this.stepId,
        '__row__' + e.detail.value.id, extendedData)
  }

  private getThemeForBadgetType(type: StatusType): string {
    switch (type) {
      case StatusType.SUCCESS: return 'success';
      case StatusType.WARNING: return 'warning';
      case StatusType.DANGER: return 'error';
      case StatusType.NONE: return 'contrast';
    }
    return '';
  }

  private getColumn(c: Column): TemplateResult {
    if (c.type == 'Status') {
      return html`
            <vaadin-grid-sort-column  path="${c.id}" header="${c.caption}" resizable
                                      width="${c.width}"
                ${columnBodyRenderer(
          (row) => {
            // @ts-ignore
            const status = row[c.id]
            return html`<span theme="badge ${this.getThemeForBadgetType(status.type)}">${status.message}</span>`;
          },
          []
      )}>
            </vaadin-grid-sort-column>
          `;
    }
    if (c.type == 'ColumnActionGroup') {
      return html`
        <vaadin-grid-column  path="${c.id}" header="${c.caption}" width="60px"
                             ${columnBodyRenderer(
                                 (row) => {
                                   // @ts-ignore
                                   const actions = row[c.id].actions.map(a => {
                                     return {
                                       ...a,text: a.caption
                                     }
                                   })
                                   return html`
                                     <vaadin-menu-bar
                                         .items=${[{ text: '···', children: actions }]}
                                         theme="tertiary"
                                         .row="${row}"
                                         @item-selected="${this.itemSelected}"
                                     ></vaadin-menu-bar>
                                   `;
                                 },
                                 []
                             )}
        </vaadin-grid-column>
      `;
    }
    return html`
            <vaadin-grid-sort-column path="${c.id}" header="${c.caption}" resizable
                                     width="${c.width}"
            ></vaadin-grid-sort-column>
        `;
  }


  render() {
    // @ts-ignore
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
        ${this.metadata?.searchForm.fields.slice(0,1).map(f => html`
          <vaadin-text-field autofocus id="${f.id}" label="${f.caption}" @change=${this.filterChanged}
                             placeholder="${f.placeholder}"
                             style="flex-grow: 1;"></vaadin-text-field>
        `)}
        <vaadin-button theme="primary" @click="${this.search}">Search</vaadin-button>
      </vaadin-horizontal-layout>

      <vaadin-horizontal-layout style="align-items: baseline;" theme="spacing">
        ${this.metadata?.searchForm.fields.slice(1).map(f => html`
          ${f.type != 'enum'?html`
            <vaadin-text-field id="${f.id}" label="${f.caption}"
                               placeholder="${f.placeholder}"
                               @change=${this.filterChanged}></vaadin-text-field>
          `:''}
          ${f.type == 'enum'?html`
            
            <vaadin-combo-box label="${f.caption}" theme="vertical"
                                @change=${this.filterChanged}
                           id="${f.id}"
                              .items="${f.attributes.filter(a => a.key == 'choice').map(a => a.value)}"
                              item-label-path="key"
                              item-value-path="value"
                              placeholder="${f.placeholder}"
            >
            </vaadin-combo-box>
            
            
          `:''}
        `)}
      </vaadin-horizontal-layout>
      <vaadin-grid id="grid" .dataProvider="${this.dataProvider}">
        <vaadin-grid-selection-column></vaadin-grid-selection-column>

      ${this.metadata?.columns.map(c => {
        return this.getColumn(c)
      })}

        <vaadin-grid-column
            frozen-to-end
            auto-width
            flex-grow="0"
            ${columnBodyRenderer(
                (row) => html`<vaadin-button theme="tertiary-inline" .row="${row}" @click="${this.edit}">Edit</vaadin-button>`,
                []
            )}></vaadin-grid-column>
        
        </vaadin-grid>
      
      <vaadin-horizontal-layout style="align-items: baseline; width: 100%;" theme="spacing">
        <div style=" flex-grow: 1;">${this.message}</div>
        <div style="justify-content: end;">
          <vaadin-menu-bar
              .items=${[{ text: 'Export as ...', children: [
                  {text: 'Excel'},
                  {text: 'Csv'}
                ] }]}
              theme="tertiary"
          ></vaadin-menu-bar>
        </div>
      </vaadin-horizontal-layout>
    `
  }

  static styles = css`
  ${badge}
    
  [theme~='badge'][theme~='warning'] {
    color: #C7BC1D;
    background-color: #FFFCC0;
  }
  [theme~='badge'][theme~='warning'][theme~='primary'] {
    color: #ffffff;
    background-color: #C7BC1D;
  }
  
  .menu {
    /* color: var(--lumo-secondary-text-color); */
    color: grey;
    height: 1.2rem;
  }
  
    :host {

    }

  `

}

declare global {
  interface HTMLElementTagNameMap {
    'mateu-crud': MateuCrud
  }
}
