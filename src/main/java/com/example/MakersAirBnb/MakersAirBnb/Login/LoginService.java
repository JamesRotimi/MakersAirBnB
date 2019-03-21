package com.example.MakersAirBnb.MakersAirBnb.Login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository){
        this.loginRepository = loginRepository;
    }





}
