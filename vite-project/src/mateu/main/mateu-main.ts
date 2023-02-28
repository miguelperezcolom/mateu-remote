import { LitElement, css, html } from 'lit'
import { customElement, property } from 'lit/decorators.js'
import MateuClient from "./MateuClient";
import UI from "../dtos/UI";
import '../view/mateu-view'

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
        
        <mateu-view .metadata="${this.ui.home.metadata}" .data="${this.ui.home.data}"></mateu-view>
        
        <slot></slot>
      </div>
    `
  }

  constructor() {
    super();
    console.log('ui', JSON.stringify(new MateuClient().getUi()));
    this.ui = new MateuClient().getUi();
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
