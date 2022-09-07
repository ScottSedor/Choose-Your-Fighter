import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
// import firebase from 'firebase';

Vue.config.productionTip = false

// var firebaseConfig = {
//   apiKey: "AIzaSyBGdTAhPfsPiaTs0sIkXdS8Q6AWzY1UlnY",
//   authDomain: "choose-your-fighter-87286.firebaseapp.com",
//   projectId: "choose-your-fighter-87286",
//   storageBucket: "choose-your-fighter-87286.appspot.com",
//   messagingSenderId: "1075102133191",
//   appId: "1:1075102133191:web:3bfd2caf1bd791296447e2"
// };

// firebase.initializeApp(firebaseConfig);

// console.log(firebase);

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')