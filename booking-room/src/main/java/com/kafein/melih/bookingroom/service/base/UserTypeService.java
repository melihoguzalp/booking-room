package com.kafein.melih.bookingroom.service.base;

import com.kafein.melih.bookingroom.dto.UserTypeDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserTypeService {


    UserTypeDTO save(UserTypeDTO userTypeDTO);

    List<UserTypeDTO> findAll();

    UserTypeDTO findById(int id);

}
