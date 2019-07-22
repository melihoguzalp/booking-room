package com.kafein.melih.bookingroom.mapper;

import com.kafein.melih.bookingroom.dto.RentDTO;
import com.kafein.melih.bookingroom.model.Rent;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")


public interface RentMapper {


    @Named("toRent")
    Rent toRent(RentDTO rentDTO);

    @Named("toRentDTO")
    RentDTO toRentDTO(Rent rent);

    @IterableMapping(qualifiedByName = "toRent")
    List<Rent> toRentList(List<RentDTO> rentDTOList);

    @IterableMapping(qualifiedByName = "toRentDTO")
    List<RentDTO> toRentDTOList(List<Rent> rentList);

}
