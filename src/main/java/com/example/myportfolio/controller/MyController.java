package com.example.myportfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name","Rosy");
        return "index";
    }

    @GetMapping("/skills")
    public String skills(Model model){
        return "skills";
    }
}
