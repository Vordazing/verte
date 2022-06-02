package com.example.verte.repository;

import com.example.verte.model.GeographicalObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeographicalObjectRepository extends JpaRepository<GeographicalObject,Long> {
}
