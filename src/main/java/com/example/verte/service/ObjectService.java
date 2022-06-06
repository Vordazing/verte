package com.example.verte.service;



import com.example.verte.repository.ObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.verte.model.Object;

import java.util.Collections;
import java.util.List;

@Service
public class ObjectService {

    @Autowired
    private ObjectRepository objectRepository;

    public List<Object> getAll(){
        return this.objectRepository.findAll();
    }


}
