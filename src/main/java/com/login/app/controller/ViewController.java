package com.login.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin
public class ViewController {

    @GetMapping(value = {"/", "/login"})
    public String showLoginForm() {
        return "/login";
    }

    @GetMapping(value = "/register")
    public String showRegisterForm(Model model) {
        return "register";
    }

    @GetMapping(value = "/home")
    public String home(Model model) {
        return "home";
    }

    @GetMapping(value = "/manager-view")
    public String managerView(Model model) {
        return "manager-view";
    }
}
