package com.example.MakersAirBnb.MakersAirBnb.appUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @RequestMapping(method = RequestMethod.GET, value = "/signUp")
    public String renderSignUpPage() {
        return "signUp";
    }


    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public void addUser(AppUser appUser) {
        appUserService.addAppUser(appUser);
    }

}
