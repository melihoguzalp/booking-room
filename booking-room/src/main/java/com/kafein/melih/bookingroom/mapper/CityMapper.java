package com.kafein.melih.bookingroom.mapper;

import com.kafein.melih.bookingroom.dto.CityDTO;
import com.kafein.melih.bookingroom.model.City;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CityMapper {

    @Named("toCity")
    City toCity(CityDTO cityDTO);

    @Named("toCityDTO")
    CityDTO toCityDTO(City city);

    @IterableMapping(qualifiedByName = "toCity")
    List<City> toCityList(List<CityDTO> cityDTOList);

    @IterableMapping(qualifiedByName = "toCityDTO")
    List<CityDTO> toCityDTOList(List<City> cityList);

}
