package com.semicolon.web;

import com.semicolon.data.models.Post;
import com.semicolon.services.PostRequest;
import com.semicolon.services.PostServicesImpl;
import com.semicolon.data.repository.PostRepositoryImpl;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    private com.semicolon.services.PostService PostService;
    private final PostServicesImpl service = new PostServicesImpl();
    private PostRepositoryImpl repository = new PostRepositoryImpl();

    @PostMapping("/try2")
    public String createPost(@RequestBody String title, String content){
        service.addPost(title,content);
        return "successful";
    }

    @GetMapping("/try3/{id}")
    public Post getPost(@PathVariable("id") int id){
        return service.findPostById(id);
    }




}
