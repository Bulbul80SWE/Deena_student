package com.example.deena_stdnt.SignUp;


import org.springframework.stereotype.Service;

@Service
public class SignUpService {

    private final SignUpRespository respository;

    public SignUpService(SignUpRespository respository) {
        this.respository = respository;
    }
}


