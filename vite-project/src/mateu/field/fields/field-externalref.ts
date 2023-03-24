import {customElement, property, state} from "lit/decorators.js";
import {css, html, LitElement, PropertyValues} from "lit";
import Component from "./interfaces/Component";
import ValueChangedEvent from "./interfaces/ValueChangedEvent";
import '@vaadin/combo-box'
import Field from "../../api/dtos/Field";
import Value from "../../api/dtos/Value";
import {ComboBox, ComboBoxDataProvider, ComboBoxDataProviderParams} from "@vaadin/combo-box";


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
        this.value = value as Value;
    }

    @property()
    label = '';

    @property()
    placeholder = '';

    @property()
    name = '';

    @property()
    onChange = (e:Event) => {
        const comboBox = e.target as ComboBox;
        this.onValueChanged({value: comboBox.selectedItem})
    }

    @property()
    value: Value | undefined;

    @property()
    enabled = true;

    @property()
    field: Field | undefined;

    @state()
    dataProvider: ComboBoxDataProvider<Value> = async (params, callback) => {
        const baseURL = window.__MATEU_REMOTE_BASE_URL__?window.__MATEU_REMOTE_BASE_URL__:"https://remote.mateu.io/mateu/v1";
        const itemProvider = this.field?.attributes.filter(a => a.key == 'itemprovider')[0].value;
        const API = `${baseURL}/itemproviders/${itemProvider}/items`;
        const { filter, page, pageSize } = params;

        const count = await this.getCount(params)

        const res = await fetch(`${API}?page=${page}&page_size=${pageSize}&search_text=${filter}`);
        if (res.ok) {
            const result = await res.json();
            callback(result, count);
        }
    };

    private async getCount(params: ComboBoxDataProviderParams):Promise<number> {
        const baseURL = window.__MATEU_REMOTE_BASE_URL__?window.__MATEU_REMOTE_BASE_URL__:"https://remote.mateu.io/mateu/v1";
        const itemProvider = this.field?.attributes.filter(a => a.key == 'itemprovider')[0].value;
        const API = `${baseURL}/itemproviders/${itemProvider}/count`;
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
                           id="${this.name}"
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

