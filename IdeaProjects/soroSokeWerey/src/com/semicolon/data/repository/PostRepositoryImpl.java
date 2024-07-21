package com.semicolon.data.repository;

import com.semicolon.data.models.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryImpl implements PostRepository {

    List<Post> listOfPosts = new ArrayList<>();
    private long count = 1;
    private boolean deleteAll = false;
    Post post = new Post();


    @Override
    public List<Post> findByAll() {
        return listOfPosts;
    }

    @Override
    public long count() {
        if(deleteAll)  return count = 1;
        return count;
    }

    @Override
    public Post findById(int id) {
        for (Post itemsInList : listOfPosts) {
            if(id == itemsInList.getId()) {
                return itemsInList;
            }
        }
        return null;
    }

    @Override
    public void deleteAll() {
        listOfPosts.clear();
    }

    @Override
    public Post save(Post post) {
        post.setId(generateUniqueId());
        this.listOfPosts.add(post);
        return post;
    }

    @Override
    public void deleteById(int id) {
        for (Post itemsInList : listOfPosts){
            if (id == itemsInList.getId()){
                listOfPosts.remove(itemsInList);
                break;
            }
        }
    }

    public int generateUniqueId(){
        return listOfPosts.size() + 1;
    }

    @Override
    public String toString() {
        return "PostRepositoryImpl{" +
                "listOfPosts=" + listOfPosts +
                ", count=" + count +
                ", deleteAll=" + deleteAll +
                '}';
    }
}
