<template>
<!---A more in-depth explanation of the company, me, so on and so forth-->
  <div class="about">
    <h1>About</h1>
    <body>
      <!-- In hindisght maybe this page isn't actually necessary. It could probably be incorporated into Home-->
      <div class="row">
        <div class="column side"></div>
        <div class="column middle">
          <p class="aboutBlurb">
            <br>
            {{ bioThingy}}
            <br>
            <br>
          </p>
        </div>
        <div class="column side"></div>
      </div>
      
    </body>
  </div>
</template>

<script>
export default {
  name: 'AboutPage',
  data() {
    return {
      bioThingy: "Augury Solutions is a lean, focused software dev team. It's owned and operated by me, Phillip Jones. I leared how to code in Python at age 13. I'm 26 now so I've been coding for legitimately half my life now."
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

.row {
  display: -webkit-flex;
  display: flex;
}
.column-middle {
  text-align: center;
  -webkit-flex: 2;
  -ms-flex: 2;
  flex: 2;
}
.column.side {
  text-align: center;
   -webkit-flex: 1;
   -ms-flex: 1;
   flex: 1;
}

.aboutBlurb {
  margin: 30px;
  padding: 10px;
  padding-bottom: 15px;
  border-radius: 10px;
  background-color: rgb(34, 32, 34);
}
</style>