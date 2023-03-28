import {customElement, property} from "lit/decorators.js";
import {css, html, LitElement} from "lit";
import Component from "./interfaces/Component";
import ValueChangedEvent from "./interfaces/ValueChangedEvent";
import '@vaadin/text-area'
import Field from "../../../../../../../../../../api/dtos/Field";


@customElement('field-readonly')
export class FieldReadonly extends LitElement implements Component {

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

    setPlaceholder(): void {
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

    setBaseUrl(value: string): void {
        this.baseUrl = value
    }

    @property()
    baseUrl = '';


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

    firstUpdated() {
        const textArea = this.shadowRoot!.querySelector('textarea');
        textArea?.parentElement?.removeChild(textArea);
    }


    render() {
        return html`
            <vaadin-text-area
                label="${this.label}"
                @change=${this.onChange} 
                           name="${this.name}" 
                           id="${this.name}"
                           value=${this.value}
                   ?disabled=${!this.enabled}
                ?required=${this.required}
                readonly
            ><div class="content" slot="textarea">${this.value}</div></vaadin-text-area>
            `
    }


    static styles = css`
        .content {
            width: 95%;
            min-height: unset;
        }
        vaadin-text-area {
            width: 100%;
        }
    `

}

declare global {
    interface HTMLElementTagNameMap {
        'field-readonly': FieldReadonly
    }
}

