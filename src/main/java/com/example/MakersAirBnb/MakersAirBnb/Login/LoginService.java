package com.example.MakersAirBnb.MakersAirBnb.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LoginService {

    @Autowired
    private LoginDao loginDao;

    public Collection<Login> getAllLogins(){
        return loginDao.getAllLogins();
    }
}
