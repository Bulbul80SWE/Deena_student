package com.example.deena_stdnt.login;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name="STUDENT LOGIN")
public class LoginInfo {
    @Id
    private String email;

    private String password;


}
