package com.example.MakersAirBnb.MakersAirBnb.Login;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class LoginDao {

    private static Map<Integer, Login> logins;

    static {

        logins = new HashMap<Integer, Login>(){

            {
                put(1, new Login(1, "blah@gmail.com", "password123"));
                put(2, new Login(2, "yoyoyo@gmail.com", "password3453"));
                put(3, new Login(3, "kajefbvke@hotmail.co.uk", "passwordqwtq3t"));

            }
        };

    }

    public Collection<Login> getAllLogins(){
        return this.logins.values();
    }

    public Login getLoginById(int id){
        return this.logins.get(id);
    }

    public void removeLoginById(int id) {
        this.logins.remove(id);
    }
}
