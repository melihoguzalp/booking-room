package com.kafein.melih.bookingroom.service.base;

import com.kafein.melih.bookingroom.dto.RoomTypeDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public interface RoomTypeService {


    RoomTypeDTO save(RoomTypeDTO roomTypeDTO);

    List<RoomTypeDTO> findAll();

    RoomTypeDTO findById(int id);
}


