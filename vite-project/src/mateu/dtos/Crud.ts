import ViewMetadata from "./ViewMetadata";
import SearchForm from "./SearchForm";
import Column from "./Column";
import Form from "./Form";
import Action from "./Action";

export default interface Crud extends ViewMetadata {

    title: string;

    subtitle: string;

    searchForm: SearchForm;

    columns: Column[];

    newItemForm: Form;

    detailForm: Form;

    actions: Action[];

}
