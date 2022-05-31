package com.example.verte.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/write")
    public String write() {
        return "write";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }

    @GetMapping("/team")
    public String team() {
        return "team";
    }

    @GetMapping("/cpc")
    public String cpc() {
        return "cpc";
    }
}

