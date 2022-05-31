package com.augur.dogOdyssey;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {


    @GetMapping("/")
    public String hello() {
        return "Full Stack Java with Spring Boot & VueJS!";
    }

    //Looking at some documentation for a bit, this is a placeholder
    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void sendMessage(){

    }


}