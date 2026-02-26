package com.github.kes1442.freela_track.dto.project;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class ProjectResponseDTO {

    private String projectTitle;
    private BigDecimal price;
    private String description;

}
