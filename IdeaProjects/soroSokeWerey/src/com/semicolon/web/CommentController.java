package com.semicolon.web;

import com.semicolon.data.models.Comment;
import com.semicolon.data.repository.CommentRepositoryImpl;
import com.semicolon.services.CommentService;
import com.semicolon.services.CommentServiceImpl;
import org.springframework.web.bind.annotation.*;


@RestController
public class CommentController {

    CommentService service = new CommentServiceImpl();

    @PostMapping("/try3")
    public String createComment(@RequestBody String title, String comment){
        service.addComment(title, comment);
        return "successful";
    }

    @GetMapping("/try/{id}")
    public Comment getComment(@PathVariable("id") int id){
        return service.findCommentById(id);
    }

}
