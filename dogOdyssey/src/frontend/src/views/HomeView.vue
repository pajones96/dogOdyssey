<template>
  <h1>{{ msg }}</h1>
  <body>{{ desc }}</body>
</template>

<script>
export default {
  name: 'HomePage',
  data() {
    return {
      msg: 'Augury Solutions.',
      desc: 'Bespoke code microboutique for future-minded applications.\n\n By which I mean it\'s just me making neat code things sometimes and maybe I get paid for it'
    }
  },
  mounted() {
    fetch("/");
  }
}
</script>

<style>
h1 {
    align-content: center;
    margin: 20px;
    font-family: 'Inconsolata', monospace;
    color: rgb(226, 158, 69);
}
body {
  align-content: center;
  color: rgb(236, 197, 145);
}
</style>