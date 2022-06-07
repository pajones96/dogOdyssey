<template>
<!---The landing page, more or less. Meant to just give the first impression-->
  <h1>{{ msg }}</h1>
  <div class="row">
    <div class="column side"></div>
    <div class="column middle">
      <p class="homeBlurb">
        <br><br>
        Bespoke code microboutique for future-minded applications. 
        <br><br><br> 
        By which I mean it's just me making neat code things sometimes and maybe I get paid for it
        <br><br><br>
      </p>
    </div>
    <div class="column side"></div>
  </div>
  
</template>

<script>
export default {
  name: 'HomePage',
  data() {
    return {
      msg: 'Augury Solutions',
    }
  },
  mounted() {
    fetch("/");
  }
}
</script>

<style>
h1 {
  text-align: center;
  align-content: center;
  margin: 20px;
  font-family: 'Inconsolata', monospace;
  color: rgb(226, 158, 69);
}

.homeBlurb {
  background-color: rgb(34, 32, 34);
  border: solid;
  border-radius: 10px;
  border-color: rgb(34, 32, 34);
}

.row {
  display: -webkit-flex;
  display: flex;
}

.column.middle{
  text-align: center;
  padding: 20px;
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

body {
  align-content: center;
  color: rgb(236, 197, 145);
}
</style>