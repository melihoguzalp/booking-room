package com.kafein.melih.bookingroom.dto;


import lombok.Data;
import javax.persistence.Entity;
import java.util.Date;
import java.util.Set;

@Data
public class UserDTO {


    private int id;
    private String fname;
    private String lname;
    private String phoneNumber;
    private String email;
  //  private String password;
    private Date birthDate;

}
