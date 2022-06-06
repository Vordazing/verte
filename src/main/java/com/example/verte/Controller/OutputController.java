package com.example.verte.Controller;


import com.example.verte.model.Object;
import com.example.verte.model.City;
import com.example.verte.model.Region;
import com.example.verte.model.Russia;
import com.example.verte.service.CityService;
import com.example.verte.service.ObjectService;
import com.example.verte.service.RussiaService;
import com.example.verte.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RequestMapping("/russia")
@Controller
public class OutputController {

    @Autowired
    private RussiaService russiaService;

    @Autowired
    private ObjectService objectService;

    @Autowired
    private CityService cityService;
    @Autowired
    private RegionService regionService;

    @GetMapping
    public ModelAndView showAll(){

        ModelAndView mv = new ModelAndView("russia");

        mv.addObject("regionList", regionService.getAll());

        return mv;

    }

    @GetMapping("/new")
    public ModelAndView newOutput(Russia russia){
        ModelAndView mv = new ModelAndView("new");

        List<Region> regions = regionService.getAll();
        List<City> cities = cityService.getAll();

        List<Object> objects = objectService.getAll();


        mv.addObject("regionList", regions);
        mv.addObject("cityList", cities);
        mv.addObject("objectList", objects);

        return mv;
    }

    @PostMapping("/new")
    public String createOutput(Russia russia){
        russiaService.save(russia);
        return "redirect:/russia";
    }

    @GetMapping("/{id}/delete")
    public String deleteOutput(@PathVariable Long id) {
        russiaService.deleteById(id);
        return "redirect:/russia";
    }



}
