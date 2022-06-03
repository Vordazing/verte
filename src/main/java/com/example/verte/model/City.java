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
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCity;
    private String cities;
    @Column(name = "region_id")
    private Long regionId;


    @OneToMany
    @JoinColumn(name = "location_id")
    private List<Output> outputList;

}