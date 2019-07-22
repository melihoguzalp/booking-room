package com.kafein.melih.bookingroom.service.base;

import com.kafein.melih.bookingroom.dto.CityDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CityService {

    //@Autowired
    //private CityRepository cityRepository;

    CityDTO save(CityDTO cityDTO);

    List<CityDTO> findAll();

    CityDTO findById(int id);

    List<CityDTO> findAllByCname(String cname);

}
