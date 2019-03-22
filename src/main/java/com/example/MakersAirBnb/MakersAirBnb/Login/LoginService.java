package com.example.MakersAirBnb.MakersAirBnb.Login;

import com.example.MakersAirBnb.MakersAirBnb.spaces.Space;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    private LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public void addLogin(Login login) {
        loginRepository.save(login);
    }

    public Login getLoginByUserId(Long userId) {
        return loginRepository.findById(userId).orElse(null);
    }

    public void removeLoginById(Long userId) {
        loginRepository.deleteById(userId);
    }
}