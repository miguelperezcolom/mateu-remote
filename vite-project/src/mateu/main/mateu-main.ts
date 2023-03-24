import { LitElement, css, html } from 'lit'
import { customElement, property } from 'lit/decorators.js'
import MateuClient from "./MateuClient";
import UI from "../api/dtos/UI";
import '../view/mateu-view'
import View from "../api/dtos/View";

/**
 * An example element.
 *
 * @slot - This element has a slot
 * @csspart button - The button
 */
@customElement('mateu-main')
export class MateuMain extends LitElement {
  /**
   * Copy for the read the docs hint.
   */
  @property()
  remoteUrl = ''

  @property()
  ui: UI;

  @property()
  view: View;


  render() {
    return html`
      <div>
        <h1>${this.ui.title}</h1>
        <h2>${this.ui.subtitle}</h2>
        <h2>${this.remoteUrl}</h2>
        <h2>${JSON.stringify(this.ui)}</h2>
        <nav>
          <ul>
          ${this.ui.menu.map((m) => html`<li>${m.caption}</li>`)}
          </ul>
        </nav>

        
        <mateu-view .metadata="${this.view.components[0].metadata}" .data="${this.view.components[0].data}"></mateu-view>
        
        <slot></slot>
      </div>
    `
  }

  constructor() {
    super();
    this.ui = new MateuClient().getUi();
    this.view = {components: []}
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
    'mateu-main': MateuMain
  }
}
