package com.kafein.melih.bookingroom.mapper;


import com.kafein.melih.bookingroom.dto.UserTypeDTO;
import com.kafein.melih.bookingroom.model.UserType;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")


public interface UserTypeMapper {


    @Named("toUserType")
    UserType toUserType(UserTypeDTO userTypeDTO);

    @Named("toUserTypeDTO")
    UserTypeDTO toUserTypeDTO(UserType userType) ;

    @IterableMapping(qualifiedByName = "toRoom")
    List<UserType> toUserTypeList(List<UserTypeDTO> UserTypeDTOList);

    @IterableMapping(qualifiedByName = "toUserTypeDTO")
    List<UserTypeDTO> toUserTypeDTOList(List<UserType> userTypeList);


}
