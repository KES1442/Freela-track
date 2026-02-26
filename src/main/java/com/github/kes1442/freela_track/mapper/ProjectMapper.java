package com.github.kes1442.freela_track.mapper;

import com.github.kes1442.freela_track.dto.project.ProjectCreateDTO;
import com.github.kes1442.freela_track.dto.project.ProjectResponseDTO;
import com.github.kes1442.freela_track.dto.project.ProjectUpdateDTO;
import com.github.kes1442.freela_track.entity.Project;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    //create Project
    Project toEntityProject(ProjectCreateDTO dtoProject);

    //update Project
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityProjectFromDTO(ProjectUpdateDTO dtoUpdate, @MappingTarget Project project);

    //Response Project
    ProjectResponseDTO toResponseProject(Project project);
}
