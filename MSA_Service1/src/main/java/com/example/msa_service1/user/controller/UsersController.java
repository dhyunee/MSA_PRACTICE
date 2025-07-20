package com.example.msa_service1.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class UsersController {
    @GetMapping({"", "/"})
    public String hello() {
        return "hello";
    }



}
