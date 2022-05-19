<template>
<!---This page should look like a blog. One long feed of posts to scroll through, maybe engage with.-->
    <h1>Ramblings</h1>
    <div>
        <p>Treating this space as a professional blog</p>
    </div>
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
div {
    text-align: center;
    -webkit-flex: 2;
    -ms-flex: 2;
    flex: 2;
}
</style>