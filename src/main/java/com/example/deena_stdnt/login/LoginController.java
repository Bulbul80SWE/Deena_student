package com.example.deena_stdnt.login;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private final LoginService loginService;

    public LoginController (LoginService loginService) {
        this.loginService = loginService;
    }
}
