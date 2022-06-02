package com.example.verte.model;


import javax.persistence.*;

@Entity
@Table(name = "Lake")
public class Lake {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_lake;
    private String region_edge;
    private String skbgmd;
    private String name_lake;
    private String description;


    public Lake(){
    }

   public Lake(Long id,String region_edge, String skbgmd, String name_lake, String description){
       this.id_lake = id_lake;
       this.region_edge = region_edge;
       this.skbgmd = skbgmd;
       this.name_lake = name_lake;
       this.description = description;

   }


    public Long getId() {
        return id_lake;
    }

    public void setId(Long id) {
        this.id_lake = id;
    }

    public String getRegion_edge() {
        return region_edge;
    }

    public void setRegion_edge(String region_edge) {
        this.region_edge = region_edge;
    }

    public String getSkbgmd() {
        return skbgmd;
    }

    public void setSkbgmd(String skbgmd) {
        this.skbgmd = skbgmd;
    }

    public String getName_lake() {
        return name_lake;
    }

    public void setName_lake(String name_lake) {
        this.name_lake = name_lake;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Lake [id_lake=" + id_lake + ", region_edge=" + region_edge + ", skbgmd=" + skbgmd + ", name_lake=" + name_lake + ", description =" + description +"]";
    }


}

