package com.example.verte.service;



import com.example.verte.model.Russia;

import com.example.verte.repository.RussiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RussiaService {

    @Autowired
    private RussiaRepository russiaRepository;

    public List<Russia> getAll(){
        return this.russiaRepository.findAll();
    }

    public void save(Russia russia) {
        russiaRepository.save(russia);
    }

    public void deleteById(Long id) {
        russiaRepository.deleteById(id);
    }
}
