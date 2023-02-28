import Validation from "./Validation";

export default interface Field {

    id: string;

    type: string;

    caption: string;

    description: string;

    validations: Validation[];

}
