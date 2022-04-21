package com.baeldung.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String viewIndexPage(Model model) {
        model.addAttribute("header", "Hello this is main page");
        return "index";
    }
}