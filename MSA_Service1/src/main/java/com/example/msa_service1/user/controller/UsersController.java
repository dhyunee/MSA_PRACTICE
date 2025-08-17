package com.example.msa_service1.user.controller;

import com.example.msa_service1.user.dto.ResultDto;
import com.example.msa_service1.user.dto.UserDto;
import com.example.msa_service1.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
@RequiredArgsConstructor
@Slf4j
public class UsersController {

    private final UserService userService;

    @GetMapping({"", "/"})
    public String hello() {
        return "hello";
    }

    @PostMapping()
    public ResponseEntity<ResultDto<Boolean>> signUp(@Validated @ModelAttribute UserDto userDto, BindingResult bindingResult ) {
        validateUser(bindingResult);

        userService.createUser(userDto);
        return ResponseEntity.ok().build();
    }

    public void validateUser(BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            List<FieldError> fieldErrorList = bindingResult.getFieldErrors();
            fieldErrorList.forEach(fieldError -> log.info(fieldError.getDefaultMessage()));
            throw new IllegalArgumentException();
        }

    }





}
