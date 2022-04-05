package com.example.demo.controller;

import com.example.demo.entity.UserPurse;
import com.example.demo.service.IUserPurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user-purse")
public class UserPurseController {

    @Autowired
    private IUserPurseService userPurseService;

    @PostMapping
    public Mono<UserPurse> create(@RequestBody UserPurse userPurse) {
        return userPurseService.save(userPurse);
    }
}
