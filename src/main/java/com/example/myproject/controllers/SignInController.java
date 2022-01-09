package com.example.myproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController {
    @GetMapping("/sign-in")
    public String about(Model model) {
        return "sign-in";
    }
}
