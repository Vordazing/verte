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
@Table(name = "russia")
public class Russia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRussia;
    private String name;
    private String description;


    @ManyToOne
    @JoinColumn(name = "object")
    private Object object;

    @ManyToOne
    @JoinColumn(name = "location")
    private City city;


}



