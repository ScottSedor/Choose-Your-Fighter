import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '@/views/Home.vue'
import Fighters from '@/views/Fighters.vue'
import InsectFighters from '@/components/InsectFighters.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home,
  },
  {
    path: '/fighters',
    name: 'Fighters',
    component: Fighters,
  },
  {
    path: '/insectFighters',
    name: 'InsectFighters',
    component: InsectFighters,
  }

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
