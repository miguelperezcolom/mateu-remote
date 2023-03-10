import {customElement, property} from "lit/decorators.js";
import {html, css, LitElement} from "lit";
import Component from "./interfaces/Component";
import ValueChangedEvent from "./interfaces/ValueChangedEvent";
import '@vaadin/combo-box'
import Field from "../../dtos/Field";
import Value from "../../dtos/Value";


@customElement('field-combobox')
export class FieldCombobox extends LitElement implements Component {

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

    items: Value[] | undefined;

    connectedCallback() {
        super.connectedCallback();
        this.items = this.field!.attributes.filter(a => a.key == 'choice').map(a => a.value);
    }


    render() {
        return html`
            <vaadin-combo-box label="${this.label}" theme="vertical"
                                @change=${this.onChange} 
                           name="${this.name}" 
                           id="${this.name}"
                           value=${this.value}
                   ?disabled=${!this.enabled}
                                ?required=${this.required}
                              .items="${this.items}"
                              item-label-path="key"
                              item-value-path="value"
            >
            </vaadin-combo-box>
            `
    }

    static styles = css`
        vaadin-combo-box {
            width: 100%;
        }
    `


}

declare global {
    interface HTMLElementTagNameMap {
        'field-combobox': FieldCombobox
    }
}

