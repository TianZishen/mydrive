package com.zishen.mydrive.controller;

import com.zishen.mydrive.model.User;
import com.zishen.mydrive.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    UserService userService;
    @GetMapping("/login")
    public String doLogin(User user){
        return userService.getByUserNameAndPassword(user).toString();
    }
}
