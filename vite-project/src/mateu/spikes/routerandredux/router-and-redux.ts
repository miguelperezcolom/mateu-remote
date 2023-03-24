import {customElement, property, state} from "lit/decorators.js";
import {css, html, LitElement, TemplateResult} from "lit";
import {router} from "./router";
import {Route} from "@vaadin/router";
import {connect} from "pwa-helpers";
import {store} from "./store";
import UI from "../../api/dtos/UI";
import Menu from "../../api/dtos/Menu";


@customElement('router-and-redux')
export class RouterAndRedux extends connect(store)(LitElement) {

    @property()
    name: string | undefined = '';

    location = router.location;

    @state()
    routes = [] as Route[];

    @state()
    uiId = ''

    @state()
    ui = {} as UI

    stateChanged(state: any) {
        console.log('stage changed', state)
        this.updateUi(state)
    }

    private updateUi(state: any) {
        if (this.uiId == state.ui.uiId) {
            console.log('ui remains unchanged', this.uiId, state.ui.uiId)
            return;
        }
        console.log('ui has changed', this.uiId, state.ui.uiId)
        this.ui = state.ui.ui;
        this.uiId = state.ui.uiId
        // @ts-ignore
        this.routes = router.getRoutes();
    }

    connectedCallback() {
        super.connectedCallback();
        console.log('connected')
        this.name = router.location.route?.name;
    }



    render() {
        return html`
        
        <div class="container">
            <h1>Hello ${this.name}</h1>
            <h1>UI ${this.uiId}</h1>
            <h1>App ${this.ui.title}</h1>
            <div class="data">
                <div>baseUrl: ${this.location.baseUrl}</div>
                <div>pathname: ${this.location.pathname}</div>
                <div>search: ${this.location.search}</div>
                <div>redirectFrom: ${this.location.redirectFrom}</div>
            </div>
            <div class="data">
                ${this.paintMenu(this.ui.menu)}
            </div>
        </div>
        
        <slot></slot>`
    }

    static styles = css`
    :host {
        width: 100%;
        display: flex;
    }

    .container {
      max-width: 1280px;
      margin: 0 auto;
      padding: 2rem;
      text-align: center;
    }

    .data {
        text-align: left;
    }
  `

    private paintMenu(menu: Menu[]): TemplateResult {
        return html`<ul>
            ${menu?.map(r => r.submenus?html`
                <li>
                    ${r.caption}
                        <ul>
                            ${this.paintMenu(r.submenus)}
                        </ul>
                </li>
                    `
                    :html`
                    <li><a href="${router.urlForName(r.journeyTypeId!)}">${r.caption}</a></li>
                    `)}
        </ul>`;
    }
}

declare global {
    interface HTMLElementTagNameMap {
        'router-and-redux': RouterAndRedux
    }
}

