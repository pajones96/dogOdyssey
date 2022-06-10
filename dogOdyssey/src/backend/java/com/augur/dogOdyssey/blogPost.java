package com.augur.dogOdyssey;

import java.time.LocalDateTime;

public class blogPost {
    String title;
    String body;
    LocalDateTime timePosted;

    public blogPost(String titleText, String bodyText){
        this.title = titleText;
        this.body = bodyText;
        //should update this later with a more accurate time/date measurement
        this.timePosted = LocalDateTime.now();
        return;
    }
}
