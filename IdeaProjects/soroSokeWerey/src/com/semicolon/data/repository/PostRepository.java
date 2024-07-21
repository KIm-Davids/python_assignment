package com.semicolon.data.repository;

import com.semicolon.data.models.Post;

import java.util.List;

public interface PostRepository {

    List<Post> findByAll();
    long count();
    Post findById(int id);
    void deleteAll();
    Post save(Post post);
    void deleteById(int id);
    int generateUniqueId();

}
