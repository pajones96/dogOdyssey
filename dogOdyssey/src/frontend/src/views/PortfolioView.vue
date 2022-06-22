<template>
<!---This should have a couple columns of links to projects represented as tiles with names and short descriptions-->
    <h1>Portfolio</h1>
    <div>
        <p>Gonna put other projects here, eventually. Probably as links to github repos. Maybe small interactive demos if I can get that to behave properly</p>
        <div class="row">
            <!---The way I want this to work is that the projects will be displayed in these columns with some details and a github link-->
            <div class="column">
                <div class="projectTile">{{ projectName }}</div>
            </div>
            <div class="column">
                <div class="projectTile">{{ projectName }}</div>
            </div>
            <div class="column">
                <div class="projectTile">{{ projectName }}</div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: 'PortfolioPage',
    data () {
        return {
            projectName: "To be added soon"
        }
    },
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
    display: flex;
    flex-direction: row;
}
.column {
    display: flex;
    flex-direction: column;
}
.projectTile {
    border-radius: 5px;
    border: hidden;
    background-color: rgb(34, 32, 34);
    height: 300px;
    width: 300px;
    margin: 20px;
    padding: 5px;
}
</style>