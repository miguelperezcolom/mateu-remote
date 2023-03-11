import {customElement, property} from "lit/decorators.js";
import {html, LitElement} from "lit";
import Component from "./interfaces/Component";
import ValueChangedEvent from "./interfaces/ValueChangedEvent";


@customElement('input-number')
export class InputNumber extends LitElement implements Component {
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
    name = '';

    @property()
    enabled = true;

    @property()
    onChange = (e:Event) => {
        const input = e.target as HTMLInputElement;
        this.onValueChanged({value: input.value})
    }

    @property()
    value = '';


    render() {
        return html`
            <p>Label</p>
            <input type="number" 
                           @change=${this.onChange} 
                           name="${this.name}" 
                           id="${this.name}"
                           value=${this.value}
                   disabled=${this.enabled}
        ></input>`
    }

}

declare global {
    interface HTMLElementTagNameMap {
        'input-number': InputNumber
    }
}

