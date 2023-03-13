import ViewMetadata from "./ViewMetadata";
import Action from "./Action";
import Section from "./Section";
import Badge from "./Badge";

export default interface Form extends ViewMetadata {

    title: string;

    subtitle: string;

    badges: Badge[];

    sections: Section[];

    actions: Action[];

    mainActions: Action[];

}
