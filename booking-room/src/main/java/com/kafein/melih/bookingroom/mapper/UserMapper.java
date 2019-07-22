package com.kafein.melih.bookingroom.mapper;

import com.kafein.melih.bookingroom.dto.UserDTO;
import com.kafein.melih.bookingroom.model.User;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")


public interface UserMapper {


    @Named("toUser")
    User toUser(UserDTO userDTO);

    @Named("toUserDTO")
    UserDTO toUserDTO(User user) ;

    @IterableMapping(qualifiedByName = "toUser")
    List<User> toUserList(List<UserDTO> userDTOList);

    @IterableMapping(qualifiedByName = "toUserDTO")
    List<UserDTO> toUserDTOList(List<User> userList);

}
