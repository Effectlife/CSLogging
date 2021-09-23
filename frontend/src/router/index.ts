import {createRouter, createWebHistory, RouteRecordRaw} from 'vue-router'
import Home from '../views/Home.vue'
import Service from '../views/Service.vue'
import Bootstrap from '../views/Bootstrap.vue'

const routes: Array<RouteRecordRaw> = [
    {path: '/', component: Home},
    {path: '/callservice', component: Service},
    {path: '/bootstrap', component: Bootstrap},
    // otherwise redirect to home
    {path: '/:pathMatch(.*)*', redirect: '/'}
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL), // uris without hashes #, see https://router.vuejs.org/guide/essentials/history-mode.html#html5-history-mode
    routes
});


export default router;