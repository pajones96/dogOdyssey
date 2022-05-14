<template>
    <div>
         <ul>
        <li><a href="#home">Home</a></li>
        <li><a href="#menagerie">Menagerie</a></li>
        <li><a href="#ramblings">Ramblings</a></li>
        <li><a href="#about">About</a></li>
        <li style="float:right"><a class="active" href="#contact">Contact</a></li>
        </ul> 
    </div>
</template>

<style scoped>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: rgb(41, 30, 38);
}

li {
  float: left;
}

li a {
  display: block;
  color: rgb(247, 242, 232);
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change the link color to #111 (black) on hover */
li a:hover {
  background-color: #111;
}
</style>