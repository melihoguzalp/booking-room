package com.kafein.melih.bookingroom.service.base;


import com.kafein.melih.bookingroom.dto.UserDTO;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public interface UserService {


    UserDTO save(UserDTO userDTO);

    List<UserDTO> findAll();

    UserDTO findById(int id);

    List<UserDTO> findAllByFname(String fname);
    List<UserDTO> findAllByLname(String lname);
    List<UserDTO> findAllByphoneNumber(String phoneNumber);
    UserDTO findByEmail(String email);
   // List<UserDTO> findByPassword(String password);
    List<UserDTO> findAllBybirthDate(Date birthDate);
}
