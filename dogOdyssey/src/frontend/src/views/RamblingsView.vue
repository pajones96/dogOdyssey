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

</style>