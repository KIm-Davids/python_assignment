package com.semicolon.africa.demo_sorosokey.service;

import com.semicolon.africa.demo_sorosokey.data.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {

    Post addPost(String title, String content);
    Post updatePost(String id, String newTitle, String newContent);
    String deletePost(String id);
    List<Post> getAllPost();

}
