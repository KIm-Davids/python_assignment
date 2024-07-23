package com.semicolon.africa.demo_sorosokey.service;

import com.semicolon.africa.demo_sorosokey.data.model.Comment;
import com.semicolon.africa.demo_sorosokey.data.model.Post;
import com.semicolon.africa.demo_sorosokey.data.repository.CommentRepository;
import com.semicolon.africa.demo_sorosokey.data.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    CommentRepository commentRepository;

//    public CommentServiceImpl(CommentRepository commentRepository) {
//        this.commentRepository = commentRepository;
//    }

    @Override
    public Comment addComment(String title, String content) {
        Comment comment = new Comment();
        comment.setTitle("title");
        comment.setComment("content");
        return commentRepository.save(comment);

    }

    @Override
    public Comment updateComment(String id, String title, String comment) {
        Comment comment1 = new Comment();
        commentRepository.findById(id);
        comment1.setTitle(title);
        comment1.setComment(comment);

        return commentRepository.save(comment1);
    }

    @Override
    public String deleteComment(String id) {
        return null;
    }

    @Override
    public List<Comment> getAllComment() {
        return null;
    }
}
