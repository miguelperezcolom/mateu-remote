import {css, html, LitElement} from 'lit'
import {customElement, property} from 'lit/decorators.js'
import "@vaadin/horizontal-layout";
import "@vaadin/button";
import "@vaadin/icons";
import "@vaadin/icon";
import {connect} from "pwa-helpers";
import {runStepAction, store} from "../spikes/starter/store";
import {Button} from "@vaadin/button";
import Result from "../dtos/Result";
import {ResultType} from "../dtos/ResultType";

/**
 * An example element.
 *
 * @slot - This element has a slot
 * @csspart button - The button
 */
@customElement('mateu-result')
export class MateuResult extends connect(store)(LitElement) {
  /**
   * Copy for the read the docs hint.
   */

  @property()
  journeyId!: string

  @property()
  stepId!: string

  @property()
  metadata!: Result

  @property()
  data: object | undefined;

  connectedCallback() {
    super.connectedCallback();
  }

  runAction(e:Event) {
    const button = e.currentTarget as Button;
    store.dispatch(runStepAction(this.journeyId, this.stepId, button.getAttribute('actionid')!, {}))
  }

  getIcon(resultType: ResultType): string {
    switch (resultType) {
      case ResultType.Success: return 'vaadin:check-circle';
      case ResultType.Info: return 'vaadin:info-circle';
      case ResultType.Warning: return 'vaadin:warning';
      case ResultType.Error: return 'lumo:error';
    }
    return 'vaadin:question';
  }

  getClass(resultType: ResultType): string {
    switch (resultType) {
      case ResultType.Success: return 'success';
      case ResultType.Info: return 'info';
      case ResultType.Warning: return 'warning';
      case ResultType.Error: return 'error';
    }
    return '';
  }

  render() {
    return html`

      <vaadin-horizontal-layout class="header">
        <div>
          <h1>Result</h1>
        </div>
      </vaadin-horizontal-layout>

      <div class="mateu-section">
      
      <vaadin-vertical-layout style="align-items: center;">
        <vaadin-icon icon="${this.getIcon(this.metadata.resultType)}" class="${this.getClass(this.metadata.resultType)}" size="64"></vaadin-icon>
        <div><h3>${this.metadata.message}</h3></div>
        
        ${this.metadata.interestingLinks.length > 0?html`

          <div class="youmayalso">
            <h5>You may also be interested in:</h5>

            <vaadin-vertical-layout style="align-items: center;">
            
            ${this.metadata.interestingLinks.map(l => html`

    <div class="youmayalsolink"><vaadin-button theme="tertiary" @click=${this.runAction} actionId=${l.value}>${l.description}</vaadin-button></div>                   

`)}
            </vaadin-vertical-layout>
          </div>
          
        `:''}
        
      </vaadin-vertical-layout>
      
      </div>
      
      <vaadin-horizontal-layout style="justify-content: end;" theme="spacing">
        <slot></slot>
        <vaadin-button theme="primary" @click=${this.runAction} actionId=${this.metadata.nowTo.value}>${this.metadata.nowTo.description}</vaadin-button>
      </vaadin-horizontal-layout>
    `
  }

  static styles = css`
    :host {

    }
    
    .mateu-section {
      text-align: left;
      border: 1px solid lightgrey;
      border-radius: 8px;
      padding: 2rem;  
      margin-bottom: 16px;       
      padding-top: 47px;
    }
    
    .mateu-section:has(h1) {
      padding-top: 0px;
    }
    
    .success {
      color: green;
    }

    .info {
      color: cyan;
    }

    .warning {
      color: orange;
    }

    .error {
      color: red;
    }

  `

}

declare global {
  interface HTMLElementTagNameMap {
    'mateu-result': MateuResult
  }
}
