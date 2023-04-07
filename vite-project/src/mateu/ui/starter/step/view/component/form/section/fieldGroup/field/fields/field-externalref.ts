import {customElement, property, state} from "lit/decorators.js";
import {css, html, LitElement, PropertyValues} from "lit";
import Component from "./interfaces/Component";
import ValueChangedEvent from "./interfaces/ValueChangedEvent";
import '@vaadin/combo-box'
import Field from "../../../../../../../../../../api/dtos/Field";
import Value from "../../../../../../../../../../api/dtos/Value";
import {ComboBox, ComboBoxDataProvider, ComboBoxDataProviderParams} from "@vaadin/combo-box";
import Attribute from "../../../../../../../../../../api/dtos/Attribute";


@customElement('field-externalref')
export class FieldExternalRef extends LitElement implements Component {

    @property()
    required: boolean = false;

    setRequired(required: boolean): void {
        this.required = required;
    }

    setPlaceholder(placeholder: string): void {
        this.placeholder = placeholder
    }

    setField(field: Field): void {
        this.field = field;
        this._attributes = field.attributes;
    }

    setLabel(label: string): void {
        this.label = label
    }

    setEnabled(enabled: boolean): void {
        this.enabled = enabled;
    }

    onValueChanged(event: ValueChangedEvent): void {
        this.dispatchEvent(new CustomEvent('filterchanged', {
            bubbles: true,
            composed: true,
            detail: event}))
    }
    setValue(value: unknown): void {
        this.value = value as Value;
    }

    setBaseUrl(value: string): void {
        this.baseUrl = value
    }

    @property()
    baseUrl = '';

    @property()
    label = '';

    @property()
    placeholder = '';

    @property()
    name = '';

    @property()
    onChange = (e:Event) => {
        const comboBox = e.target as ComboBox;
        this.onValueChanged({fieldId: this.id, value: comboBox.selectedItem})
    }

    @property()
    value: Value | undefined;

    @property()
    enabled = true;

    @property()
    field: Field | undefined;

    @property()
    _attributes: Attribute[] | undefined;

    @state()
    dataProvider: ComboBoxDataProvider<Value> = async (params, callback) => {
        const itemProvider = this._attributes?.filter(a => a.key == 'itemprovider')[0].value;
        const API = `${this.baseUrl}/itemproviders/${itemProvider}/items`;
        const { filter, page, pageSize } = params;

        const count = await this.getCount(params)

        const res = await fetch(`${API}?page=${page}&page_size=${pageSize}&search_text=${filter}`);
        if (res.ok) {
            const result = await res.json();
            callback(result, count);
        }
    };

    private async getCount(params: ComboBoxDataProviderParams):Promise<number> {
        const itemProvider = this._attributes?.filter(a => a.key == 'itemprovider')[0].value;
        const API = `${this.baseUrl}/itemproviders/${itemProvider}/count`;
        const { filter } = params;

        const res = await fetch(`${API}?search_text=${filter}`);
        if (res.ok) {
            const size = parseInt(await res.text());
            return size;
        }
        return 0;
    }

    protected firstUpdated(_changedProperties: PropertyValues) {
        const comboBox = this.shadowRoot?.querySelector('vaadin-combo-box') as ComboBox;
        comboBox.dataProvider = this.dataProvider;
        comboBox.selectedItem = this.value;
    }



    render() {
        return html`
            <vaadin-combo-box label="${this.label}" theme="vertical"
                                @change=${this.onChange} 
                           name="${this.name}" 
                           id="${this.id}"
                           value=${this.value}
                   ?disabled=${!this.enabled}
                                ?required=${this.required}
                              item-label-path="key"
                              placeholder="${this.placeholder}"
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
        'field-externalref': FieldExternalRef
    }
}

