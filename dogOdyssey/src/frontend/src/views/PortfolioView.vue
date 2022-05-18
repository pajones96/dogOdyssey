<template>
    <h1>Portfolio</h1>
    <div>
        <p>Gonna put other projects here, eventually. Probably also links to github repos</p>
    </div>
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
div {
    text-align: center;
    -webkit-flex: 2;
    -ms-flex: 2;
    flex: 2;
}
</style>