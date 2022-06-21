<template>
<!---This should have a couple columns of links to projects represented as tiles with names and short descriptions-->
    <h1>Portfolio</h1>
    <div>
        <p>Gonna put other projects here, eventually. Probably as links to github repos. Maybe small interactive demos if I can get that to behave properly</p>
        <div class="row">
            <div class="column"></div>
            <div class="column"></div>
            <div class="column"></div>
        </div>
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
p {
    text-align: center;
    -webkit-flex: 2;
    -ms-flex: 2;
    flex: 2;
}
.row {

}
.column {

}

</style>