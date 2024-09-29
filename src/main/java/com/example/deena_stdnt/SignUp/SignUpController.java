package com.example.deena_stdnt.SignUp;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {

    private final SignUpService signUpService;

    public SignUpController(SignUpService signUpService) {
        this.signUpService = signUpService;
    }
}
