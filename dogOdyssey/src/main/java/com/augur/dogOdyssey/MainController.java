package com.augur.dogOdyssey;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {
        return "Full Stack Java with Spring Boot & VueJS!";
    }

    @GetMapping("/#Contact")
    public String contact(){ return "Get in touch";}

}