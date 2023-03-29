import { LitElement } from 'lit';
import Component from "./mateu/Component";
import Field from './mateu/dtos/Field';
import ValueChangedEvent from './mateu/ValueChangedEvent';
/**
 * An example element.
 *
 * @slot - This element has a slot
 * @csspart button - The button
 */
export declare class MyCustomElement extends LitElement implements Component {
    onValueChanged(event: ValueChangedEvent): void;
    setBaseUrl(value: string): void;
    setLabel(value: string): void;
    setPlaceholder(value: string): void;
    setValue(value: unknown): void;
    setEnabled(enabled: boolean): void;
    setField(field: Field): void;
    setRequired(required: boolean): void;
    label: string;
    /**
     * The number of times the button has been clicked.
     */
    count: number;
    render(): import("lit-html").TemplateResult<1>;
    private _onClick;
    static styles: import("lit").CSSResult;
}
declare global {
    interface HTMLElementTagNameMap {
        'my-custom-element': MyCustomElement;
    }
}
