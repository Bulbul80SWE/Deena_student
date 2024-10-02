package com.example.deena_stdnt.SignUp;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class SignUpDto {
    public enum userType {
        STUDENT,
        STAFF,
        ADMIN,
        TEACHER
    }

    @NotNull (message = "This Field Can't be Empty")
    private String institute;
    @NotNull (message = "This Field Can't be Empty")
    private String branch;
    @NotNull (message = "This Field Can't be Empty")
    private String userName;
    @NotNull (message = "This Field Can't be Empty")
    private String email;
    @NotNull (message = "This Field Can't be Empty")
    private String fullName;
    @NotNull (message = "This Field Can't be Empty")
    private String phone;

//    @Enumerated (EnumType.STRING)
    @NotNull (message = "This Field Can't be Empty")
    private userType userIdType;
    @NotNull (message = "This Field Can't be Empty")
    private String password;


}

