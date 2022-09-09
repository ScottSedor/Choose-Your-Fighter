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
      <nav class="genre-nav">GENRE NAV</nav>
      <nav class="left-side-deck-nav">LEFT SIDE/DECK NAV</nav>
      <div class="main-content-div">
        <router-view />
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
    "play-section genre-nav genre-nav genre-nav genre-nav"
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
    background-color: aqua;
}
nav.top-nav{
  grid-area: top-nav;
  background-color: aquamarine;
}
section.account-section{
  grid-area: account-section;
  background-color: rgb(238, 80, 80);
}
nav.genre-nav{
  grid-area: genre-nav;
  background-color: rgb(247, 123, 247);
}
nav.left-side-deck-nav{
  grid-area: left-side-deck-nav;
  background-color: rgb(240, 240, 128);
}
.main-content-div{
    grid-area: main-content;
    background-color: blanchedalmond;
}
footer{
  grid-area: footer;
  background-color: rgb(43, 226, 119);
}
</style>