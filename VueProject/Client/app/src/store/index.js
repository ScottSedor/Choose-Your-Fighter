import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    fighterList: [],
    fighter: {
      fighter_name: '',
      fighter_genre: '',
      ability_1: '',
      ability_2: '',
      ability_3: '',
      description: ''
    }
  },
  mutations: {
    SET_FIGHTER_LIST(state, data){
      console.log(data);
      state.fighterList = data;
    }
  },
  actions: {
  },
  modules: {
  }
})
