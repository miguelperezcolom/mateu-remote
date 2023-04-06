import {ActionType} from "./ActionType";
import ConfirmationTexts from "./ConfirmationTexts";

export default interface Action {

    id: string

    caption: string;

    type: ActionType;

    validationRequired: boolean;

    confirmationRequired: boolean;

    confirmationTexts: ConfirmationTexts;

}
