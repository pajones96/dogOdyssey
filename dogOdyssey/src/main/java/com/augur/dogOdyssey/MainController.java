package com.augur.dogOdyssey;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.ServerResponse;

@RestController
public class MainController {


    @GetMapping("/")
    public String hello() {
        return "Full Stack Java with Spring Boot & VueJS!";
    }

    public ServerResponse testThingy(){
        return ServerResponse.ok().build();
    }


}