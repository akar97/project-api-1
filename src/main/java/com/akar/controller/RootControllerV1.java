package com.akar.controller;

import com.akar.entity.UserEntityV1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RootControllerV1 {
    @GetMapping("/v1/test")
    public String returnTestString(){
        UserEntityV1 userEntity = UserEntityV1.builder()
                .name("test1")
                .build();

        return userEntity.toString();
    }
}
