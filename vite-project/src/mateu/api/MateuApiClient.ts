import UI from "../dtos/UI";
import axios from "axios";
import JourneyType from "../dtos/JourneyType";

export default class MateuApiClient {

    baseUrl = ''

    constructor(baseUrl: string) {
        this.baseUrl = baseUrl
    }

    async fetchUi(uiId: string): Promise<UI> {
        return await axios.get(this.baseUrl + '/uis/' + uiId);
    }

    async fetchJourneyTypes(): Promise<JourneyType[]> {
        return await axios.get(this.baseUrl + '/journey-types');
    }

    async createJourney(journeyType: string, journeyId: string): Promise<void> {
        return await axios.post(this.baseUrl + '/journeys/' + journeyId, {
            journeyType: journeyType
        });
    }

    async fetchJourney(journeyId: string): Promise<UI> {
        return await axios.get(this.baseUrl + '/journeys/' + journeyId);
    }

    async fetchStep(journeyId: string, stepId: string): Promise<UI> {
        return await axios.get(this.baseUrl + '/journeys/' + journeyId + '/steps/' + stepId);
    }


}
