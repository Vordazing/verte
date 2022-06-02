package com.example.verte.Controller;


import com.example.verte.service.OutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/output")
@Controller
public class OutputController {

    @Autowired
    private OutputService outputService;

    @GetMapping
    public ModelAndView showAll(){

        ModelAndView mv = new ModelAndView("output");

        mv.addObject("outputList", outputService.getAll());

        return mv;

    }


}
