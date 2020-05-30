package com.rushikesh.authentication.app.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
@CrossOrigin("*")
public class AuthAPI {

    @GetMapping("")
    public String getWelcomeMsg(){
        return "welcome msg";
    }

    @GetMapping("/getMsg")
    public String getMsg(){
        return "hello world";
    }

    @GetMapping("/profile")
    public String getProfile(){
        return "Welcome to your profile.";
    }


}
