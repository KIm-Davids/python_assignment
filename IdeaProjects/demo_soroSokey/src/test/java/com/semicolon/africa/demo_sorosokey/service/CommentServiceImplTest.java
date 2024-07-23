package com.semicolon.africa.demo_sorosokey.service;

import com.semicolon.africa.demo_sorosokey.data.model.Comment;
import com.semicolon.africa.demo_sorosokey.data.repository.CommentRepository;
import com.semicolon.africa.demo_sorosokey.data.repository.PostRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CommentServiceImplTest {

    @Autowired
    CommentService commentService;
    @Autowired
    CommentRepository repository;


    @BeforeEach
    void deleteAll(){
        repository.deleteAll();

    }

    @Test
    void addComment() {

    Comment comment = commentService.addComment("new comment", "new comment body");
    assertThat(comment.getId()).isNotNull();
    }

    @Test
    void updatePost() {
        Comment comment = commentService.addComment("new Comment", "new comment body");
        repository.findById(comment.getId());
        comment.setComment("Updated comment");
        comment.setTitle("updated comment");
        repository.save(comment);
        assertThat(comment.getComment()).isEqualTo("Updated comment", "updated comment");
    }

    @Test
    void deletePost() {
        Comment comment = commentService.addComment("new Comment", "new comment body");
        repository.save(comment);
        repository.delete(comment);

    }

    @Test
    void getAllComment() {
        Comment comment = commentService.addComment("new Comment", "new comment body");
        repository.save(comment);
        assertThat(repository.findAll().size()).isNotNull();


    }
}