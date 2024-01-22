package com.example.bookmyshow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.bookmyshow.dto.ResponseStatus;
import com.example.bookmyshow.dto.SignUpRequestDTO;
import com.example.bookmyshow.dto.SignUpResponseDTO;
import com.example.bookmyshow.models.User;
import com.example.bookmyshow.services.UserService;

@Controller
public class UserController {
    private UserService userService;
    @Autowired
    UserController(UserService userService){
        this.userService = userService;
    }
    public SignUpResponseDTO signUp(SignUpRequestDTO signUpRequestDTO){
        SignUpResponseDTO response = new SignUpResponseDTO();
        try {
            User user = userService.signUp(
                    signUpRequestDTO.getEmail(),
                    signUpRequestDTO.getPassword()
            );
            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setUserId(user.getId());
        } catch (Exception e){
            response.setResponseStatus(ResponseStatus.FAILED);
        }
        return response;
    }
}