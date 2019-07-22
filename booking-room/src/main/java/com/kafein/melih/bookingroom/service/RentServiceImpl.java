package com.kafein.melih.bookingroom.service;

import com.kafein.melih.bookingroom.dto.RentDTO;
import com.kafein.melih.bookingroom.dto.UserTypeDTO;
import com.kafein.melih.bookingroom.mapper.RentMapper;
import com.kafein.melih.bookingroom.repository.RentRepository;
import com.kafein.melih.bookingroom.repository.UserTypeRepository;
import com.kafein.melih.bookingroom.service.base.RentService;
import com.kafein.melih.bookingroom.service.base.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RentServiceImpl implements RentService {


    @Autowired
    private RentRepository rentRepository;

    @Autowired
    private RentMapper rentMapper;

    @Autowired
    private UserTypeRepository userTypeRepository;

    @Autowired
    private RoomService roomService;


    @Override
    public RentDTO save(RentDTO rentDTO) {
        rentDTO.setUserType(checkUserType(rentDTO.getUserType()));

        if(roomService.findById(rentDTO.getRoom().getId()).getOwner().getId()==rentDTO.getUser().getId())
            throw new IllegalArgumentException("You can't rent your own room");

        else if(roomService.findById(rentDTO.getRoom().getId()).getActive()==true)
            throw new IllegalArgumentException("The room is not empty");
        else{
            roomService.setRoomActiveStatus(rentDTO.getRoom().getId(),true);
            return rentMapper.toRentDTO(rentRepository.save(rentMapper.toRent(rentDTO)));
        }
    }

    private List<UserTypeDTO> checkUserType(List<UserTypeDTO> userTypes){
        List<UserTypeDTO> theUserType = new ArrayList<>();
        for (UserTypeDTO userType : userTypes)
            if (userTypeRepository.findById(userType.getId()) != null)
                theUserType.add(userType);
        return theUserType;

    }

    @Override
    public List<RentDTO> findAll() {

        return rentMapper.toRentDTOList(rentRepository.findAll());
    }

    @Override
    public RentDTO findById(int id) {

        return rentMapper.toRentDTO(rentRepository.findById(id));
    }

   // @Override
   // public RentDTO findByUser_Email(String email) {

   //     return rentMapper.toRentDTO(rentRepository.findByUser_Email(email));
   // }


}
