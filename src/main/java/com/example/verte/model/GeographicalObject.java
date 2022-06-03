package com.example.verte.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "geographical_object")
public class GeographicalObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idGeographicalObject;
    private String geographicalObjectList;


    @OneToMany
    @JoinColumn(name = "name_of_the_geograp_hical_object_id")
    private List<Output> outputList;

}
