
// index.ts
import {Context, Router} from '@vaadin/router';
import {store} from "./store";
import {loadUi} from "./slices/ui";

const outlet = document.getElementById('outlet');
export const router = new Router(outlet);

router.setRoutes([{
    path: '/router-and-redux.html',
    name: 'home',
    component: 'router-and-redux',
    action: async (context: Context) => {
        console.log('hola', context.route)
        await import('./router-and-redux');
    },
}])


// @ts-ignore
store.dispatch(loadUi('com.example.demoremote.ui.DemoApp'))
