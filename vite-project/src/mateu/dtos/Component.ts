import ViewMetadata from "./ViewMetadata";

export default interface Component {

    metadata: ViewMetadata;
    data: object;
    rules: object[];

}
