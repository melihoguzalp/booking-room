package com.kafein.melih.bookingroom.mapper;

import com.kafein.melih.bookingroom.dto.DistrictDTO;
import com.kafein.melih.bookingroom.model.District;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DistrictMapper {


    @Named("toDistrict")
    District toDistrict(DistrictDTO districtDTO);

    @Named("toDistrictDTO")
    DistrictDTO toDistrictDTO(District district);

    @IterableMapping(qualifiedByName = "toDistrict")
    List<District> toDistrictList(List<DistrictDTO> districtDTOList);

    @IterableMapping(qualifiedByName = "toDistrictDTO")
    List<DistrictDTO> toDistrictDTOList(List<District> districtList);


}
