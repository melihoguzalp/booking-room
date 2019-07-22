package com.kafein.melih.bookingroom.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String tname;



}
