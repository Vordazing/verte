package com.example.verte.service;

import com.example.verte.model.Output;

import com.example.verte.repository.OutputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutputService {

    @Autowired
    private OutputRepository outputRepository;

    public List<Output> getAll(){
        return this.outputRepository.findAll();
    }

}
