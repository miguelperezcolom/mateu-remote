import {customElement, property} from "lit/decorators.js";
import {css, html, LitElement} from "lit";
import {connect} from "pwa-helpers";
import {createJourney, fetchItems, getJourneyStatus, getStep, reset, setJourneyType, store} from "./store";
import JourneyType from "../../dtos/JourneyType";
import '../dynamic/dynamic-form'
import '@vaadin/button'
import '@vaadin/horizontal-layout'
import './journey-step'
import Journey from "../../dtos/Journey";
import Step from "../../dtos/Step";
import {nanoid} from "@reduxjs/toolkit";

@customElement('journey-starter')
export class JourneyStarter extends connect(store)(LitElement) {

    @property()
    journeyTypeId: string | undefined = undefined;

    @property()
    loading: boolean = false;

    @property()
    cargando: boolean | undefined = undefined;

    @property()
    error: boolean | undefined = undefined;

    @property()
    tipos:JourneyType[] = [];

    @property()
    journeyType: string | undefined = undefined;

    @property()
    journeyId: string | undefined = undefined;

    @property()
    journey: Journey | undefined = undefined;

    @property()
    stepId: string | undefined = undefined;

    @property()
    step: Step | undefined = undefined;

    @property()
    completed: boolean = false;

    stateChanged(state: any) {
        this.loading = false;
        if (!this.journeyTypeId) this.tipos = state.tiposJourney.journeyTypes;
        this.cargando = state.tiposJourney.loading;
        this.error = state.tiposJourney.error;
        this.journeyType = state.tiposJourney.journeyType;
        this.journeyId = state.tiposJourney.journeyId;
        this.journey = state.tiposJourney.journey;
        this.stepId = state.tiposJourney.stepId;
        this.step = state.tiposJourney.step;
        this.completed = state.tiposJourney.completed;

        //debugger;

        if (!this.tipos) {
            this.loading = true;
            store.dispatch(fetchItems())
        } else if (this.journeyType) {
            if (!this.journeyId) {
                // generate journey id
                // and store journey id
                const journeyId = nanoid();
                // call api to start journey
                this.loading = true;
                store.dispatch(createJourney(this.journeyType, journeyId));
            } else {
                if (!this.journey) {
                    this.loading = true;
                    store.dispatch(getJourneyStatus(this.journeyId));
                } else {
                    if (this.stepId) {
                        if (!this.step) {
                            this.loading = true;
                            store.dispatch(getStep(this.journeyId, this.stepId));
                        } else {

                        }
                    } else {

                    }
                }
            }
        }

    }

    updated(changedProperties: Map<string, unknown>) {
        if (changedProperties.has("journeyTypeId")) {
            store.dispatch(setJourneyType(this.journeyTypeId))
        }

        // No need to call any other method here.
    }

    connectedCallback() {
        super.connectedCallback();
        if (this.journeyTypeId) {
            store.dispatch(setJourneyType(this.journeyTypeId))
        } else {
            store.dispatch(fetchItems())
        }
    }

    startJourney(event: Event) {
        const typeId = (event.target as HTMLElement).getAttribute('typeId');
        store.dispatch(setJourneyType(typeId))
    }

    resetJourney() {
        store.dispatch(reset())
    }

    setLoading(loading: boolean) {
        this.loading = loading;
    }

    render() {
        return html`

            <div class="lds-roller" style="display: ${this.loading?'':'none'};"><div></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div></div>

            <!--
            <div>cargando = ${this.cargando}</div>
            <div>error = ${this.error}</div>
            <div>journey types = ${this.tipos}</div>
            <div>journey type = ${this.journeyType}</div>
            <div>journey id = ${this.journeyId}</div>
            <div>journey = ${this.journey}</div>
            <div>step id = ${this.stepId}</div>
            <div>step = ${this.step}</div>
            <div>completed = ${this.completed}</div>
            -->
        
            ${!this.journeyType?html`

                ${this.tipos?html`
                            <h1>Available journey types</h1>
                            <div>
                                ${this.tipos?.map(s => html`<div class="card-journey-type">
                <vaadin-horizontal-layout theme="spacing padding" style="width: 100%;">
                    <div style="flex-grow: 1"><h2>${s.name}</h2></div>
                    <vaadin-horizontal-layout style="align-items: center;">
                        <vaadin-button theme="primary" @click=${this.startJourney} typeId="${s.id}">Start journey</vaadin-button>
                    </vaadin-horizontal-layout>
                </vaadin-horizontal-layout>
            </div>`)}
                            </div>                     
                        `
                        :html`<h2>No journey type available</h2>`}

                    `:html``}

            ${this.step?html`

                        <journey-step  journeyId="${this.journeyId}" stepId="${this.stepId}" .step=${this.step} .setLoading=${this.setLoading}>
            <vaadin-button theme="secondary" @click=${this.resetJourney}>Back to the beginning</vaadin-button>
                        </journey-step>

                    `:''}
            
            ${this.completed?html`<h1>Done!</h1>

                    <vaadin-button theme="secondary" @click=${this.resetJourney}>+</vaadin-button>
                    
                    `
                    :''}

        <slot></slot>`
    }

    static styles = css`
    :host {
      max-width: 1280px;
      width: 800px;
      margin: 0 auto;
      padding: 2rem;    
    }
    
    .card-journey-type {
        padding-left: 20px;
        padding-right: 20px;
        margin-bottom: 10px;
        border: 1px solid lightgrey;
        border-radius: 7px;
    }
    
    
.lds-roller {
  display: inline-block;
  width: 80px;
  height: 80px;
  position: absolute;
  left: 50%;
  top: 50%;
  -webkit-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
}
.lds-roller div {
  animation: lds-roller 1.2s cubic-bezier(0.5, 0, 0.5, 1) infinite;
  transform-origin: 40px 40px;
}
.lds-roller div:after {
  content: " ";
  display: block;
  position: absolute;
  width: 7px;
  height: 7px;
  border-radius: 50%;
  background: #fcf;
  margin: -4px 0 0 -4px;
}
.lds-roller div:nth-child(1) {
  animation-delay: -0.036s;
}
.lds-roller div:nth-child(1):after {
  top: 63px;
  left: 63px;
}
.lds-roller div:nth-child(2) {
  animation-delay: -0.072s;
}
.lds-roller div:nth-child(2):after {
  top: 68px;
  left: 56px;
}
.lds-roller div:nth-child(3) {
  animation-delay: -0.108s;
}
.lds-roller div:nth-child(3):after {
  top: 71px;
  left: 48px;
}
.lds-roller div:nth-child(4) {
  animation-delay: -0.144s;
}
.lds-roller div:nth-child(4):after {
  top: 72px;
  left: 40px;
}
.lds-roller div:nth-child(5) {
  animation-delay: -0.18s;
}
.lds-roller div:nth-child(5):after {
  top: 71px;
  left: 32px;
}
.lds-roller div:nth-child(6) {
  animation-delay: -0.216s;
}
.lds-roller div:nth-child(6):after {
  top: 68px;
  left: 24px;
}
.lds-roller div:nth-child(7) {
  animation-delay: -0.252s;
}
.lds-roller div:nth-child(7):after {
  top: 63px;
  left: 17px;
}
.lds-roller div:nth-child(8) {
  animation-delay: -0.288s;
}
.lds-roller div:nth-child(8):after {
  top: 56px;
  left: 12px;
}
@keyframes lds-roller {
  0% {
    transform: rotate(0deg);
  }
  100% {
    transform: rotate(360deg);
  }
}



  `
}

declare global {
    interface HTMLElementTagNameMap {
        'journey-starter': JourneyStarter
    }
}

