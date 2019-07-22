package com.kafein.melih.bookingroom.service;

import com.kafein.melih.bookingroom.dto.RoomTypeDTO;
import com.kafein.melih.bookingroom.mapper.RoomTypeMapper;
import com.kafein.melih.bookingroom.repository.RoomTypeRepository;
import com.kafein.melih.bookingroom.service.base.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomTypeServiceImpl implements RoomTypeService {

    @Autowired
    private RoomTypeRepository roomTypeRepository;

    @Autowired
    private RoomTypeMapper roomTypeMapper;


    @Override
    public RoomTypeDTO save(RoomTypeDTO roomTypeDTO) {
        return roomTypeMapper.toRoomTypeDTO(roomTypeRepository.save(roomTypeMapper.toRoomType(roomTypeDTO)));
    }

    @Override
    public List<RoomTypeDTO> findAll() {

        return roomTypeMapper.toRoomTypeDTOList(roomTypeRepository.findAll());
    }

    @Override
    public RoomTypeDTO findById(int id) {

        return roomTypeMapper.toRoomTypeDTO(roomTypeRepository.findById(id));
    }




}
