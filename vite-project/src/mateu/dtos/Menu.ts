import {MenuType} from "./MenuType";

export default interface Menu {

    type: MenuType;

    icon: string;

    caption: string;

    journeyTypeId: string | undefined;

    submenus: Menu[] | null;

}
