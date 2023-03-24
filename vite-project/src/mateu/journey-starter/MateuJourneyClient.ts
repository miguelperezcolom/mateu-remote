import jsontypes from '../../mocks/journey-types.json'
import jsonjourney from '../../mocks/journey.json'
import jsonstep from '../../mocks/step1.json'
import JourneyType from "../api/dtos/JourneyType";
import Step from "../api/dtos/Step";
import Journey from "../api/dtos/Journey";

export default class MateuJourneyClient {

    getJourneyTypes(): JourneyType[] {
        return jsontypes as JourneyType[];
    }

    getJourney(): Journey {
        return jsonjourney as Journey;
    }

    getStep(): Step {
        return jsonstep as unknown as Step;
    }

}
