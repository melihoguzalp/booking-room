package com.kafein.melih.bookingroom.service;

import com.kafein.melih.bookingroom.dto.UserTypeDTO;
import com.kafein.melih.bookingroom.mapper.UserTypeMapper;
import com.kafein.melih.bookingroom.repository.UserTypeRepository;
import com.kafein.melih.bookingroom.service.base.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTypeServiceImpl implements UserTypeService {

    @Autowired
    private UserTypeRepository userTypeRepository;

    @Autowired
    private UserTypeMapper userTypeMapper;


    @Override
    public UserTypeDTO save(UserTypeDTO userTypeDTO) {
        return userTypeMapper.toUserTypeDTO(userTypeRepository.save(userTypeMapper.toUserType(userTypeDTO)));
    }

    @Override
    public List<UserTypeDTO> findAll() {

        return userTypeMapper.toUserTypeDTOList(userTypeRepository.findAll());
    }

    @Override
    public UserTypeDTO findById(int id) {

        return userTypeMapper.toUserTypeDTO(userTypeRepository.findById(id));
    }


}
