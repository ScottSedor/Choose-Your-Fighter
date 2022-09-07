<template>
    <div class="fighter-selection">
            <!-- <div class="fighter-selection-container">
                <h2 class="fighter-genre-h2">GENRE NAME H2</h2>
                    <section class="fighter-portrait-selection-scroll-section">
                        <div class="fighter-portrait-container-div">
                            <h3 class="fighter-name-h3">CHARACTER NAME</h3>
                        </div>
                <h1 class="deck-name-h1">DECK NAME</h1>
                        <div class="my-fighter-portrait-scroll-div">
                            <h3 class="fighter-name-h3">CHARACTER NAME</h3>
                        </div>
                    </section>
            </div> -->   
    </div>
</template>

<script>
import FighterList from './FighterList.vue'

export default {
    name: 'fighter-selection',
   props: {FighterList} 
}
</script>

<style scoped>
    section.play-section{
        background-color: aqua;
    }
    nav.top-nav{
        background-color: aquamarine;
    }
    nav.genre-nav{
        background-color: azure;
    }
    nav.left-side-deck-nav{
        background-color: beige;
    }
    div.fighter-selection-container{
        background-color: blanchedalmond;
    }
    footer{
        background-color: rgb(43, 226, 119);
    }

</style>