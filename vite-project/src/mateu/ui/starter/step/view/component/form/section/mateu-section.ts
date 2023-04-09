import { LitElement, css, html } from 'lit'
import { customElement, property } from 'lit/decorators.js'
import Section from "../../../../../../../api/dtos/Section";
import './fieldGroup/mateu-fieldgroup'
import {FormElement} from "../mateu-form";
import Field from "../../../../../../../api/dtos/Field";
import Value from "../../../../../../../api/dtos/Value";

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
  baseUrl!: string

  @property()
  section!: Section

  @property()
  formElement!: FormElement;

  getPaintableValue(field: Field, value: unknown) {
      if (field.type == 'ExternalReference[]') {
          const values = value as Value[]
          return values.map(v => v.key).join(', ');
      }
      // @ts-ignore
      return (value && value.key)?value.key:value;
  }

  render() {
    return html`
      <div class="mateu-section ${this.section.type}">

        ${this.section.caption?html`<h2>${this.section.caption}</h2>`:''}
        
        ${this.section.readOnly?html`
          ${this.section.fieldGroups.map(g => html`
              ${g.caption?html`<h3>${g.caption}</h3>`:''}
              <div class="table">
              ${g.lines.flatMap(l => l.fields).map(f => html`<div class="field"><div class="cell caption">${f.caption}</div>
                  <div class="cell value">${this.getPaintableValue(f, this.formElement.getValue(f.id))}</div></div>`)}
              </div>
          </div>`)}
        `:html`
          ${this.section.fieldGroups.map(s => html`<mateu-fieldgroup 
                  .fieldGroup="${s}" 
                  .formElement=${this.formElement}
                  baseUrl="${this.baseUrl}"
          ></mateu-fieldgroup>`)}
        `}
        
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
      padding-top: 14px;   
    }
    
    h2 {
      margin-bottom: 0px;
    }
    
    h3 {
      margin-bottom: 0px;
    }
    
    .mateu-section.Transparent {
      border: unset;
    }
    
    .mateu-section:has(h1) {
      padding-top: 0px;
    }
    
    
    mateu-fieldgroup {
        margin-top: 3rem;
    }
    
    mateu-fieldgroup:nth-of-type(1) {
        margin-top: unset;
    }
    
    
    .mateu-fieldgroup.readonly {
        margin-top: 3rem;
    }
    
    .mateu-fieldgroup.readonly:nth-of-type(1) {
        margin-top: unset;
    }
    
    .table {
        display: grid;
        grid-template-columns: repeat(auto-fill, calc(50% - 20px));
        grid-column-gap: 20px;
    }
    
    .field {
        border-bottom: 1px dashed lightgrey;
        display: flex;
    }

    .field:nth-child(n+3)  {
    /*
        border-top: 1px solid lightgrey;
        */
    }
    
    .cell {
        min-height: 2rem;
        padding-top: 5px;
    }
    
    .caption {
        font-weight: 800;
        font-size: var(--lumo-font-size-s);
        color: var(--lumo-secondary-text-color);
    }
    
    .value {
        text-align: right;
        flex: auto;
    }


  `
}

declare global {
  interface HTMLElementTagNameMap {
    'mateu-section': MateuSection
  }
}
