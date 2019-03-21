package com.example.MakersAirBnb.MakersAirBnb.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LoginService {

    @Autowired
    private LoginDao loginDao;

    public Collection<Login> getAllLogins(){
        return this.loginDao.getAllLogins();
    }

    public Login getLoginById(int id){
        return this.loginDao.getLoginById(id);
    }

    public void removeLoginById(int id) {
        this.loginDao.removeLoginById(id);
    }

//    public Login removeLoginById(int id){
//        return this.loginDao.getLoginById(id);
//    }
//
}
