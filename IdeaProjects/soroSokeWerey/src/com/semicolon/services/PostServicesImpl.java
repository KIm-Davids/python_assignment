package com.semicolon.services;

import com.semicolon.data.models.Post;
import com.semicolon.data.repository.PostRepository;
import com.semicolon.data.repository.PostRepositoryImpl;

public class PostServicesImpl implements PostService{

    private PostRepository postRepository;
    PostRepository repository = new PostRepositoryImpl();

    public Post findPostById(int id){
       return repository.findById(id);
    }

    public Post addPost(String title, String content){
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        return repository.save(post);

    }

    public boolean titleExistFor(String title){
        for (Post itemsInList : repository.findByAll()) {
            if (title.equalsIgnoreCase(itemsInList.getTitle())) {
                throw new IllegalArgumentException("Title already exists");
            }
        }
        return true;
    }


}
