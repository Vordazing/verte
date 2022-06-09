package com.example.verte.Controller;

import com.example.verte.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }


    @GetMapping("/error")
    public String error() {
        return "error";
    }

    @GetMapping("/team")
    public String team() {
        return "team";
    }

    @GetMapping("/home")
    public String cpc() {
        return "home";
    }
}

