
// index.ts
import { Router } from '@vaadin/router';
const routes = [
    {
        path: '/',
        component: 'landing-component',
        action: async () => {
            //await import('./landing-component');
        },
        children: [
         ]
    },
];

const outlet = document.getElementById('outlet');
export const router = new Router(outlet);
router.setRoutes(routes);
