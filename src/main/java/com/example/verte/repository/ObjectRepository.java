package com.example.verte.repository;

import com.example.verte.model.Object;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ObjectRepository extends JpaRepository<Object,Long> {
}
