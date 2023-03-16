import {customElement, property} from "lit/decorators.js";
import {html, LitElement} from "lit";
import Component from "./interfaces/Component";
import ValueChangedEvent from "./interfaces/ValueChangedEvent";
import '@polymer/paper-toggle-button'
import '@vaadin/input-container'
import Field from "../../dtos/Field";


@customElement('field-toggle')
export class FieldToggle extends LitElement implements Component {

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

    setPlaceholder(placeholder: string): void {
        this.placeholder = placeholder
    }

    setEnabled(enabled: boolean): void {
        this.enabled = enabled;
    }

    onValueChanged(event: ValueChangedEvent): void {
        console.log(event)
    }
    setValue(value: unknown): void {
        console.log('toggle value set', value)
        this.value = value as boolean;
    }

    @property()
    label = '';

    @property()
    placeholder = '';

    @property()
    name = '';

    @property()
    onChange = (e:Event) => {
        const input = e.target as HTMLInputElement;
        console.log('toggle changed', input.checked)
        this.onValueChanged({value: input.checked})
    }

    @property()
    value: boolean | undefined;

    @property()
    enabled = true;

    @property()
    field: Field | undefined;

    render() {
        return html`
            <div class="vaadin-field-container">
                <vaadin-horizontal-layout>
                    <h5 style="flex-grow: 1;">${this.label}</h5>
                    <paper-toggle-button id="mitoggle"
                                         ?disabled=${!this.enabled}
                                         ?checked=${this.value}
                                         @change=${this.onChange}></paper-toggle-button>
                </vaadin-horizontal-layout>
            </div>
            `
    }


}

declare global {
    interface HTMLElementTagNameMap {
        'field-toggle': FieldToggle
    }
}

