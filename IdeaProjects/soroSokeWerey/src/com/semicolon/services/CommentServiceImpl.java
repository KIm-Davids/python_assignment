package com.semicolon.services;

import com.semicolon.data.models.Comment;
import com.semicolon.data.repository.CommentRepositoryImpl;

public class CommentServiceImpl implements CommentService{

    CommentRepositoryImpl repository = new CommentRepositoryImpl();
    Comment comment = new Comment();

    @Override
    public Comment addComment(String title, String content) {
        comment.setTitle(title);
        comment.setComment(content);
        repository.save(comment);
        return comment;
    }

    @Override
    public Comment findCommentById(int id) {
        return repository.findByCommentId(id);
    }
}
