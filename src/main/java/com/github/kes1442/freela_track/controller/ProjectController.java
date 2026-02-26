package com.github.kes1442.freela_track.controller;

import com.github.kes1442.freela_track.dto.project.ProjectCreateDTO;
import com.github.kes1442.freela_track.dto.project.ProjectResponseDTO;
import com.github.kes1442.freela_track.service.ProjectService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/{userId}/projects")
public class ProjectController {

    @Autowired
    ProjectService service;

    @PostMapping
    public ProjectResponseDTO create(@PathVariable Long userId,
                                     @RequestBody @Valid ProjectCreateDTO projectCreateDTO){
        return service.create(userId, projectCreateDTO);
    }
}