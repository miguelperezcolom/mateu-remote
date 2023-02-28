import Menu from "./Menu";
import View from "./View";

export default interface UI {

    title: string;

    subtitle: string;

    menu: Menu[];

    home: View;

}
