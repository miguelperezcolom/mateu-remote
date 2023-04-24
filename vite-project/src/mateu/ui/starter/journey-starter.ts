import {customElement, property, state} from "lit/decorators.js";
import {css, html, LitElement} from "lit";
import JourneyType from "../../api/dtos/JourneyType";
import '@vaadin/button'
import '@vaadin/horizontal-layout'
import './step/journey-step'
import {notificationRenderer} from 'lit-vaadin-helpers';
import Journey from "../../api/dtos/Journey";
import Step from "../../api/dtos/Step";
import {nanoid} from "@reduxjs/toolkit";
import MateuApiClient from "../../api/MateuApiClient";

@customElement('journey-starter')
export class JourneyStarter extends LitElement {

    @property()
    baseUrl = ''

    @property()
    journeyTypeId: string | undefined = undefined;

    @property()
    loading: boolean = false;

    @property()
    activeCalls = 0;

    @property()
    cargando: boolean | undefined = undefined;

    @property()
    error: boolean | undefined = undefined;

    @property()
    tipos:JourneyType[] = [];

    @property()
    journeyId: string | undefined = undefined;

    @property()
    journey: Journey | undefined = undefined;

    @property()
    stepId: string | undefined = undefined;

    @property()
    previousStepId: string | undefined = undefined;

    @property()
    step: Step | undefined = undefined;

    @property()
    completed: boolean = false;

    @state()
    version = ''

    @property()
    notificationOpened: boolean = false;

    @property()
    notificationMessage: string = '';

    renderNotification = () => html`${this.notificationMessage}`;

    onBackendCalled = () => {
        this.activeCalls++;
        this.loading = this.activeCalls > 0
    }

    onBackendSucceeded = () => {
        this.activeCalls--;
        this.loading = this.activeCalls > 0
    }

    onBackendFailed = (event: Event) => {
        this.activeCalls--;
        this.loading = this.activeCalls > 0
        const ce = event as CustomEvent
        this.notificationMessage = `${ce.detail.reason.code} ${ce.detail.reason.message}`;
        if (ce.detail.reason.response?.data) {
            this.notificationMessage = `${ce.detail.reason.response.data}`
        }
        this.notificationOpened = true;
        setTimeout(() => this.notificationOpened = false, 3000)
    }


    onBackRequested = async (event: Event) => {
        const ce = event as CustomEvent
        this.stepId = ce.detail;
        this.step = await new MateuApiClient(this.baseUrl)
            .fetchStep(this.journeyTypeId!, this.journeyId!, this.stepId!)
        this.previousStepId = this.step.previousStepId
    }


    async connectedCallback() {
        super.connectedCallback();

        console.log('connected', 'journey starter');

        window.addEventListener('backend-called-event', this.onBackendCalled)
        window.addEventListener('backend-succeeded-event', this.onBackendSucceeded)
        window.addEventListener('backend-failed-event', this.onBackendFailed)
        window.addEventListener('action-called', this.onActionCalled)
        window.addEventListener('back-requested', this.onBackRequested)

        if (this.journeyTypeId) {
            this.journeyId = nanoid()
            await new MateuApiClient(this.baseUrl).createJourney(this.journeyTypeId!, this.journeyId)
            this.journey = await new MateuApiClient(this.baseUrl).fetchJourney(this.journeyTypeId, this.journeyId!)
            this.stepId = this.journey.currentStepId
            this.step = await new MateuApiClient(this.baseUrl).fetchStep(this.journeyTypeId, this.journeyId, this.stepId)
            this.previousStepId = this.step.previousStepId
        } else {
            this.tipos = await new MateuApiClient(this.baseUrl).fetchJourneyTypes()
        }
    }

    disconnectedCallback() {
        super.disconnectedCallback();

        console.log('disconnected', 'journey starter');

        window.removeEventListener('backend-called-event', this.onBackendCalled)
        window.removeEventListener('backend-succeeded-event', this.onBackendSucceeded)
        window.removeEventListener('backend-failed-event', this.onBackendFailed)
        window.removeEventListener('action-called', this.onActionCalled)
        window.removeEventListener('back-requested', this.onBackRequested)

    }

    async updated(changedProperties: Map<string, unknown>) {
        if (changedProperties.has("journeyTypeId") && changedProperties.get("journeyTypeId")) {
            const journeyId = nanoid()
            await new MateuApiClient(this.baseUrl).createJourney(this.journeyTypeId!, journeyId)
            this.journey = await new MateuApiClient(this.baseUrl).fetchJourney(this.journeyTypeId!, journeyId)
            this.stepId = this.journey.currentStepId
            this.step = await new MateuApiClient(this.baseUrl).fetchStep(this.journeyTypeId!, journeyId, this.stepId)
            this.journeyId = journeyId
            this.previousStepId = this.step.previousStepId
        }
    }

    async startJourney(event: Event) {
        // @ts-ignore
        this.journeyTypeId = (event.target as HTMLElement).getAttribute('typeId');
        this.journeyId = nanoid()
        console.log('start journey event received', this.journeyTypeId)
        await new MateuApiClient(this.baseUrl).createJourney(this.journeyTypeId!, this.journeyId)
        this.journey = await new MateuApiClient(this.baseUrl).fetchJourney(this.journeyTypeId!, this.journeyId)
        this.stepId = this.journey.currentStepId
        this.previousStepId = undefined
        this.step = await new MateuApiClient(this.baseUrl).fetchStep(this.journeyTypeId!, this.journeyId, this.stepId)
        this.previousStepId = this.step.previousStepId
    }

    resetJourney() {
        this.journeyId = undefined
        this.journeyTypeId = undefined
    }

    onActionCalled = async () => {
        this.journey = await new MateuApiClient(this.baseUrl).fetchJourney(this.journeyTypeId!, this.journeyId!)
        this.stepId = this.journey.currentStepId
        this.step = await new MateuApiClient(this.baseUrl).fetchStep(this.journeyTypeId!, this.journeyId!, this.stepId)
        this.previousStepId = this.step.previousStepId
    }

    render() {
        return html`

            <div class="lds-roller" style="display: ${this.loading?'':'none'};"><div></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div></div>

            ${!this.journeyTypeId?html`

                ${this.tipos?html`
                            <h1>Available journey types</h1>
                            <div>
                                ${this.tipos?.map(s => html`<div class="card-journey-type">
                <vaadin-horizontal-layout theme="spacing padding" style="width: 100%;">
                    <div style="flex-grow: 1"><h2>${s.name}</h2></div>
                    <vaadin-horizontal-layout style="align-items: center;">
                        <vaadin-button theme="primary" @click=${this.startJourney} 
                                       typeId="${s.id}">Start journey</vaadin-button>
                    </vaadin-horizontal-layout>
                </vaadin-horizontal-layout>
            </div>`)}
                            </div>                     
                        `
                        :html`<h2>No journey type available</h2>`}

                    `:html``}

            ${this.step?html`
                        <journey-step
                                id="step"
                                journeyTypeId="${this.journeyTypeId}"
                                journeyId="${this.journeyId}" 
                                       stepId="${this.stepId}" 
                                       .step=${this.step} 
                                       baseUrl="${this.baseUrl}"
                                version="${this.version}"
                        >
            ${this.tipos.length > 0?html`<vaadin-button theme="secondary" 
                                                        @click=${this.resetJourney}
                                                >Back to the beginning</vaadin-button>`:''}
                        </journey-step>

                    `:html``}
            
            ${this.completed?html`<h1>Done!</h1>

                    <vaadin-button theme="secondary" @click=${this.resetJourney}>+</vaadin-button>
                    
                    `
                    :''}


            <vaadin-notification
                    .opened=${this.notificationOpened}
                    position="bottom-end"
                    duration="10000"
                    theme="error"
                    ${notificationRenderer(this.renderNotification)}
            >${this.notificationMessage}</vaadin-notification>
            
        <slot></slot>`
    }

    static styles = css`
    :host {
      width: 90%;
      max-width: 800px;
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

