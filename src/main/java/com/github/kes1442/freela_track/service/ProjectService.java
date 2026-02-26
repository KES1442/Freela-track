package com.github.kes1442.freela_track.service;

import com.github.kes1442.freela_track.dto.project.ProjectCreateDTO;
import com.github.kes1442.freela_track.dto.project.ProjectResponseDTO;
import com.github.kes1442.freela_track.entity.Project;
import com.github.kes1442.freela_track.entity.User;
import com.github.kes1442.freela_track.mapper.ProjectMapper;
import com.github.kes1442.freela_track.repository.ProjectRepository;
import com.github.kes1442.freela_track.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ProjectRepository repository;


    @Autowired
    ProjectMapper mapper;

    public ProjectResponseDTO create(Long userId, ProjectCreateDTO dto){


        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Project project = mapper.toEntityProject(dto);
        project.setUser(user);

        repository.save(project);

        return mapper.toResponseProject(project);
    }


}
