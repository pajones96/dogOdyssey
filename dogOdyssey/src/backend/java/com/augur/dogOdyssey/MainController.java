package com.augur.dogOdyssey;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    //@GetMapping("/ramblings")
    //public List<blogPost> getRamblings(){
        //return the list of stored blog posts
    //}

    @GetMapping("/error")
    public String errorResponse(){
        return "Uh-oh. That's... not supposed to happen.";
    }

    //Looking at some documentation for a bit, this is a placeholder
    @PostMapping
    public void sendMessage(){

    }


}