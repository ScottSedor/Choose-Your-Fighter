<template>
    <div class="fighter-list">
        <nav class="genre-nav">GENRE NAV</nav>
        <h1>Displaying FighterList.vue</h1>
        <section>
            <div class="fighter-card-scroll" v-for="fighter in this.$store.state.fighterList" v-bind:key="fighter.id">
                <img src="..\assets\secondLifeNoseWorm.jpg" alt="">
                <p>{{fighter.fighter_name}}</p>
            </div>
        </section>
        <!-- A list displaying current player's fighters will be added here -->
        <h1>Displaying PlayerFighterList</h1>
        <section>
            <div class="fighter-card-scroll" v-for="fighter in this.$store.state.fighterList" v-bind:key="fighter.id">
                <img src="..\assets\secondLifeNoseWorm.jpg" alt="">
                <p>{{fighter.fighter_name}}</p>
            </div>
        </section>
    </div>
</template>

<script>

import fighterService from "@/services/fighterService.js";

export default ({
    name: "fighter-list",
    methods: {
        getFighterList(){
            fighterService.getAllFighters().then(response => {
                this.$store.commit("SET_FIGHTER_LIST", response.data);
            });
        },
    },
    created(){
        this.getFighterList();
    },
    computed: {
    }
})
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
section{
    display: flex;
    overflow: auto;
    margin-left: 5rem;
    margin-right: 5rem;
}
div.fighter-card-scroll{
    grid-area: card-scroll;
    margin: .5rem;
    text-align: center;
    border: black 2px solid;
    background-image: linear-gradient(to right, #DECBA4, #3E5151);
    border-radius: 5px;
}
img{
    height: 10rem;
    width: 10rem;  
}
</style>