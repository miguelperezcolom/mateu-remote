import {customElement, property} from "lit/decorators.js";
import {html, LitElement} from "lit";
import Component from "./interfaces/Component";
import ValueChangedEvent from "./interfaces/ValueChangedEvent";
import '@vaadin/number-field'
import Field from "../../dtos/Field";

@customElement('field-double')
export class FieldDouble extends LitElement implements Component {

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
        this.value = value as string;
    }

    @property()
    label = '';

    @property()
    name = '';

    @property()
    enabled = true;

    @property()
    field: Field | undefined;

    @property()
    onChange = (e:Event) => {
        const input = e.target as HTMLInputElement;
        this.onValueChanged({value: input.value})
    }

    @property()
    value = '';


    render() {
        return html`
            <vaadin-number-field
                    label="${this.label}"
                    @change=${this.onChange} 
                           name="${this.name}" 
                           id="${this.name}"
                           value=${this.value}
                    ?disabled=${!this.enabled}
                    ?required=${this.required}
            ></vaadin-number-field>
        `
    }

}

declare global {
    interface HTMLElementTagNameMap {
        'field-double': FieldDouble
    }
}

