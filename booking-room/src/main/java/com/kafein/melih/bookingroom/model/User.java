package com.kafein.melih.bookingroom.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fname;
    private String lname;
    private String phoneNumber;
    private String email;
   // private String password;
    private Date birthDate;


}
