package com.kafein.melih.bookingroom.mapper;

import com.kafein.melih.bookingroom.dto.RoomTypeDTO;
import com.kafein.melih.bookingroom.model.RoomType;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoomTypeMapper {


    @Named("toRoomType")
    RoomType toRoomType(RoomTypeDTO rtypesDTO);

    @Named("toRoomTypeDTO")
    RoomTypeDTO toRoomTypeDTO(RoomType rtypes) ;

    @IterableMapping(qualifiedByName = "toRoomType")
    List<RoomType> toRoomTypeList(List<RoomTypeDTO> roomTypeDTOList);

    @IterableMapping(qualifiedByName = "toRoomTypeDTO")
    List<RoomTypeDTO> toRoomTypeDTOList(List<RoomType> rtypesList);



}
