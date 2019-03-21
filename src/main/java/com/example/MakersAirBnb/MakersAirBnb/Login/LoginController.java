package com.example.MakersAirBnb.MakersAirBnb.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/logins")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Login> getAllLogins(){
        return loginService.getAllLogins();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Login getLoginById(@PathVariable("id") int id) {
        return loginService.getLoginById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteLoginById(@PathVariable("id") int id) {
        loginService.removeLoginById(id);
    }


}
