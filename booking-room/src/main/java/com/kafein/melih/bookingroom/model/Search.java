package com.kafein.melih.bookingroom.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Search {

    private City city;
    private District district;
    private Date cinDate;
    private Date coutDate;
    private List<UserType> userType;


}
