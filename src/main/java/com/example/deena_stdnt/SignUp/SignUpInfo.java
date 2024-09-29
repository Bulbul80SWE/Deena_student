package com.example.deena_stdnt.SignUp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import javax.lang.model.element.Name;

@Getter
@Setter
@Table (name="SIGN UP")
@Entity
public class SignUpInfo {

    private String email;
    private String userName;
    private String studentName;
    private String phone;
    @Id
    private String rollNo;
    private String password;
    private String institute;
    private String branch;
}
