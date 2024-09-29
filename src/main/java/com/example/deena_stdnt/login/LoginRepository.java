package com.example.deena_stdnt.login;


import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository <LoginInfo, String> {
}
