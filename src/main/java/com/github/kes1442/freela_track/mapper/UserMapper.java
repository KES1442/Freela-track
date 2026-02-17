package com.github.kes1442.freela_track.mapper;

import com.github.kes1442.freela_track.dto.UserCreateDTO;
import com.github.kes1442.freela_track.dto.UserResponseDTO;
import com.github.kes1442.freela_track.dto.UserUpdateDTO;
import com.github.kes1442.freela_track.entity.User;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface UserMapper {

    //create
    User toEntity(UserCreateDTO dto);

    //update
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDTO(UserUpdateDTO dto, @MappingTarget User user);


    UserResponseDTO toResponse(User user);
}
