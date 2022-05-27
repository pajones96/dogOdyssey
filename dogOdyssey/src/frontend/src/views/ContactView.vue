<template>
<!---Ways to get in touch! Need to get some security work in on this so it's not abusable.-->
    <h1>Contact</h1>
    <div>
        <p>Email contact form goes here once I get that chunk up and running. Also various socials</p>
        <br>
        <form>
            <!---Add some restrictions on this to sanitize inputs-->
            <div>
                <input type="text" name="name" value="name">
                <input type="email" name="email" value="email">
            </div>
            <br>
            <textarea name="message" rows="10" cols="80">
            Get in touch
            </textarea> 
        </form>
        <br>
        <button type="submit">Submit</button>
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

input {
    margin-left: 20px;
    margin-right: 20px;
    color: rgb(226, 158, 69);
}

textarea {
    color: rgb(226, 158, 69);
}

button {
    color: rgb(226, 158, 69);
}
</style>