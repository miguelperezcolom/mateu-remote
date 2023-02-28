import FieldGroup from "./FieldGroup";
import Action from "./Action";

export default interface Section {

    caption: string;

    actions: Action[];

    fieldGroups: FieldGroup[];

}
