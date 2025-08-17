package com.example.msa_service1.user.repository;

import com.example.msa_service1.user.common.code.DeleteYN;
import com.example.msa_service1.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,String> {
    Optional<UserEntity> findByUserNumber(String userNumber);
}
