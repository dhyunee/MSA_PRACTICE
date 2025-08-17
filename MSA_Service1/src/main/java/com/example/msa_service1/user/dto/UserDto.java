package com.example.msa_service1.user.dto;

import com.example.msa_service1.user.common.code.DeleteYN;
import com.example.msa_service1.user.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class UserDto {
    private String userNumber;
    private String userName;
    private String birthDate;
    private String gender;
    private String email;
    private String phoneNumber;
    private String address;
    private String nationality;
    private String jobTitle;
    private DeleteYN deleteYN;


    public static UserDto fromEntity(UserEntity user) {
        return UserDto.builder()
                .userName(user.getUserName())
                .userName(user.getUserName())
                .birthDate(user.getBirthDate())
                .gender(user.getGender())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .address(user.getAddress())
                .nationality(user.getNationality())
                .jobTitle(user.getJobTitle())
                .deleteYN(user.getDeleteYN())
                .build();
    }
}
