package com.example.msa_service1.user.entity;

import com.example.msa_service1.user.common.code.DeleteYN;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "user_table")
public abstract class UserEntity extends CommonEntity implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userNumber;
   @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private String birthDate;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String nationality;
    @Column(nullable = false)
    private String jobTitle;
    @Column
    private DeleteYN deleteYN;
}
