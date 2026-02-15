package com.github.kes1442.freela_track.service;

import com.github.kes1442.freela_track.dto.UserCreateDTO;
import com.github.kes1442.freela_track.dto.UserResponseDTO;
import com.github.kes1442.freela_track.entity.User;
import com.github.kes1442.freela_track.mapper.UserMapper;
import com.github.kes1442.freela_track.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    @Autowired
    Repository repository;

    @Autowired
    UserMapper mapper;

    //services: create user, delete user, update user, create freelance, update freelance, payments.

    public UserResponseDTO createUser(UserCreateDTO dto){
        User user = mapper.toEntity(dto);
        repository.save(user);

        return mapper.toResponse(user);

    }
}
