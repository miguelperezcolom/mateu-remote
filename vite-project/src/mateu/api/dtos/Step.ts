import View from "./View";

export default interface Step {

    id: string;
    name: string;
    view: View;
    previousStepId: string;

}
