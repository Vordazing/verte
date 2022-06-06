package com.example.verte.repository;

import com.example.verte.model.Russia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RussiaRepository extends JpaRepository<Russia,Long> {
}
