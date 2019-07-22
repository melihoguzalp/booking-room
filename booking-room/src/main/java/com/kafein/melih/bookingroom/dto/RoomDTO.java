package com.kafein.melih.bookingroom.dto;

import lombok.Data;

@Data

public class RoomDTO {


    private int id;

    private float fee;

    private String title;

    private String description;

    private UserDTO owner;

    private RoomTypeDTO roomType;

    private DistrictDTO district;

    private Boolean active;

}
