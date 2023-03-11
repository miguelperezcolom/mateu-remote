import {css, html, LitElement} from 'lit'
import {customElement, property} from 'lit/decorators.js'
import MateuJourneyClient from "./MateuJourneyClient";
import '../view/mateu-view'
import JourneyType from "../dtos/JourneyType";

/**
 * An example element.
 *
 * @slot - This element has a slot
 * @csspart button - The button
 */
@customElement('mateu-journey-starter')
export class MateuJourneyStarter extends LitElement {
  /**
   * Copy for the read the docs hint.
   */
  @property()
  remoteUrl = ''

  @property()
  journeyTypes: JourneyType[];

  render() {
    return html`
      <div>
        <h1>Journey starter</h1>
        <h2>${this.remoteUrl}</h2>
        <!--
        <h2>${JSON.stringify(this.journeyTypes)}</h2>
        -->
        <select>
          ${this.journeyTypes.map((m) => html`<option value="${m.id}">${m.name}</option>`)}
        </select>
        
        <slot></slot>
      </div>
    `
  }

  constructor() {
    super();
    this.journeyTypes = new MateuJourneyClient().getJourneyTypes();
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
    'mateu-journey-starter': MateuJourneyStarter
  }
}
