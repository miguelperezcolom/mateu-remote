import {css, html, LitElement} from 'lit'
import {customElement, property} from 'lit/decorators.js'
import Form from "../dtos/Form";
import '../section/mateu-section'
import '@vaadin/horizontal-layout'
import '@vaadin/vaadin-notification'
import '@vaadin/button'
import {notificationRenderer} from 'lit-vaadin-helpers';
import {runStepAction, store} from "../spikes/starter/store";
import Rule from "../dtos/Rule";
import FieldsMap from "./FieldsMap";
import FieldWrapper from "./FieldWrapper";
import Field from "../dtos/Field";
import {badge} from "@vaadin/vaadin-lumo-styles";
import {BadgeType} from "../dtos/BadgeType";
import {ActionType} from "../dtos/ActionType";

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
        .flatMap(g => g.fields).map(f => this.fieldsMap.map.get(f))
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
              .flatMap(g => g.fields)
              .filter(f => fieldIds.includes(f.id))
              .map(f => this.fieldsMap.map.get(f))
              .forEach(f => f!.setVisible(false));
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
  metadata!: Form

  @property()
  data!: object

  @property()
  journeyId!: string

  @property()
  stepId!: string

  @property()
  rules!: Rule[]

  @property()
  notificationOpened: boolean = false;

  @property()
  notificationMessage: string = '';

  @property()
  fieldsMap: FieldsMap = new FieldsMap();


  renderNotification = () => html`${this.notificationMessage}`;


  @property()
  setLoading!: (loading: boolean) => void;

  connectedCallback() {
    super.connectedCallback();
    this.metadata.sections.flatMap(s => s.fieldGroups.flatMap(g => g.fields))
        .forEach(f => this.fieldsMap.map.set(f, new FieldWrapper(f)))
    setTimeout(() => this.runRules());
  }

  runAction(event: Event) {
    const requiredFields = this.metadata.sections.flatMap(s => s.fieldGroups.flatMap(g => g.fields))
        .filter(f => f.validations.length > 0);
    // @ts-ignore
    const missingFields = requiredFields.filter(f => !this.data[f.id]);
    if (missingFields.length > 0) {
      const fnames = missingFields.map(f => f.caption);
      this.notificationMessage = 'All mandatory fields must be filled (' + fnames + ')';
      this.notificationOpened = true;
    } else {
      const actionId = (event.target as HTMLElement).getAttribute('actionId');
      this.setLoading(true)
      store.dispatch(runStepAction(this.journeyId, this.stepId, actionId!, this.data))
    }
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
        
        ${this.metadata.sections.map(s => html`<mateu-section .section="${s}" .formElement=${this}></mateu-section>`)}

        <vaadin-horizontal-layout style="justify-content: end;" theme="spacing">
          <slot></slot>
          ${this.metadata.mainActions.map(a => html`
            <vaadin-button theme="${ActionType.Primary == a.type?'primary':'secondary'}" @click=${this.runAction} actionId=${a.id}>${a.caption}</vaadin-button>
          `)}
        </vaadin-horizontal-layout>

        <vaadin-notification
            .opened=${this.notificationOpened}
            position="bottom-end"
            duration="5000"
            theme="error"
            ${notificationRenderer(this.renderNotification)}
        >${this.notificationMessage}</vaadin-notification>
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
    color: #C7BC1D;
    background-color: #FFFCC0;
  }
  [theme~='badge'][theme~='warning'][theme~='primary'] {
    color: #ffffff;
    background-color: #C7BC1D;
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
