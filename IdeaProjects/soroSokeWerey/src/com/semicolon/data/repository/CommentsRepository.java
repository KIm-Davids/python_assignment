package com.semicolon.data.repository;

import com.semicolon.data.models.Comment;

import java.util.List;

public interface CommentsRepository {

    long count();
    void deleteByPostId(int id);
    Comment findByPostId(int id);
    boolean isEmpty();
    void deleteAll();
    Comment findByCommentId(int id);
    void save(Comment comment);
    void deleteByCommentId(int id);
    List<Comment> findAll();
}
