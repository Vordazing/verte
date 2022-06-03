package com.example.verte.Controller;


import com.example.verte.model.City;
import com.example.verte.model.GeographicalObject;
import com.example.verte.model.Output;
import com.example.verte.model.Region;
import com.example.verte.service.CityService;
import com.example.verte.service.GeographicalObjectService;
import com.example.verte.service.OutputService;
import com.example.verte.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RequestMapping("/output")
@Controller
public class OutputController {

    @Autowired
    private OutputService outputService;

    @Autowired
    private GeographicalObjectService geographicalObjectService;

    @Autowired
    private CityService cityService;
    @Autowired
    private RegionService regionService;

    @GetMapping
    public ModelAndView showAll(){

        ModelAndView mv = new ModelAndView("output");

        mv.addObject("regionList", regionService.getAll());

        return mv;

    }

    @GetMapping("/new")
    public ModelAndView newOutput(Output output){
        ModelAndView mv = new ModelAndView("new");

       List<Region> regions = regionService.getAll();
        List<City> cities = cityService.getAll();
        List<GeographicalObject> geographicalObjectList = geographicalObjectService.getAll();


        mv.addObject("regionList", regions);
        mv.addObject("cityList", cities);
        mv.addObject("geographicalObjectList", geographicalObjectList);

        return mv;
    }

    @PostMapping("/new")
    public String createOutput(Output output){
        outputService.save(output);
        return "redirect:/output";
    }

    @GetMapping("/{id}/delete")
    public String deleteOutput(@PathVariable Long id) {
        outputService.deleteById(id);
        return "redirect:/output";
    }



}
