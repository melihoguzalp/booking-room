package com.kafein.melih.bookingroom.service;


import com.kafein.melih.bookingroom.dto.UserDTO;
import com.kafein.melih.bookingroom.mapper.UserMapper;
import com.kafein.melih.bookingroom.repository.UserRepository;
import com.kafein.melih.bookingroom.service.base.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service

public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;


    @Override
    public UserDTO save(UserDTO userDTO) {
        return userMapper.toUserDTO(userRepository.save(userMapper.toUser(userDTO)));
    }

    @Override
    public List<UserDTO> findAll() {

        return userMapper.toUserDTOList(userRepository.findAll());
    }

    @Override
    public UserDTO findById(int id) {

        return userMapper.toUserDTO(userRepository.findById(id));
    }

    @Override
    public List<UserDTO> findAllByFname(String fname) {
        return userMapper.toUserDTOList(userRepository.findAllByFname(fname));
    }


    @Override
    public List<UserDTO> findAllByLname(String lname) {
        return userMapper.toUserDTOList(userRepository.findAllByLname(lname));
    }

    @Override
    public List<UserDTO> findAllByphoneNumber(String phoneNumber) {
        return userMapper.toUserDTOList(userRepository.findAllByphoneNumber(phoneNumber));
    }


    @Override
    public UserDTO findByEmail(String email) {

        return userMapper.toUserDTO(userRepository.findByEmail(email));
    }


    @Override
    public List<UserDTO> findAllBybirthDate(Date birthDate) {
        return userMapper.toUserDTOList(userRepository.findAllBybirthDate(birthDate));
    }
}
