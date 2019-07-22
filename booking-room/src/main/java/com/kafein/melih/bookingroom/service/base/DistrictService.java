package com.kafein.melih.bookingroom.service.base;

import com.kafein.melih.bookingroom.dto.DistrictDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DistrictService {


    DistrictDTO save(DistrictDTO districtDTO);

    List<DistrictDTO> findAll();

    DistrictDTO findById(int id);


}
