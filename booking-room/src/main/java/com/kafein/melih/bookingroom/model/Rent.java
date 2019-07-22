package com.kafein.melih.bookingroom.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date checkinDate;

    private Date checkoutDate;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<UserType> userType;

    @ManyToOne
    private Room room;

}
