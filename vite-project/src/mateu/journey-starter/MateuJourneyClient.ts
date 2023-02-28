import jsontypes from '../../mocks/journey-types.json'
import jsonjourney from '../../mocks/journey.json'
import jsonstep from '../../mocks/step.json'
import JourneyType from "../dtos/JourneyType";
import Step from "../dtos/Step";
import Journey from "../dtos/Journey";

export default class MateuJourneyClient {

    getJourneyTypes(): JourneyType[] {
        return jsontypes as JourneyType[];
    }

    getJourney(): Journey {
        return jsonjourney as Journey;
    }

    getStep(): Step {
        return jsonstep as Step;
    }

}
