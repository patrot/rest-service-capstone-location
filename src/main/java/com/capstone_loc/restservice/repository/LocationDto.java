package com.capstone_loc.restservice.repository;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "location")
public class LocationDto {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "zipCode")
    private String zipCode;

    public LocationDto() {
        super();
    }

    public LocationDto(String name, String zipCode) {
        this.name = name;
        this.zipCode = zipCode;
    }
}
