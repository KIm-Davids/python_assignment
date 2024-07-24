package com.semicolon.africa.demo_sorosokey.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Users extends MongoRepository <com.semicolon.africa.demo_sorosokey.data.model.User, String> {
    com.semicolon.africa.demo_sorosokey.data.model.User findUserByEmail(String email);
    com.semicolon.africa.demo_sorosokey.data.model.User findUserByName(String username);
    com.semicolon.africa.demo_sorosokey.data.model.User findUserById(String id);
}
