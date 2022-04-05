package com.example.demo.service;

import com.example.demo.entity.UserPurse;
import com.example.demo.repository.IUserPurseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

public class UserPursePurseServiceImpl implements IUserPurseService {

    @Autowired
    private IUserPurseRepository userPurseRepository;

    @Override
    public Mono<UserPurse> save(UserPurse userPurse) {
        return userPurseRepository.save(userPurse);
    }
}
