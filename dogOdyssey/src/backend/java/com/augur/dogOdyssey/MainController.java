package com.augur.dogOdyssey;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {


    @GetMapping("/")
    public String hello() {
        return "Full Stack Java with Spring Boot & VueJS!";
    }

    //@GetMapping("/ramblings")
    //public List<blogPost> getRamblings(){
        //return the list of stored blog posts
    //}

    //Looking at some documentation for a bit, this is a placeholder
    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void sendMessage(){

    }


}