<template>
    <div id="fighterContainer">
        <div class="fighterPortrait" :v-on:click="showForm">
            <h1 class="fighterName"> {{fighter.name}} </h1>
            <img id="worm" :src="fighter.picture" alt="nose">
        </div>
        <!-- abilityArray for clean-up in the future? -->
        <div v-if="showForm">
            <p>{{fighter.genre}}</p>
            <p>{{fighter.ability_1}}</p>
            <p>{{fighter.ability_2}}</p>
            <p>{{fighter.ability_3}}</p>
            <p>{{fighter.description}}</p>    
        </div>
        <!-- abilityArray for clean-up in the future? -->
    </div>
</template>

<script>
    export default {
    name: 'fighter',
    methods: {

    },
    }
</script>