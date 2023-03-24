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

    async fetchUi(uiId: string): Promise<UI> {
        return await axios.get(this.baseUrl + '/uis/' + uiId)
            .then((response) => response.data)
    }

    async fetchJourneyTypes(): Promise<JourneyType[]> {
        return await axios.get(this.baseUrl + '/journey-types')
            .then((response) => response.data)
    }

    async createJourney(journeyType: string, journeyId: string): Promise<void> {
        return await axios.post(this.baseUrl + '/journeys/' + journeyId, {
                journeyTypeId: journeyType,
                contextData: []
            }
        )
    }

    async fetchJourney(journeyId: string): Promise<Journey> {
        return await axios.get(this.baseUrl + '/journeys/' + journeyId)
            .then((response) => response.data)

    }

    async fetchStep(journeyId: string, stepId: string): Promise<Step> {
        return await axios.get(this.baseUrl + '/journeys/' + journeyId + '/steps/' + stepId)
            .then((response) => response.data)

    }

    async runStepAction(journeyId: string, stepId: string, actionId: string, data: unknown): Promise<void> {
        return await axios.post(this.baseUrl + '/journeys/' + journeyId + '/steps/' + stepId
            + '/' + actionId, {
            data: data
            }
        )
    }

}
