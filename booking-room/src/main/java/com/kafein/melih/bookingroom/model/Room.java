package com.kafein.melih.bookingroom.model;


import lombok.Data;
import javax.persistence.*;



@Entity
@Data
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private float fee;

    private String title;

    private String description;

    @ManyToOne
    private User owner;

    @ManyToOne
    private RoomType roomType;

    @ManyToOne
    private District district;

    private Boolean active;


}
