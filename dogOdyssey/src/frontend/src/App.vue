<template>
  <div class="defaultPage">
    <NavBar></NavBar>
    <router-view/>
  </div>
</template>

<script>
import NavBar from './components/NavBar.vue'
export default {
  name: 'App',
  components: {
    NavBar
  }
}
</script>

<style>
  .defaultPage {
    background-color: rgb(53, 50, 53);
  }
</style>
