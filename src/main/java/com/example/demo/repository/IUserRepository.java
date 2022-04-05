package com.example.demo.repository;

import com.example.demo.entity.UserPurse;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IUserRepository extends ReactiveMongoRepository<UserPurse, String> {
}
