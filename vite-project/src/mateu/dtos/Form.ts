import ViewMetadata from "./ViewMetadata";
import Action from "./Action";
import Section from "./Section";

export default interface Form extends ViewMetadata {

    title: string;

    subtitle: string;

    sections: Section[];

    actions: Action[];

    mainActions: Action[];

}
