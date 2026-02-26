package com.github.kes1442.freela_track.service;

import com.github.kes1442.freela_track.dto.user.UserCreateDTO;
import com.github.kes1442.freela_track.dto.user.UserDetailsDTO;
import com.github.kes1442.freela_track.dto.user.UserResponseDTO;
import com.github.kes1442.freela_track.dto.user.UserUpdateDTO;
import com.github.kes1442.freela_track.entity.User;
import com.github.kes1442.freela_track.mapper.UserMapper;
import com.github.kes1442.freela_track.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper mapper;

    //services: create user, delete user, update user, create freelance, update freelance, payments.

    @Transactional
    public UserDetailsDTO userDetails(Long id){
        User user = userRepository.findById(id).orElseThrow();


        return mapper.toUserDetailsDTO(user);
    }

    public UserResponseDTO createUser(UserCreateDTO dto){
        User user = mapper.toEntityUser(dto);
        userRepository.save(user);

        return mapper.toResponseUser(user);

    }

    public UserResponseDTO updateUser(Long id, UserUpdateDTO dto){
        User user = userRepository.findById(id).orElseThrow();

        mapper.updateEntityUserFromDTO(dto, user);

        userRepository.save(user);

        return mapper.toResponseUser(user);
    }
}
