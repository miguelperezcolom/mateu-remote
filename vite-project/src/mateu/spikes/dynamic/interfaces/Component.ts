import ValueChangedEvent from "./ValueChangedEvent";

export default interface Component {

    onValueChanged(event: ValueChangedEvent):void;

    setValue(value: unknown): void;

    setEnabled(enabled: boolean): void;

}