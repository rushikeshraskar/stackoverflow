package com.stackoverflow.api.user;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController("/")
@CrossOrigin("*")
public class UserApi {

    @GetMapping("/getMsg")
    public String getMsg(){
        return "Hello world";
    }
}
