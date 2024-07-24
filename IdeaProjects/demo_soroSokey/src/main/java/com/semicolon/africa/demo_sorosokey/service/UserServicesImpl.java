package com.semicolon.africa.demo_sorosokey.service;

import com.semicolon.africa.demo_sorosokey.data.model.Comment;
import com.semicolon.africa.demo_sorosokey.data.model.Post;
import com.semicolon.africa.demo_sorosokey.data.model.User;
import com.semicolon.africa.demo_sorosokey.data.repository.CommentRepository;
import com.semicolon.africa.demo_sorosokey.data.repository.PostRepository;
import com.semicolon.africa.demo_sorosokey.data.repository.Users;
import com.semicolon.africa.demo_sorosokey.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class UserServicesImpl implements UserServices{
    private final Users users;
    private final PostRepository posts;
    private final CommentRepository commentRepository;

    @Override
    public UserResponse signUp(UserRequest userRequest) {
        User user = new User();
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        user.setName(userRequest.getUsername());
        users.save(user);
        return UserResponse.builder().email(userRequest.getEmail()).name(user.getName()).build();

    }

    @Override
    public CommentResponse commentToPost(CommentRequest commentRequest) {
        Post post = posts.findPostById(commentRequest.getPostId());
        Comment comment = new Comment();
        User user =  (users.findUserById(commentRequest.getCommenterId()));
        comment.setCommenter(user);
        comment.setComment(comment.getComment());
        post.setComments(new ArrayList<>());
        post.getComments().add(comment);
        comment = commentRepository.save(comment);
        posts.save(post);
        return CommentResponse.builder()
                .commenter(UserResponse.builder()
                        .name(user.getName()).email(user.getEmail()).build())
                .comment(commentRequest.getComment())
        .id(comment.getId()).build();
    }


    @Override
    public CommentResponse deleteCOmment(CommentResponse commentResponse) {
        return null;
    }

    @Override
    public SharePostResponse sharePost(SharePostResponse sharePostRequest) {
        return null;
    }
}
