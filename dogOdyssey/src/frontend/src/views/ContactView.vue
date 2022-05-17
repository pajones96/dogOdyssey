<template>
    <h1>Contact</h1>
</template>

<script>
export default {
    name: 'ContactPage',
    mounted () {
        fetch("/Contact");
    }
}
</script>

<style>
h1 {
    font-family: 'Courier-New', monospace;
}
</style>