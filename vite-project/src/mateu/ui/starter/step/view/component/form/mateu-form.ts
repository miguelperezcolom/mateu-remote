import {css, html, LitElement, PropertyValues} from 'lit'
import {customElement, property} from 'lit/decorators.js'
import Form from "../../../../../../api/dtos/Form";
import './section/mateu-section'
import '@vaadin/horizontal-layout'
import '@vaadin/vaadin-notification'
import '@vaadin/button'
import '@vaadin/dialog'
import {dialogRenderer, notificationRenderer} from 'lit-vaadin-helpers';
import Rule from "../../../../../../api/dtos/Rule";
import FieldsMap from "./FieldsMap";
import FieldWrapper from "./FieldWrapper";
import Field from "../../../../../../api/dtos/Field";
import {badge} from "@vaadin/vaadin-lumo-styles";
import {BadgeType} from "../../../../../../api/dtos/BadgeType";
import {ActionType} from "../../../../../../api/dtos/ActionType";
import MateuApiClient from "../../../../../../api/MateuApiClient";
import ConfirmationTexts from "../../../../../../api/dtos/ConfirmationTexts";
import {dialogFooterRenderer} from "@vaadin/dialog/lit";

export interface FormElement {

  valueChanged(key: string, value: object): void;

  getValue(key: string): object | undefined;

  getFieldWrapper(field: Field): FieldWrapper | undefined;

}

/**
 * An example element.
 *
 * @slot - This element has a slot
 * @csspart button - The button
 */
@customElement('mateu-form')
export class MateuForm extends LitElement implements FormElement {

  getFieldWrapper(field: Field): FieldWrapper | undefined {
      return this.fieldsMap.map.get(field);
  }

  valueChanged(key: string, value: object): void {
    const obj = {};
    // @ts-ignore
    obj[key] = value;
    this.data = { ...this.data, ...obj}
    this.runRules()
  }

  getValue(key: string): object | undefined {
    // @ts-ignore
    return this.data[key];
  }

  runRules() {
    this.metadata.sections
        .flatMap(s => s.fieldGroups)
        .flatMap(g => g.lines)
        .flatMap(l => l.fields)
        .map(f => this.fieldsMap.map.get(f))
        .filter(f => f)
        .forEach(f => f!.setVisible(true));

    this.rules.forEach(r => this.applyRule(r))
  }

  applyRule(r: Rule) {
    try {
      const applies = eval(this.buildJs(r.filter));
      if (applies) {
        if ("Hide" == r.action) {
          const fieldIds = r.data as string[];
          this.metadata.sections
              .flatMap(s => s.fieldGroups)
              .flatMap(g => g.lines)
              .flatMap(l => l.fields)
              .filter(f => fieldIds?.includes(f.id))
              .map(f => this.fieldsMap.map.get(f))
              .forEach(f => {
                console.log('hidding field', f)
                f!.setVisible(false)
              });
        }
      }
    } catch (e) {

    }
  }

  buildJs(filter: string): string {
    let js = '';
    for (let key in this.data) {
      js += 'const ' + key + ' = this.getValue("' + key + '");';
    }
    js += '' + filter;
    return js
  }

  /**
   * Copy for the read the docs hint.
   */
  @property()
  baseUrl = ''

  @property()
  metadata!: Form

  @property()
  data!: object

  @property()
  journeyTypeId!: string

  @property()
  journeyId!: string

  @property()
  stepId!: string

  @property()
  previousStepId!: string

  @property()
  rules!: Rule[]

  @property()
  notificationOpened: boolean = false;

  @property()
  notificationMessage: string = '';

  @property()
  fieldsMap: FieldsMap = new FieldsMap();

  @property()
  confirmationOpened = false;

  @property()
  closeConfirmation = () => {
    this.confirmationOpened = false
  };

  @property()
  confirmationAction = () => {};

  @property()
  runConfirmedAction = () => {
    this.confirmationAction()
    this.confirmationOpened = false
  };

  @property()
  confirmationTexts: ConfirmationTexts | undefined;



  renderNotification = () => html`${this.notificationMessage}`;

  async updated(changedProperties: PropertyValues) {
    if (changedProperties.has("metadata")) {
      this.setUp()
    }
    // No need to call any other method here.
  }

  setUp() {
    this.metadata.sections
        .flatMap(s => s.fieldGroups)
        .flatMap(g => g.lines)
        .flatMap(l => l.fields)
        .forEach(f => this.fieldsMap.map.set(f, new FieldWrapper(f)))
    setTimeout(() => this.runRules());
  }

  connectedCallback() {
    super.connectedCallback();
    this.setUp()
    addEventListener('edit-field', async (event: Event) => {
      const customEvent = event as CustomEvent
      const fieldId = customEvent.detail.fieldId;
      await new MateuApiClient(this.baseUrl).runStepAction(this.journeyTypeId, this.journeyId, this.stepId,
          '__editfield__' + fieldId, this.data)
    })
  }

  async goBack() {
    this.dispatchEvent(new CustomEvent('back-requested', {
      bubbles: true,
      composed: true,
      detail: this.previousStepId}))
  }

  async runAction(event: Event) {
    const actionId = (event.target as HTMLElement).getAttribute('actionId');
    if (!actionId) {
      console.log('Attribute actionId is missing for ' + event.target)
      return
    }
    const action = this.findAction(actionId!)
    if (!action) {
      console.log('No action with id ' + actionId)
      return
    }
    if (action.validationRequired) {
      const requiredFields = this.metadata.sections
          .flatMap(s => s.fieldGroups
          .flatMap(g => g.lines)
          .flatMap(g => g.fields))
          .filter(f => f.validations?.length > 0);
      // @ts-ignore
      const missingFields = requiredFields.filter(f => !this.data[f.id]);
      if (missingFields.length > 0) {
        const fnames = missingFields.map(f => f.caption);
        this.notificationMessage = 'All mandatory fields must be filled (' + fnames + ')';
        this.notificationOpened = true;
        setTimeout(() => this.notificationOpened = false, 3000)
        return
      }
    }
    if (action.confirmationRequired) {
      this.confirmationAction = async () => {
        await new MateuApiClient(this.baseUrl).runStepAction(this.journeyTypeId, this.journeyId, this.stepId, actionId!, this.data)
      }
      this.confirmationTexts = action.confirmationTexts
      this.confirmationOpened = true;
    } else {
      await new MateuApiClient(this.baseUrl).runStepAction(this.journeyTypeId, this.journeyId, this.stepId, actionId!, this.data)
    }
  }

  private findAction(actionId: string) {
    let action = this.metadata.actions.find(a => a.id == actionId);
    if (!action) action = this.metadata.mainActions.find(a => a.id == actionId);
    return action
  }

  render() {
    return html`
      <div>
        
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
          
        ${this.metadata.status || this.metadata.badges?html`
            <div class="badges">
              ${this.metadata.status?html`<span theme="badge ${this.getThemeForBadgetType(this.metadata.status.type)}">${this.metadata.status.message}</span>`:''}
              ${this.metadata.badges.map(b => html`<span theme="badge ${this.getThemeForBadgetType(b.type)}">${b.message}</span>`)}
            </div>        
        `:''}
        
        ${this.metadata.sections.map(s => html`<mateu-section .section="${s}"
                                                              baseUrl="${this.baseUrl}"
                                                              .formElement=${this}></mateu-section>`)}

        <vaadin-horizontal-layout style="justify-content: end;" theme="spacing">
          <slot></slot>
          ${this.previousStepId?html`
            <vaadin-button theme="secondary" @click=${this.goBack}>Back</vaadin-button>
          `:''}
          ${this.metadata.mainActions.map(a => html`
            <vaadin-button theme="${ActionType.Primary == a.type?'primary':'secondary'}" @click=${this.runAction} actionId=${a.id}>${a.caption}</vaadin-button>
          `)}
        </vaadin-horizontal-layout>

        <vaadin-notification
            .opened=${this.notificationOpened}
            position="bottom-end"
            duration="10000"
            theme="error"
            ${notificationRenderer(this.renderNotification)}
        >${this.notificationMessage}</vaadin-notification>
        
        
        <vaadin-dialog
  header-title="${this.confirmationTexts?.title}"
  .opened="${this.confirmationOpened}"
  ${dialogRenderer(() => html`${this.confirmationTexts?.message}`, [])}
  ${dialogFooterRenderer(
        () => html`
      <vaadin-button theme="primary error" @click="${this.runConfirmedAction}" style="margin-right: auto;">
        ${this.confirmationTexts?.action}
      </vaadin-button>
      <vaadin-button theme="tertiary" @click="${this.closeConfirmation}">Cancel</vaadin-button>
    `,
        []
    )}
></vaadin-dialog>
        
      </div>
    `
  }

  private getThemeForBadgetType(type: BadgeType): string {
    switch (type) {
      case BadgeType.SUCCESS: return 'success';
      case BadgeType.WARNING: return 'warning';
      case BadgeType.DANGER: return 'error';
      case BadgeType.NONE: return 'contrast';
    }
    return '';
  }

  static styles = css`
    ${badge}
    
  [theme~='badge'][theme~='warning'] {
    color: #6f6800;
    background-color: #FFFCC0;
  }
  [theme~='badge'][theme~='warning'][theme~='primary'] {
    color: #ffffff;
    background-color: #6f6800;
  }
  
  .header {
  width: 100%;
  }


    vaadin-button {
        margin-left: 10px;
    }    
    .badges {
      margin-bottom: 10px;
    }
  `
}

declare global {
  interface HTMLElementTagNameMap {
    'mateu-form': MateuForm
  }
}
