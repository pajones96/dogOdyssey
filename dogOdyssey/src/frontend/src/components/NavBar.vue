<template>
<!---Exactly what it says on the tin. A navigation bar at the top that should always be present-->
    <nav class="header">
        <ul>
          <li><router-link to="/">Home</router-link></li>
          <li><router-link to="/portfolio">Portfolio</router-link></li>
          <li><router-link to="/ramblings">Ramblings</router-link></li>
          <li><router-link to="/about">About</router-link></li>
          <!---#TODO Add Light mode/Dark mode toggle, default to dark mode-->
          <li><button class="darkModeToggle"></button></li>
          <li style="float:right"><router-link to="/contact">Contact</router-link></li>
        </ul> 
    </nav>
</template>

<script>
import { defineComponent } from '@vue/composition-api'

export default defineComponent({
  setup() {
    
  },
})
</script>


<style scoped>

.header {
  display: block;
  width: 100%;
  margin: 0px;
}

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: rgb(51, 33, 53);
  font-family: 'Courier-New', monospace;
}

li {
  float: left;
}

li a {
  display: block;
  color: rgb(226, 158, 69);
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change the link color to #111 (black) on hover */
li a:hover {
  background-color: #111;
}

.darkModeToggle {
  float: right;
}
</style>