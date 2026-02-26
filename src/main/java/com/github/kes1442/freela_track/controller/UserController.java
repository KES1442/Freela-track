package com.github.kes1442.freela_track.controller;

import com.github.kes1442.freela_track.dto.user.UserCreateDTO;
import com.github.kes1442.freela_track.dto.user.UserDetailsDTO;
import com.github.kes1442.freela_track.dto.user.UserResponseDTO;
import com.github.kes1442.freela_track.dto.user.UserUpdateDTO;
import com.github.kes1442.freela_track.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/{id}/details")
    public UserDetailsDTO userDetails(@PathVariable Long id){

        return service.userDetails(id);
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
