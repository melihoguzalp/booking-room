package com.kafein.melih.bookingroom.service;

import com.kafein.melih.bookingroom.dto.CityDTO;
import com.kafein.melih.bookingroom.mapper.CityMapper;
import com.kafein.melih.bookingroom.repository.CityRepository;
import com.kafein.melih.bookingroom.service.base.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {


    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private CityMapper cityMapper;


    @Override
    public CityDTO save(CityDTO cityDTO) {
        return cityMapper.toCityDTO(cityRepository.save(cityMapper.toCity(cityDTO)));
    }

    @Override
    public List<CityDTO> findAll() {

        return cityMapper.toCityDTOList(cityRepository.findAll());
    }

    @Override
    public CityDTO findById(int id) {

        return cityMapper.toCityDTO(cityRepository.findById(id));
    }

    @Override
    public List<CityDTO> findAllByCname(String cname) {

        return cityMapper.toCityDTOList(cityRepository.findAllByCname(cname));
    }





}
