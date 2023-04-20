package com.elzhur.elzhur.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    String homeGet() {
        return "home";
    }
}
