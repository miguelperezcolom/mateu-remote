import ValueChangedEvent from "./ValueChangedEvent";
import Field from "../../../dtos/Field";

export default interface Component {

    onValueChanged(event: ValueChangedEvent):void;

    setLabel(value: string): void;

    setValue(value: unknown): void;

    setEnabled(enabled: boolean): void;

    setField(field: Field): void;

    setRequired(required: boolean): void;

}
