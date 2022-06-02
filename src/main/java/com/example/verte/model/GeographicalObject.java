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
@Table(name = "geographical_object")
public class GeographicalObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_geographical_object;
    private String geographical_object_list;
}
