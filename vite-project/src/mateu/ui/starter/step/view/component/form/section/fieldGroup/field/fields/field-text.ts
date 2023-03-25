import {customElement, property} from "lit/decorators.js";
import {html, css, LitElement} from "lit";
import Component from "./interfaces/Component";
import ValueChangedEvent from "./interfaces/ValueChangedEvent";
import '@vaadin/vaadin-text-field'
import Field from "../../../../../../../../../../api/dtos/Field";


@customElement('field-text')
export class FieldText extends LitElement implements Component {

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
        this.value = value as string;
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
        this.onValueChanged({value: input.value})
    }

    @property()
    value: string | undefined;

    @property()
    enabled = true;

    @property()
    field: Field | undefined;


    render() {
        return html`
            <vaadin-text-field
                label="${this.label}"
                @change=${this.onChange} 
                           name="${this.name}" 
                           id="${this.name}"
                           value=${this.value}
                   ?disabled=${!this.enabled}
                ?required=${this.required}
                placeholder="${this.placeholder}"
            ></vaadin-text-field>
            `
    }

    static styles = css`
        vaadin-text-field {
            width: 100%;
        }
    `

}

declare global {
    interface HTMLElementTagNameMap {
        'field-text': FieldText
    }
}

