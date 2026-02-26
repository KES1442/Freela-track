package com.github.kes1442.freela_track.dto.user;

import com.github.kes1442.freela_track.enums.Gender;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserUpdateDTO {

    @Size(min = 3, max = 50)
    private String firstName;

    @Size(min = 3, max = 50)
    private String lastName;

    @Email(message = "Invalid Email format!")
    private String email;

    @Past
    private LocalDate birthday;

    private Gender gender;
}
