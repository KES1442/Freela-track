package com.github.kes1442.freela_track.mapper;

import com.github.kes1442.freela_track.dto.UserCreateDTO;
import com.github.kes1442.freela_track.dto.UserResponseDTO;
import com.github.kes1442.freela_track.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserCreateDTO dto);

    UserResponseDTO toResponse(User user);
}
