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
@Table(name = "object")
public class Object {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idObject;
    private String objects;


    @OneToMany
    @JoinColumn(name = "object")
    private List<Russia> russiaList;

}
