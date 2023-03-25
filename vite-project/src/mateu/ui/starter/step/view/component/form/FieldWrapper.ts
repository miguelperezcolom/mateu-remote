import Field from "../../../../../../api/dtos/Field";

export default class FieldWrapper {

    field: Field;

    constructor(field:Field) {
        this.field = field;
    }

    visible: boolean = true;

    enabled: boolean = true;

    container: HTMLElement | undefined = undefined;

    setVisible(visible: boolean) {
        this.visible = visible;
        this.container?.setAttribute('style', 'display: ' + (this.visible?'block':'none'));
    }

}
