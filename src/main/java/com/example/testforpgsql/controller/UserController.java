package com.example.testforpgsql.controller;

import com.example.testforpgsql.entity.UserEntity;
import com.example.testforpgsql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("info")
    public UserEntity getInfo(){
        return userService.getInfo();
    }

}
