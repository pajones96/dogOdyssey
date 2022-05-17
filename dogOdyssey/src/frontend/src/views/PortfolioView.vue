<template>
    <h1>Portfolio</h1>
</template>

<script>
export default {
    name: 'PortfolioPage',
    mounted () {
        fetch("/Portfolio");
    }
}
</script>

<style>
h1 {
    font-family: 'Courier-New', monospace;
}
</style>