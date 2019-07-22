package com.kafein.melih.bookingroom.mapper;

import com.kafein.melih.bookingroom.dto.RoomDTO;
import com.kafein.melih.bookingroom.model.Room;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")


public interface RoomMapper {



    @Named("toRoom")
    Room toRoom(RoomDTO roomDTO);

    @Named("toRoomDTO")
    RoomDTO toRoomDTO(Room room) ;

    @IterableMapping(qualifiedByName = "toRoom")
    List<Room> toRoomList(List<RoomDTO> roomDTOList);

    @IterableMapping(qualifiedByName = "toRoomDTO")
    List<RoomDTO> toRoomDTOList(List<Room> roomList);



}
