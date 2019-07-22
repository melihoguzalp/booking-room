package com.kafein.melih.bookingroom.service;

import com.kafein.melih.bookingroom.dto.DistrictDTO;
import com.kafein.melih.bookingroom.mapper.DistrictMapper;
import com.kafein.melih.bookingroom.repository.DistrictRepository;
import com.kafein.melih.bookingroom.service.base.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {


    @Autowired
    private DistrictRepository districtRepository;

    @Autowired
    private DistrictMapper districtMapper;


    @Override
    public DistrictDTO save(DistrictDTO districtDTO) {
        return districtMapper.toDistrictDTO(districtRepository.save(districtMapper.toDistrict(districtDTO)));
    }

    @Override
    public List<DistrictDTO> findAll() {

        return districtMapper.toDistrictDTOList(districtRepository.findAll());
    }

    @Override
    public DistrictDTO findById(int id) {

        return districtMapper.toDistrictDTO(districtRepository.findById(id));
    }



}
