package com.example.deena_stdnt.SignUp;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "STUDENT_SIGNUP")
@Entity


public class SignUpInfo {

    private String institute;
    private String branch;
    @Enumerated(EnumType.STRING)
    private userType userIdType;
    private String userName;
    private String fullName;
    @Id
    private String email;
    private String phone;
    public enum userType {
        STUDENT,
        STAFF,
        ADMIN,
        TEACHER
    }
    private String password;

}
