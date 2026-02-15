package com.github.kes1442.freela_track.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.kes1442.freela_track.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import tools.jackson.databind.annotation.JsonSerialize;
import tools.jackson.databind.ext.javatime.ser.LocalDateTimeSerializer;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class UserResponseDTO {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Gender gender;
    private String email;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;
}
