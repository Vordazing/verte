package com.example.verte.service;


import com.example.verte.model.City;
import com.example.verte.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> getAll(){
        return this.cityRepository.findAll();
    }

}
