package com.example.MakersAirBnb.MakersAirBnb.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.List;

@Controller
public class LoginController {

    private final LoginService loginService;
    private final HttpSession session;

    public LoginController(LoginService loginService, HttpSession session) {
        this.loginService = loginService;
        this.session = session;
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
