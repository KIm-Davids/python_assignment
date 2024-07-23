package com.semicolon.africa.demo_sorosokey.data.repository;

import com.semicolon.africa.demo_sorosokey.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Users extends MongoRepository <User, String> {
}
