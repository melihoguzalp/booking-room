package com.kafein.melih.bookingroom.service;

import com.kafein.melih.bookingroom.dto.RoomDTO;
import com.kafein.melih.bookingroom.mapper.RoomMapper;
import com.kafein.melih.bookingroom.repository.RoomRepository;
import com.kafein.melih.bookingroom.service.base.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {


    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private RoomMapper roomMapper;


    @Override
    public RoomDTO save(RoomDTO roomDTO) {
        roomDTO.setActive(false);
        return roomMapper.toRoomDTO(roomRepository.save(roomMapper.toRoom(roomDTO)));
    }

    @Override
    public List<RoomDTO> findAll() {

        return roomMapper.toRoomDTOList(roomRepository.findAll());
    }

    @Override
    public RoomDTO findById(int id) {
        return roomMapper.toRoomDTO(roomRepository.findById(id));
    }

    @Override
    public List<RoomDTO> findAllByDistrict_Id(int id) {
        return roomMapper.toRoomDTOList(roomRepository.findAllByDistrict_Id(id));
    }

    @Override
    public List<RoomDTO> findRoomsByRoomTypeAndDistrict(int roomTypeId, int districtId) {
        return roomMapper.toRoomDTOList(roomRepository.findRoomsByRoomTypeAndDistrict(roomTypeId, districtId));
    }

    @Override
    public RoomDTO setRoomActiveStatus(int id,boolean activeStatus) {
        roomRepository.findById(id).setActive(activeStatus);
        return roomMapper.toRoomDTO(roomRepository.findById(id));
    }
}
