<template>
    <h1>Ramblings</h1>
</template>

<script>
export default {
    name: 'RamblingsView',
    mounted () {
        fetch("/Ramblings");
    }
}
</script>

<style>
/* May remove this page and replace it with a "company" social media link elsewhere */
h1 {
    font-family: 'Courier-New', monospace;
}
</style>