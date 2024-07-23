package com.semicolon.africa.demo_sorosokey.service;

import com.semicolon.africa.demo_sorosokey.data.model.Comment;

import java.util.List;

public interface CommentService {

    Comment addComment(String title, String comment);
    Comment updateComment(String id, String title, String comment);
    String deleteComment(String id);
    List<Comment> getAllComment();
}
