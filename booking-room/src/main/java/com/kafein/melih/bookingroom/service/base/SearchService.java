package com.kafein.melih.bookingroom.service.base;

import com.kafein.melih.bookingroom.dto.RoomDTO;
import com.kafein.melih.bookingroom.model.*;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public interface SearchService {

    List<RoomDTO> findBySearch(int district);

}
