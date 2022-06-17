<template>
<!---Ways to get in touch! Need to get some security work in on this so it's not abusable.-->
    <h1>Contact</h1>
    <div>
        <p>Email contact form goes here once I get that chunk up and running. Also various socials</p>
        <br>
        <form class="contactForm">
            <!---Add some restrictions on this to sanitize inputs-->
            <div class="messageFromInfo">
                <input v-model="name" name="name" placeholder="name" required>
                <input v-model="email" name="email" placeholder="email" required>
            </div>
            <textarea v-model="contactBoxMsg" name="message" rows="10" cols="80" placeholder="Message goes here!"></textarea> 
        </form>
        <br>
        <button type="submit">Submit</button>
    </div>
</template>

<script>
export default {
    name: 'ContactPage',
    data (){
        return {
            name: '',
            email: '',
            contactBoxMsg: ''
        }
    },
    mounted () {
        fetch("/Contact");
    }
}

</script>

<style>
h1 {
    font-family: 'Courier-New', monospace;
}

.messageFromInfo {
    -webkit-flex: 2;
    -ms-flex: 2;
    flex: 2;
}

.contactForm {
    margin: auto;
    display: flex;
    flex-direction: column;
    text-align: center;
    -webkit-flex: 2;
    -ms-flex: 2;
    flex: 2;
    max-width: max-content;
    align-items: center;
    
}

input {
    margin: 20px;
    border-radius: 5px;
    border-style: hidden;
    color: rgb(226, 158, 69);
    background-color: rgb(34, 32, 34);
}

textarea {
    max-width: 500px;
    max-height: 300px;
    margin-left: 20px;
    margin-right: 20px;
    margin-bottom: 20px;
    resize: none;
    border-radius: 5px;
    border-style: hidden;
    padding: 5px;
    white-space: pre-line;
    color: rgb(226, 158, 69);
    background-color: rgb(34, 32, 34);
}

button {
    border-radius: 5px ;
    color: rgb(226, 158, 69);
}
</style>