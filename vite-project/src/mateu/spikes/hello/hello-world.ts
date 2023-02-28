import {customElement, property} from "lit/decorators.js";
import {css, html, LitElement} from "lit";


@customElement('hello-world')
export class HelloWorld extends LitElement {

    @property()
    name = '';


    render() {
        return html`<h1>Hello ${this.name}</h1><slot></slot>`
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
        'hello-world': HelloWorld
    }
}

