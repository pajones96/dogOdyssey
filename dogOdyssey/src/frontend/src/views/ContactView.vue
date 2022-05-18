<template>
    <h1>Contact</h1>
    <div>
        <p>Email contact form goes here once I get that chunk up and running. Also various socials</p>
    </div>
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
div {
    text-align: center;
    -webkit-flex: 2;
    -ms-flex: 2;
    flex: 2;
}
</style>