package com.augur.dogOdyssey;

import javax.validation.constraints.*;

public class contactForm {

    @NotNull
    @Size(min=2, max=32)
    public String name;

    @NotNull
    @Email(message = "Make sure it's a valid email address")
    public String email;

    @NotNull
    @NotEmpty
    public String messageBody;

    public contactForm (String nameProvided, String emailProvided, String messageBodyProvided){
        this.name = nameProvided;
        this.email = emailProvided;
        this.messageBody = messageBodyProvided;
    }
}
