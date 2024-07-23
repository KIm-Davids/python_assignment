package com.semicolon.africa.demo_sorosokey.data.repository;

import com.semicolon.africa.demo_sorosokey.data.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    Post findPostById(String id);

}
































