import Validation from "./Validation";
import Attribute from "./Attribute";

export default interface Field {

    id: string;

    type: string;

    caption: string;

    description: string;

    validations: Validation[];

    attributes: Attribute[];

}
