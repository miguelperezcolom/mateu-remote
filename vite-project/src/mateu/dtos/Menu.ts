import {MenuType} from "./MenuType";

export default interface Menu {

    type: MenuType;

    id: string;

    icon: string;

    caption: string;

    journeyTypeId: string | undefined;

    submenus: Menu[] | null;

}
