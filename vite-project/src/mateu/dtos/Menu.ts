import {MenuType} from "./MenuType";

export default interface Menu {

    type: MenuType;

    caption: string;

    data: string | null;

    submenus: Menu[] | null;

    roles: string[] | null;

    users: string[] | null;

}
