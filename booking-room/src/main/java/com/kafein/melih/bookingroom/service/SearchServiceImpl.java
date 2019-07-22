package com.kafein.melih.bookingroom.service;

import com.kafein.melih.bookingroom.dto.RoomDTO;
import com.kafein.melih.bookingroom.model.City;
import com.kafein.melih.bookingroom.model.District;
import com.kafein.melih.bookingroom.model.Search;
import com.kafein.melih.bookingroom.model.UserType;
import com.kafein.melih.bookingroom.repository.CityRepository;
import com.kafein.melih.bookingroom.repository.DistrictRepository;
import com.kafein.melih.bookingroom.repository.RentRepository;
import com.kafein.melih.bookingroom.repository.RoomRepository;
import com.kafein.melih.bookingroom.service.base.RoomService;
import com.kafein.melih.bookingroom.service.base.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private RentRepository rentRepository;

    @Autowired
    private RoomService roomService;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private DistrictRepository districtRepository;


    @Override
    public List<RoomDTO> findBySearch(int district) {
        List<RoomDTO> roomDTOList=new ArrayList<>();
        roomDTOList=roomService.findAllByDistrict_Id(district);
        return roomDTOList;
    }
}
