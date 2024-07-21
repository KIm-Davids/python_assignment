package com.semicolon.services;

import com.semicolon.data.models.Comment;

public interface CommentService {


    Comment addComment(String title, String content);
    Comment findCommentById(int id);

}
