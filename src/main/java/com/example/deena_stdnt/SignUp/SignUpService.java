package com.example.deena_stdnt.SignUp;


import org.springframework.stereotype.Service;

@Service
public class SignUpService {

    private final SignUpRespository repository;

    public SignUpService(SignUpRespository repository) {
        this.repository = repository;
    }

    public void saveSignUpDetails(SignUpDto dto) {
        SignUpInfo signUpInfo = new SignUpInfo();

        signUpInfo.setInstitute(dto.getInstitute());
        signUpInfo.setBranch(dto.getBranch());
        signUpInfo.setUserName(dto.getUserName());
        signUpInfo.setEmail(dto.getEmail());
        signUpInfo.setFullName(dto.getFullName());
       //
        signUpInfo.setPhone(dto.getPhone());
        signUpInfo.setPassword(dto.getPassword());

        repository.save(signUpInfo);
    }
}


