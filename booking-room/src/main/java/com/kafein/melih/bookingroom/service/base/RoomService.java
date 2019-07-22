package com.kafein.melih.bookingroom.service.base;

import com.kafein.melih.bookingroom.dto.RoomDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public interface RoomService {


    RoomDTO save(RoomDTO roomDTO);

    List<RoomDTO> findAll();

    RoomDTO findById(int id);

    List<RoomDTO> findAllByDistrict_Id(int id);

    List<RoomDTO> findRoomsByRoomTypeAndDistrict(int roomTypeId, int districtId);

    RoomDTO setRoomActiveStatus(int id, boolean activeStatus);




}
