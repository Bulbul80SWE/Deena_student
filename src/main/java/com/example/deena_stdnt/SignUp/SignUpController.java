package com.example.deena_stdnt.SignUp;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signup")

public class SignUpController {

    private final SignUpService signUpService;

    public SignUpController(SignUpService signUpService) {
        this.signUpService = signUpService;
    }


    @PostMapping

public String saveSignUp (@RequestBody @Valid SignUpDto dto) {
        try {
            signUpService.saveSignUpDetails(dto);
        } catch (Exception e) {
            return "Action Failed";
        }
        return "Registration Details Saved";
    }
}
