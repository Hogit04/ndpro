
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PetPetManager from "./components/listers/PetPetCards"
import PetPetDetail from "./components/listers/PetPetDetail"

import FeedFeedingManager from "./components/listers/FeedFeedingCards"
import FeedFeedingDetail from "./components/listers/FeedFeedingDetail"

import StaticStaticManager from "./components/listers/StaticStaticCards"
import StaticStaticDetail from "./components/listers/StaticStaticDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/pets/pets',
                name: 'PetPetManager',
                component: PetPetManager
            },
            {
                path: '/pets/pets/:id',
                name: 'PetPetDetail',
                component: PetPetDetail
            },

            {
                path: '/feeds/feedings',
                name: 'FeedFeedingManager',
                component: FeedFeedingManager
            },
            {
                path: '/feeds/feedings/:id',
                name: 'FeedFeedingDetail',
                component: FeedFeedingDetail
            },

            {
                path: '/statics/statics',
                name: 'StaticStaticManager',
                component: StaticStaticManager
            },
            {
                path: '/statics/statics/:id',
                name: 'StaticStaticDetail',
                component: StaticStaticDetail
            },



    ]
})
