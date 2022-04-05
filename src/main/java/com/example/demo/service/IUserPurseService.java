package com.example.demo.service;

import com.example.demo.entity.UserPurse;
import reactor.core.publisher.Mono;

public interface IUserPurseService {

    Mono<UserPurse> save(UserPurse userPurse);
}
