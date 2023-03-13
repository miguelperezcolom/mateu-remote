import {customElement, property} from "lit/decorators.js";
import {html, LitElement} from "lit";
import Component from "./interfaces/Component";
import ValueChangedEvent from "./interfaces/ValueChangedEvent";
import '@vaadin/vaadin-radio-button'
import '@vaadin/radio-group'
import Field from "../../dtos/Field";


@customElement('field-radiobuttons')
export class FieldRadiobuttons extends LitElement implements Component {

    @property()
    required: boolean = false;

    setRequired(required: boolean): void {
        this.required = required;
    }


    setField(field: Field): void {
        this.field = field;
    }

    setLabel(label: string): void {
        this.label = label
    }

    setEnabled(enabled: boolean): void {
        this.enabled = enabled;
    }

    onValueChanged(event: ValueChangedEvent): void {
        console.log(event)
    }
    setValue(value: unknown): void {
        this.value = value as number;
    }

    @property()
    label = '';

    @property()
    name = '';

    @property()
    onChange = (e:Event) => {
        const input = e.target as HTMLInputElement;
        this.onValueChanged({value: input.value})
    }

    @property()
    value: number | undefined;

    @property()
    enabled = true;

    @property()
    field: Field | undefined;


    render() {
        return html`
            <vaadin-radio-group label="${this.label}" theme="vertical"
                                @change=${this.onChange} 
                           name="${this.name}" 
                           id="${this.name}"
                           value=${this.value}
                   ?disabled=${!this.enabled}
                                ?required=${this.required}
            >
                ${this.field!.attributes.filter(a => a.key == 'choice').map(a => html`
                    <vaadin-radio-button value=${a.value.value} label=${a.value.key}></vaadin-radio-button>
                    `)}
            </vaadin-radio-group>
            `
    }

}

declare global {
    interface HTMLElementTagNameMap {
        'field-radiobuttons': FieldRadiobuttons
    }
}

