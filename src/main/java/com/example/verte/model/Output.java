package com.example.verte.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "output")
public class Output {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_output;
    private Long location;
    private Long name_of_the_geographical_object;
    private String name;
    private String description;



}



