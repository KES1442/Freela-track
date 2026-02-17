package com.github.kes1442.freela_track.controller;

import com.github.kes1442.freela_track.dto.UserCreateDTO;
import com.github.kes1442.freela_track.dto.UserResponseDTO;
import com.github.kes1442.freela_track.dto.UserUpdateDTO;
import com.github.kes1442.freela_track.service.HomeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Home {

    @Autowired
    HomeService service;

    @GetMapping
    public String test(){
        return "testing the API";
    }

    @PostMapping
    public UserResponseDTO create(@RequestBody @Valid UserCreateDTO userCreateDTO){
        return service.createUser(userCreateDTO);
    }

    @PutMapping("/{id}")
    public UserResponseDTO update(@PathVariable("id") Long id,
                                  @RequestBody @Valid UserUpdateDTO userUpdateDTO){
        return service.updateUser(id, userUpdateDTO);
    }
}
