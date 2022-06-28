package com.augur.dogOdyssey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import java.util.List;

@RestController
public class MainController {

    //@GetMapping("/ramblings")
    //public List<blogPost> getRamblings(){
        //return the list of stored blog posts
    //}

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/error")
    public String errorResponse(){
        return "Uh-oh. That's... not supposed to happen.";
    }

    @GetMapping("/contact")
    public contactForm showContactForm(contactForm userMessage){
        return userMessage;
    }

    //Looking at some documentation for a bit, this is a placeholder
    @PostMapping
    public void sendMessage(){

    }


}