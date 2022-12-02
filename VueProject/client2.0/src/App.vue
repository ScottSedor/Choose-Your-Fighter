<template>
  <div id="app" class="app-view-div">
      <section class="play-section">
          <button class="play-button">PLAY</button>
      </section>
      <nav class="top-nav">
          TOP NAV
        <router-link to="Home">HOME</router-link>
        <router-link to="Fighters">FIGHTERS</router-link>
      </nav>
      <section class="account-section">ACCOUNT/PROFILE</section> 
      <nav class="left-side-deck-nav">LEFT SIDE/DECK NAV</nav>
      <div class="main-content-div">
        <router-view/>
      </div>
    <footer class="footer">2022 Footer with some @ symbols and information</footer>    
  </div>
</template>

<style>
div.app-view-div{
  display: grid;
  grid-template-columns: 1fr 1fr 1fr 1fr 1fr;
  grid-template-rows: 1fr 1fr 1fr 1fr 1fr 1fr 1fr 1fr 1fr;
  grid-template-areas: 
    "play-section top-nav top-nav top-nav account-section"
    "play-section main-content main-content main-content main-content"
    "left-side-deck-nav main-content main-content main-content main-content"
    "left-side-deck-nav main-content main-content main-content main-content"
    "left-side-deck-nav main-content main-content main-content main-content"
    "left-side-deck-nav main-content main-content main-content main-content"
    "left-side-deck-nav main-content main-content main-content main-content"
    "left-side-deck-nav main-content main-content main-content main-content"
    "left-side-deck-nav main-content main-content main-content main-content"
    "footer footer footer footer footer";
  height: 100vh;
  width: 100vw;
  position: absolute;
}
section.play-section{
  grid-area: play-section;
  background-image: linear-gradient(to right, #8a82af, #3e5151d2);
  border: black 2px solid;

}
nav.top-nav{
  grid-area: top-nav;
  background-image: linear-gradient(to right, #decba470, #3E5151);
  border: black 2px solid;

}
section.account-section{
  grid-area: account-section;
  background-image: linear-gradient(to right, #8a82af, #3e5151d2);
  border: black 2px solid;

}
nav.left-side-deck-nav{
  grid-area: left-side-deck-nav;
  background-image: linear-gradient(to right, #decba470, #3E5151);
  border: black 2px solid;

}
.main-content-div{
  grid-area: main-content;
  background-image: linear-gradient(to right, #b3a281, #2b3838);
  border: black 2px solid;

}
footer{
  grid-area: footer;
  background-image: linear-gradient(to right, #DECBA4, #3E5151);
  border: black 2px solid;

}
</style>