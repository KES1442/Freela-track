package com.github.kes1442.freela_track.dto.user;

import com.github.kes1442.freela_track.dto.project.ProjectSummaryDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;


import java.util.List;

@Getter
@AllArgsConstructor
public class UserDetailsDTO {

    private String firstName;
    private String lastName;
    private List<ProjectSummaryDTO> projects;


}
