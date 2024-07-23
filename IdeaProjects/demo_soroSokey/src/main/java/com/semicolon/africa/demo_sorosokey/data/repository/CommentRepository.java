package com.semicolon.africa.demo_sorosokey.data.repository;

import com.semicolon.africa.demo_sorosokey.data.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
}
