package com.semicolon.africa.demo_sorosokey.service;

import com.semicolon.africa.demo_sorosokey.data.model.Post;
import com.semicolon.africa.demo_sorosokey.data.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PostServiceImplTest {
    @Autowired
    private PostService postService;
    @Autowired
    private PostRepository postRepository;

    @BeforeEach
    void setUp(){
        postRepository.deleteAll();
    }

    @Test
    void addPost() {

        Post post = postService.addPost("kim", " content");
        assertThat(post.getId()).isNotNull();
    }

    @Test
    void updatePost() {

        Post post = postService.addPost("title", "content");
        postService.updatePost(post.getId(), "mfon", "New Content");

        assertThat(postRepository.findPostById(post.getId())).isNotNull();
        assertThat(postRepository.findPostById(post.getId()).getTitle()).isEqualTo("New Title");

    }

    @Test
    void deletePost() {

        Post post = postService.addPost("title", "content");

        postService.deletePost(post.getId());
        assertThat(postRepository.findPostById(post.getId())).isNull();

    }

    @Test
    void getAllPost() {

        Post post = postService.addPost("ebuka","content");
        assertThat(postService.getAllPost()).hasSize(1);

    }
}