package com.example.deena_stdnt.login;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table (name="LOG IN")
@Entity
public class LoginInfo {

    private String userName;
    @Id
    private String email;
    private String password;
}
