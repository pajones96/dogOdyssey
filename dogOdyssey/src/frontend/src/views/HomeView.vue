<template>
  <h1>{{ msg }}</h1>
</template>

<script>
export default {
  name: 'HomePage',
  data() {
    return {
      msg: 'Augury Solutions'
    }
  },
  mounted() {
    fetch("/");
  }
}
</script>

<style>

</style>