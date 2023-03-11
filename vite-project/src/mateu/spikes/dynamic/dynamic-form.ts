import {customElement, property} from "lit/decorators.js";
import {css, html, LitElement} from "lit";
import './input-text';
import './input-number';
import Component from "./interfaces/Component";

@customElement('dynamic-form')
export class DynamicForm extends LitElement {

    @property()
    avalue = '5';

    @property()
    componentName = 'input-text';

    onChange = (e:Event) => {
        const input = e.target as HTMLInputElement;
        console.log('dynamic-form', input.value)
    }

    onSelect = (e:Event) => {
        const input = e.target as HTMLInputElement;
        this.changeInput(input.value);
    }

    changeInput(cname: string):void {
        this.componentName = cname;
        const element = document.createElement(this.componentName);
        const container = this.shadowRoot!.getElementById('cxx')!;
        const component = element as unknown as Component;
        component.onValueChanged = (e) => {
            console.log('new value', e.value)
        }
        component.setValue('1111')
        container.appendChild(element);
    }


    render() {
        return html`<h1>Hello ${this.avalue}</h1>
        
        <div>
            <select name="campo" id="campo" @change=${this.onSelect}>
                <option value="input-text">texto</option>
                <option value="input-number">número</option>
            </select>
        </div>
        
        <div id="cxx"></div>
        
        <slot></slot>`
    }

    static styles = css`
    :host {
      max-width: 1280px;
      margin: 0 auto;
      padding: 2rem;
      text-align: center;      
    }
  `
}

declare global {
    interface HTMLElementTagNameMap {
        'dynamic-form': DynamicForm
    }
}

