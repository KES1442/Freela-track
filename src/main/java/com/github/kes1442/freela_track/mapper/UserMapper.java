package com.github.kes1442.freela_track.mapper;

import com.github.kes1442.freela_track.dto.project.ProjectCreateDTO;
import com.github.kes1442.freela_track.dto.project.ProjectResponseDTO;
import com.github.kes1442.freela_track.dto.project.ProjectSummaryDTO;
import com.github.kes1442.freela_track.dto.project.ProjectUpdateDTO;
import com.github.kes1442.freela_track.dto.user.UserCreateDTO;
import com.github.kes1442.freela_track.dto.user.UserDetailsDTO;
import com.github.kes1442.freela_track.dto.user.UserResponseDTO;
import com.github.kes1442.freela_track.dto.user.UserUpdateDTO;
import com.github.kes1442.freela_track.entity.Project;
import com.github.kes1442.freela_track.entity.User;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface UserMapper {

    //create User
    User toEntityUser(UserCreateDTO dto);



    //update User
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityUserFromDTO(UserUpdateDTO dto, @MappingTarget User user);


    //response User
    UserResponseDTO toResponseUser(User user);

    //user details
    @Mapping(target = "projects", source = "projects")
    UserDetailsDTO toUserDetailsDTO(User user);

    ProjectSummaryDTO toProjectSummaryDTO(Project project);

}
