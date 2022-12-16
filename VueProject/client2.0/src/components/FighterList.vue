<template>
    <div class="fighter-list">
        <nav class="genre-nav">GENRE NAV
            <section class="fighter-genres">
                <button class="cat-button" @click="setGenreAll()">
                    <span></span>
                    <span></span>
                    <span></span>
                    <span></span>
                        All
                </button>
                <button class="insect-button" @click="setGenreInsect()">
                    <span></span>
                    <span></span>
                    <span></span>
                    <span></span>
                        Insect
                </button>
                <button class="cat-button" @click="setGenreCat()">
                    <span></span>
                    <span></span>
                    <span></span>
                    <span></span>
                        Cat
                </button>
                <button class="abyssal-button" @click="setGenreAbyssal()">
                    <span></span>
                    <span></span>
                    <span></span>
                    <span></span>
                        Abyssal
                </button>
            </section>
        </nav>
        <h1>Displaying FighterList.vue</h1>
        <section class="scroll">
            <div class="fighter-card-scroll" v-for="fighter in filterFighterList" v-bind:key="fighter.id">
                <img src="..\assets\secondLifeNoseWorm.jpg" alt="">
                <p>{{fighter.fighter_name}}</p>
                <div class="fighter-modal">
                    <button
                        type="button"
                        class="fighter-details-button"
                        @click="showModal"
                        >
                        Fighter Details
                    </button>
                        <fighter-modal
                            v-show="isModalVisible"
                            @close="closeModal"
                        />
                </div>
            </div>
        </section>

        <!-- A list displaying current player's fighters will be added here -->

        <!-- <h1>Displaying PlayerFighterList</h1> -->
        <!-- <section class="scroll">
            <div class="fighter-card-scroll" v-for="fighter in filterFighterList" v-bind:key="fighter.id">
                <img src="..\assets\secondLifeNoseWorm.jpg" alt="">
                <p>{{fighter.fighter_name}}</p>
                <div class="fighter-modal">
                    <button
                        type="button"
                        class="fighter-details-button"
                        @click="showModal"
                        >
                        Fighter Details
                    </button>
                        <fighter-modal
                            v-show="isModalVisible"
                            @close="closeModal"
                        />
                </div>
            </div>
        </section> -->
    </div>
</template>

<script>

import fighterService from "@/services/fighterService.js";
import FighterModal from './FighterModal.vue';


export default {
    name: "fighter-list",
    components:{
        FighterModal,
    },
    data(){
        return{
            fighterList: [],
            fighter_genre: '',
            isModalVisible: false,
        }
    },
    methods: {
        // getFighterAvatar(){
        //     if(this.fighter.id == fighter.id){
        //         fighter.avatar = 
        //     }
        // },
        showModal() {
            this.isModalVisible = true;
        },
        closeModal() {
            this.isModalVisible = false;
        },
        setGenreInsect(){
            this.fighter_genre = 'insect';
        },
                setGenreAll(){
            this.fighter_genre = '';
        },
                setGenreCat(){
            this.fighter_genre = 'cat';
        },
                setGenreAbyssal(){
            this.fighter_genre = 'abyssal';
        },
        getFighterList(){
            fighterService.getAllFighters().then(response => {
                // this.$store.commit("SET_FIGHTER_LIST", response.data);
                this.fighterList = response.data;
            });
        },
    },
    created(){
         this.getFighterList();
    },
    computed: {
        //********************************data includes many unwanted spaces in strings*******************************************
        filterFighterList(){
            // console.log("filtering")
            return this.fighterList.filter((element) => {
                // console.log(element.fighter_genre, this.fighter_genre);
                if(this.fighter_genre == ''){
                    return true;
                }
                else {
                    return (element.fighter_genre == this.fighter_genre);
                }
            })
        }
    }
}    

</script>

<style scoped>
/* div.fighter-list{
    display: grid;
    grid-template-columns: 1fr 1fr 1fr 1fr 1fr;
    grid-template-rows: 1fr 1fr 1fr 1fr 1fr 1fr 1fr 1fr 1fr;
    grid-template-areas: "card-scroll card-scroll card-scroll card-scroll card-scroll"
    "card-scroll card-scroll card-scroll card-scroll card-scroll"
    "card-scroll card-scroll card-scroll card-scroll card-scroll"
    "card-scroll card-scroll card-scroll card-scroll card-scroll"
    "card-scroll card-scroll card-scroll card-scroll card-scroll"
    "card-scroll card-scroll card-scroll card-scroll card-scroll"
    "card-scroll card-scroll card-scroll card-scroll card-scroll"
    "card-scroll card-scroll card-scroll card-scroll card-scroll"
    "card-scroll card-scroll card-scroll card-scroll card-scroll"
    "card-scroll card-scroll card-scroll card-scroll card-scroll";
} */
h1{
    text-align: center;

}
nav.genre-nav{
    height: 10vh;
    background-image: linear-gradient(to right, #decba470, #3E5151);
    border-bottom: black 4px solid;
}
section.scroll{
    display: flex;
    overflow: auto;
    margin-left: 4rem;
    margin-right: 4rem;
    margin-top: 5rem;
}
section.fighter-genres{
    display: flex;
    justify-content: space-evenly;
}
div.fighter-card-scroll{
    /* grid-area: card-scroll; */
    margin: .5rem;
    text-align: center;
    border: black 2px solid;
    background-image: linear-gradient(to right, #ddd6c8, #3E5151);
    border-radius: 5px;
}
img{
    height: 10rem;
    width: 10rem;  
}

/* All button styling ------------------------------------------------------------------------------------------- */


button.all-button {
    position: relative;
    display: inline-block;
    padding: 5px 9px;
    color: #a2ee84;
    text-transform: uppercase;
    letter-spacing: 4px;
    text-decoration: none;
    font-size: 24px;
    /* overflow: hidden; */
    transition: 0.2s;
    background: rgb(54, 54, 49);
    /* border: .5px solid rgb(177, 177, 177); */
    border-radius: 5px;
}
button.all-button:hover {
    color: #fffd8c;
    background: #344137;
    box-shadow: 0 0 10px #b4f321, 0 0 40px #98f321, 0 0 80px #21f344;
    transition-delay: 0.40s;
}
button.all-button span {
    position: absolute;
    display: block;
}
button.all-button span:nth-child(1) {
    top: 0;
    left: -0%;
    width: 100%;
    height: 2px;
    background: linear-gradient(90deg, transparent, #f5f1d1c4);
}
button.all-button:hover span:nth-child(1) {
    left: 25%;
    transition: 0.25s;
}
button.all-button span:nth-child(3) {
    bottom: -2%;
    right: -10%;
    width: 100%;
    height: 2px;
    background: linear-gradient(270deg, transparent, #c0fa75af);
}
button.all-button:hover span:nth-child(3) {
    right: 25%;
    transition: 0.5s;
    transition-delay: 0.25s;
}
button.all-button span:nth-child(2) {
    top: -5%;
    right: -2%;
    width: 2px;
    height: 100%;
    background: linear-gradient(180deg, transparent, #77c76dbb);
}
button.all-button:hover span:nth-child(2) {
    top: 25%;
    transition: 0.25s;
    transition-delay: 0.25s;
}
button.all-button span:nth-child(4) {
    bottom: -0%;
    left: 0;
    width: 2px;
    height: 100%;
    background: linear-gradient(360deg, transparent, #e2e7e29f);
}
button.all-button:hover span:nth-child(4) {
    bottom: 25%;
    transition: 0.25s;
    transition-delay: 0.25s;
}

/* insect button styling ------------------------------------------------------------------------------------------- */

button.insect-button {
    position: relative;
    display: inline-block;
    padding: 5px 9px;
    color: #a2ee84;
    text-transform: uppercase;
    letter-spacing: 4px;
    text-decoration: none;
    font-size: 24px;
    /* overflow: hidden; */
    transition: 0.2s;
    background: rgb(54, 54, 49);
    /* border: .5px solid rgb(177, 177, 177); */
    border-radius: 5px;
}
button.insect-button:hover {
    color: #fffd8c;
    background: #344137;
    box-shadow: 0 0 10px #b4f321, 0 0 40px #98f321, 0 0 80px #21f344;
    transition-delay: 0.40s;
}
button.insect-button span {
    position: absolute;
    display: block;
}
button.insect-button span:nth-child(1) {
    top: 0;
    left: -0%;
    width: 100%;
    height: 2px;
    background: linear-gradient(90deg, transparent, #f5f1d1c4);
}
button.insect-button:hover span:nth-child(1) {
    left: 25%;
    transition: 0.25s;
}
button.insect-button span:nth-child(3) {
    bottom: -2%;
    right: -10%;
    width: 100%;
    height: 2px;
    background: linear-gradient(270deg, transparent, #c0fa75af);
}
button.insect-button:hover span:nth-child(3) {
    right: 25%;
    transition: 0.5s;
    transition-delay: 0.25s;
}
button.insect-button span:nth-child(2) {
    top: -5%;
    right: -2%;
    width: 2px;
    height: 100%;
    background: linear-gradient(180deg, transparent, #77c76dbb);
}
button.insect-button:hover span:nth-child(2) {
    top: 25%;
    transition: 0.25s;
    transition-delay: 0.25s;
}
button.insect-button span:nth-child(4) {
    bottom: -0%;
    left: 0;
    width: 2px;
    height: 100%;
    background: linear-gradient(360deg, transparent, #ecf3ed9f);
}
button.insect-button:hover span:nth-child(4) {
    bottom: 25%;
    transition: 0.25s;
    transition-delay: 0.25s;
}


/* cat button styling ------------------------------------------------------------------------------------------- */

button.cat-button {
    position: relative;
    display: inline-block;
    padding: 5px 9px;
    color: #a2ee84;
    text-transform: uppercase;
    letter-spacing: 4px;
    text-decoration: none;
    font-size: 24px;
    /* overflow: hidden; */
    transition: 0.2s;
    background: rgb(54, 54, 49);
    /* border: .5px solid rgb(177, 177, 177); */
    border-radius: 5px;
}
button.cat-button:hover {
    color: #fffd8c;
    background: #344137;
    box-shadow: 0 0 10px #b4f321, 0 0 40px #98f321, 0 0 80px #21f344;
    transition-delay: 0.40s;
}
button.cat-button span {
    position: absolute;
    display: block;
}
button.cat-button span:nth-child(1) {
    top: 0;
    left: -0%;
    width: 100%;
    height: 2px;
    background: linear-gradient(90deg, transparent, #f5f1d1c4);
}
button.cat-button:hover span:nth-child(1) {
    left: 25%;
    transition: 0.25s;
}
button.cat-button span:nth-child(3) {
    bottom: -2%;
    right: -10%;
    width: 100%;
    height: 2px;
    background: linear-gradient(270deg, transparent, #c0fa75af);
}
button.cat-button:hover span:nth-child(3) {
    right: 25%;
    transition: 0.5s;
    transition-delay: 0.25s;
}
button.cat-button span:nth-child(2) {
    top: -5%;
    right: -2%;
    width: 2px;
    height: 100%;
    background: linear-gradient(180deg, transparent, #77c76dbb);
}
button.cat-button:hover span:nth-child(2) {
    top: 25%;
    transition: 0.25s;
    transition-delay: 0.25s;
}
button.cat-button span:nth-child(4) {
    bottom: -0%;
    left: 0;
    width: 2px;
    height: 100%;
    background: linear-gradient(360deg, transparent, #e2e7e29f);
}
button.cat-button:hover span:nth-child(4) {
    bottom: 25%;
    transition: 0.25s;
    transition-delay: 0.25s;
}

/* Abyssal button styling ------------------------------------------------------------------------------------------- */

button.abyssal-button {
    position: relative;
    display: inline-block;
    padding: 5px 9px;
    color: #a2ee84;
    text-transform: uppercase;
    letter-spacing: 4px;
    text-decoration: none;
    font-size: 24px;
    /* overflow: hidden; */
    transition: 0.2s;
    background: rgb(54, 54, 49);
    /* border: .5px solid rgb(177, 177, 177); */
    border-radius: 5px;
}
button.abyssal-button:hover {
    color: #fffd8c;
    background: #344137;
    box-shadow: 0 0 10px #b4f321, 0 0 40px #98f321, 0 0 80px #21f344;
    transition-delay: 0.45s;
}
button.abyssal-button span {
    position: absolute;
    display: block;
}
button.abyssal-button span:nth-child(1) {
    top: 0;
    left: -0%;
    width: 100%;
    height: 2px;
    background: linear-gradient(90deg, transparent, #f5f1d1c4);
}
button.abyssal-button:hover span:nth-child(1) {
    left: 25%;
    transition: 0.25s;
    box-shadow: 0 0 10px #b4f321, 0 0 40px #98f321, 0 0 80px #21f344;
}
button.abyssal-button span:nth-child(3) {
    bottom: -2%;
    right: -10%;
    width: 100%;
    height: 2px;
    background: linear-gradient(270deg, transparent, #c0fa75af);
}
button.abyssal-button:hover span:nth-child(3) {
    right: 25%;
    transition: 0.5s;
    transition-delay: 0.25s;
    box-shadow: 0 0 10px #b4f321, 0 0 40px #98f321, 0 0 80px #21f344;
}
button.abyssal-button span:nth-child(2) {
    top: -5%;
    right: -2%;
    width: 2px;
    height: 100%;
    background: linear-gradient(180deg, transparent, #77c76dbb);
}
button.abyssal-button:hover span:nth-child(2) {
    top: 25%;
    transition: 0.25s;
    transition-delay: 0.25s;
    box-shadow: 0 0 10px #b4f321, 0 0 40px #98f321, 0 0 80px #21f344;
}
button.abyssal-button span:nth-child(4) {
    bottom: -0%;
    left: 0;
    width: 2px;
    height: 100%;
    background: linear-gradient(360deg, transparent, #e2e7e29f);
}
button.abyssal-button:hover span:nth-child(4) {
    bottom: 25%;
    transition: 0.25s;
    transition-delay: 0.25s;
    box-shadow: 0 0 10px #b4f321, 0 0 40px #98f321, 0 0 80px #21f344;
}

/* Fighter-Details button styling ------------------------------------------------------------------------------------------- */

button.fighter-details-button {
    position: relative;
    display: inline-block;
    padding: 5px 9px;
    color: #a2ee84;
    text-transform: uppercase;
    letter-spacing: 4px;
    text-decoration: none;
    font-size: 12px;
    /* overflow: hidden; */
    transition: 0.2s;
    background: rgb(54, 54, 49);
    /* border: .5px solid rgb(177, 177, 177); */
    border-radius: 5px;
}
button.fighter-details-button:hover {
    color: #fffd8c;
    background: #344137;
    box-shadow: 0 0 10px #b4f321, 0 0 40px #98f321, 0 0 80px #21f344;
    /* transition-delay: 0.40s; */
}
button.fighter-details-button span {
    position: absolute;
    display: block;
}
button.fighter-details-button span:nth-child(1) {
    top: 0;
    left: -0%;
    width: 100%;
    height: 2px;
    background: linear-gradient(90deg, transparent, #f5f1d1c4);
}
button.fighter-details-button:hover span:nth-child(1) {
    left: 25%;
    transition: 0.25s;
}
button.fighter-details-button span:nth-child(3) {
    bottom: -2%;
    right: -10%;
    width: 100%;
    height: 2px;
    background: linear-gradient(270deg, transparent, #c0fa75af);
}
button.fighter-details-button:hover span:nth-child(3) {
    right: 25%;
    transition: 0.5s;
    /* transition-delay: 0.25s; */
}
button.fighter-details-button span:nth-child(2) {
    top: -5%;
    right: -2%;
    width: 2px;
    height: 100%;
    background: linear-gradient(180deg, transparent, #77c76dbb);
}
button.fighter-details-button:hover span:nth-child(2) {
    top: 25%;
    transition: 0.25s;
    /* transition-delay: 0.25s; */
}
button.fighter-details-button span:nth-child(4) {
    bottom: -0%;
    left: 0;
    width: 2px;
    height: 100%;
    background: linear-gradient(360deg, transparent, #e2e7e29f);
}
button.fighter-details-button:hover span:nth-child(4) {
    bottom: 25%;
    transition: 0.25s;
    /* transition-delay: 0.25s; */
}

</style>