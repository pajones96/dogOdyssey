<template>
<!---A more in-depth explanation of the company, me, so on and so forth-->
  <div class="about">
    <h1>About</h1>
    <body>
      <!-- In hindisght maybe this page isn't actually necessary. It could probably be incorporated into Home-->
      <div class="row">
        <div class="column">
          <p class="aboutBlurb">
            {{ bioThingy}}
          </p>
        </div>
      </div>
      
    </body>
  </div>
</template>

<script>
export default {
  name: 'AboutPage',
  data() {
    return {
      bioThingy: 'Augury Solutions is a lean, focused software dev team. It\'s owned and operated by me, Phillip Jones.'
    }
  }
}
</script>

<style>
h1 {
    font-family: 'Courier-New', monospace;
}

body {
  word-wrap: normal;
}

.aboutBlurb {
  margin: 30px;
  border-radius: 10px;
  background-color: rgb(34, 32, 34);
}
</style>