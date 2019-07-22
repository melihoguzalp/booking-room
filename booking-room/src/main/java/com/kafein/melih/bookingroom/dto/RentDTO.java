package com.kafein.melih.bookingroom.dto;



import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Set;


@Data
public class RentDTO {

    private int id;

    private Date checkinDate;

    private Date checkoutDate;

    private UserDTO user;

    private List<UserTypeDTO> userType;

    private RoomDTO room;


}
