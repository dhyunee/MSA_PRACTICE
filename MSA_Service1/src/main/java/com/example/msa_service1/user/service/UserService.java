package com.example.msa_service1.user.service;

import com.example.msa_service1.user.dto.UserDto;
import com.example.msa_service1.user.entity.UserEntity;

public interface UserService{
    UserEntity getUserByUserNumber(String userNumber);

    void createUser(UserDto user);

    void updateUser(UserDto user);

    void deleteUser(String userNumber);
}
