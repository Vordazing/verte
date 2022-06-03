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
    private Long idOutput;
    private String name;
    private String description;


    @ManyToOne
    @JoinColumn(name = "name_of_the_geograp_hical_object_id")
    private GeographicalObject geographicalObject;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private City city;


}



