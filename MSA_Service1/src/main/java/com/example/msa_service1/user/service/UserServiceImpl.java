package com.example.msa_service1.user.service;

import com.example.msa_service1.user.common.exception.CustomException;
import com.example.msa_service1.user.common.exception.ErrCode;
import com.example.msa_service1.user.dto.UserDto;
import com.example.msa_service1.user.entity.UserEntity;
import com.example.msa_service1.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserEntity getUserByUserNumber(String userNumber){
        return userRepository.findByUserNumber(userNumber).orElseThrow(()->new CustomException(ErrCode.USER_NOT_FOUND));
    }

    public void createUser(UserDto user){

    }

    public void updateUser(UserDto user){

    }

    public void deleteUser(String userNumber){

    }

}
