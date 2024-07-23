package com.semicolon.africa.demo_sorosokey.service;

import com.semicolon.africa.demo_sorosokey.data.model.Post;
import com.semicolon.africa.demo_sorosokey.data.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImpl implements PostService{
@Autowired
PostRepository postRepository;

//    private final PostRepository postRepository;
//
//    public PostServiceImpl(PostRepository postRepository) {
//        this.postRepository = postRepository;
//    }

    @Override
    public Post addPost(String title, String content) {
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);

        return postRepository.save(post);
    }

    @Override
    public Post updatePost(String id, String newTitle, String newContent) {
        Post post = postRepository.findPostById(id);
        post.setTitle(newTitle);
        post.setContent(newContent);
        return postRepository.save(post);
    }

    @Override
    public String deletePost(String id) {
        Post post = postRepository.findPostById(id);
        postRepository.delete(post);
        return "Post Deleted Successfully";
    }

    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }
}
