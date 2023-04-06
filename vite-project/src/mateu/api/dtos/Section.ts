import FieldGroup from "./FieldGroup";
import Action from "./Action";

export default interface Section {

    caption: string;

    readOnly: boolean;

    type: string;

    actions: Action[];

    fieldGroups: FieldGroup[];

}
