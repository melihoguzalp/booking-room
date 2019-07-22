package com.kafein.melih.bookingroom.service.base;

import com.kafein.melih.bookingroom.dto.RentDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public interface RentService {


    RentDTO save(RentDTO rentDTO);

    List<RentDTO> findAll();

    RentDTO findById(int id);

   // RentDTO findByUser_Email(String email);




}
