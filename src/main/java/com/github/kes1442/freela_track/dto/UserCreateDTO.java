package com.github.kes1442.freela_track.dto;

import com.github.kes1442.freela_track.enums.Gender;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;

@Getter
@Setter
public class UserCreateDTO {


    private Long id;

    @NotBlank(message = "Type a name!")
    @Size(min = 3, max = 50)
    private String firstName;

    @NotBlank(message = "Type a lastName!")
    @Size(min = 3, max = 50)
    private String lastName;

    @Email(message = "Type a Email!")
    @NotBlank(message = "Email can't be blank!")
    private String email;

    @NotNull
    @Past
    private LocalDate birthday;

    @NotNull(message = "Select a gender!")
    private Gender gender;





}

