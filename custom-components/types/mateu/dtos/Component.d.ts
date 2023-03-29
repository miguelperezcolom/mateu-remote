import ViewMetadata from "./ViewMetadata";
import Rule from "./Rule";
export default interface Component {
    metadata: ViewMetadata;
    data: Map<string, object>;
    rules: Rule[];
}
