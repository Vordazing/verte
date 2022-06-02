package com.example.verte.service;


import com.example.verte.model.Region;
import com.example.verte.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {


    @Autowired
    private RegionRepository regionRepository;

    public List<Region> getAll(){
        return this.regionRepository.findAll();
    }
}
