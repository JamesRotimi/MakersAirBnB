package com.example.MakersAirBnb.MakersAirBnb.Login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/authentication")
    @ResponseBody
    public Login addLogin(Login login) {
        loginService.addLogin(login);
        return login;
    }

    @GetMapping("/login")
    public String renderLoginSpace() {
        return "login";
    }

}
