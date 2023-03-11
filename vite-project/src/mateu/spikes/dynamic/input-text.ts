import {customElement, property} from "lit/decorators.js";
import {html, LitElement} from "lit";
import Component from "./interfaces/Component";
import ValueChangedEvent from "./interfaces/ValueChangedEvent";


@customElement('input-text')
export class InputText extends LitElement implements Component {

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
    name = '';

    @property()
    onChange = (e:Event) => {
        const input = e.target as HTMLInputElement;
        console.log('input-text', input.value)
    }

    @property()
    value: number | undefined;

    @property()
    enabled = true;


    render() {
        return html`
            <p>Label</p>
            <input type="text" 
                           @change=${this.onChange} 
                           name="${this.name}" 
                           id="${this.name}"
                           value=${this.value}
                   ?disabled=${!this.enabled}
        ></input>`
    }

}

declare global {
    interface HTMLElementTagNameMap {
        'input-text': InputText
    }
}

