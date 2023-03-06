import UI from "../dtos/UI";
import json from '../../mocks/ui.json'

export default class MateuClient {

    getUi(): UI {
        return json as unknown as UI;
    }


}
