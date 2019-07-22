package com.kafein.melih.bookingroom.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String dname;

    @ManyToOne
    private City city;


}
