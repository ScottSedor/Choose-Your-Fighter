import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    // genre status(boolean) will flip depending on genre.  this will allow us to filter card list by genre
    fighterGenre: [
      {
        insect: false,
        cat: false,
        abyssal: false
      }
    ],
    fighterList: [],
    fighter: {
      fighter_name: '',
      fighter_genre: '',
      ability_1: '',
      ability_2: '',
      ability_3: '',
      description: '',
      avatar: ''
    }
  },
  mutations: {
    SET_FIGHTER_LIST(state, data){
      console.log(data);
      state.fighterList = data;
    },
  },
  actions: {
  },
  modules: {
  }
})
