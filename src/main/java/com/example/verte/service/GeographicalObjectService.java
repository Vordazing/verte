package com.example.verte.service;


import com.example.verte.model.GeographicalObject;
import com.example.verte.repository.GeographicalObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeographicalObjectService {

    @Autowired
    private GeographicalObjectRepository geographicalObjectRepository;

    public List<GeographicalObject> getAll(){
        return this.geographicalObjectRepository.findAll();
    }


}
