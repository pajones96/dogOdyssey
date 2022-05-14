<template>
  <h1>{{ msg }}</h1>
</template>

<script>
export default {
  name: 'Home',
  data() {
    return {
      msg: ''
    }
  },
  mounted() {
    fetch("/")
      .then((response) => response.text())
      .then((data) => {
          this.msg = data;
      });
  }
}
</script>