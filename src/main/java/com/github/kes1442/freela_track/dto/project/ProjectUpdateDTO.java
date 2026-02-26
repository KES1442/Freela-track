package com.github.kes1442.freela_track.dto.project;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectUpdateDTO {

    @NotBlank(message = "Type a title!")
    @Size(min = 5, max = 200)
    private String projectTitle;

    @NotNull(message = "set a price!")
    private Double price;
}
