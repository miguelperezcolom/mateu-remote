import {ActionType} from "./ActionType";

export default interface Action {

    id: string

    caption: string;

    type: ActionType;

    validationRequired: boolean;

}
