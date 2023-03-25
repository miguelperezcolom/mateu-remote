import UI from "./dtos/UI";
import axios from "axios";
import JourneyType from "./dtos/JourneyType";
import Journey from "./dtos/Journey";
import Step from "./dtos/Step";

export default class MateuApiClient {

    baseUrl = ''

    constructor(baseUrl: string) {
        this.baseUrl = baseUrl
    }

    async wrap<T>(call: Promise<T>): Promise<T> {
        dispatchEvent(new CustomEvent('backend-called-event', {
            bubbles: true,
            composed: true,
            detail: {
            }
        }))
        return call.then(response => {
            dispatchEvent(new CustomEvent('backend-succeeded-event', {
                bubbles: true,
                composed: true,
                detail: {
                }
            }))
            return response
        }).catch((reason) => {
            dispatchEvent(new CustomEvent('backend-failed-event', {
                bubbles: true,
                composed: true,
                detail: {
                    reason: reason
                }
            }))
            return reason
        })
    }

    async fetchUi(uiId: string): Promise<UI> {
        return await this.wrap<UI>(axios.get(this.baseUrl + '/uis/' + uiId)
            .then((response) => response.data))
    }

    async fetchJourneyTypes(): Promise<JourneyType[]> {
        return await this.wrap<JourneyType[]>(axios.get(this.baseUrl + '/journey-types')
            .then((response) => response.data))
    }

    async createJourney(journeyType: string, journeyId: string): Promise<void> {
        return await this.wrap<void>(axios.post(this.baseUrl + '/journeys/' + journeyId,
            {
                    journeyTypeId: journeyType,
                    contextData: []
                }
            ))
    }

    async fetchJourney(journeyId: string): Promise<Journey> {
        return await this.wrap<Journey>(axios.get(this.baseUrl + '/journeys/' + journeyId)
                .then((response) => response.data))
    }

    async fetchStep(journeyId: string, stepId: string): Promise<Step> {
        return await this.wrap<Step>(axios.get(this.baseUrl + '/journeys/' +
            journeyId + '/steps/' + stepId)
                .then((response) => response.data))
    }

    async runStepAction(journeyId: string, stepId: string, actionId: string,
                        data: unknown): Promise<void> {
        return await this.wrap<void>(axios.post(this.baseUrl + '/journeys/' +
            journeyId + '/steps/' + stepId
                + '/' + actionId, {
                    data: data
                }
            )).then(response => {
            dispatchEvent(new CustomEvent('action-called', {
                bubbles: true,
                composed: true,
                detail: {
                }
            }))
            return response;
        })
    }

    async fetchRows(journeyId: string, stepId: string,
                    page: number, pageSize: number,
                    sortOrders: string, filters: string
                    ): Promise<any[]> {
        return await this.wrap<any[]>(axios.get(this.baseUrl + "/journeys/" + journeyId +
            "/steps/" + stepId +
            "/lists/main/rows?page=" + page + "&page_size=" + pageSize +
            "&ordering=" + sortOrders + "&filters=" + filters)
            .then((response) => response.data))
    }

    async fetchCount(journeyId: string, stepId: string,
                     filters: string
    ): Promise<number> {
        return await this.wrap<number>(axios.get(this.baseUrl + "/journeys/" + journeyId
            + "/steps/" + stepId +
            "/lists/main/count?filters=" + filters)
            .then((response) => response.data))
    }

}
