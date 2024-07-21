package com.semicolon.data.repository;

import com.semicolon.data.models.Comment;
import com.semicolon.data.models.Post;

import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentsRepository {

    private Post post = new Post();
    private long count = 0;
    List<Comment> findAll = new ArrayList<>();
    private boolean deleteAll = false;
    private boolean isEmpty = true;

    @Override
    public long count() {
        if(deleteAll)  return count = 0;
        return count;
    }

    @Override
    public void deleteByPostId(int id) {
        for (Comment itemsInList : findAll) {
            if (id == itemsInList.getUserId()) {
                findAll.remove(itemsInList);
                break;
            }
        }
    }

    @Override
    public Comment findByPostId(int id) {
        for (Comment itemsInList : findAll) {
            if (id == post.getId()) {
                return itemsInList;
            }
        }
            return null;
    }

    @Override
    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public void deleteAll() {
        findAll.clear();
    }

    @Override
    public Comment findByCommentId(int id) {
        for (Comment itemsInList : findAll) if (id == itemsInList.getId()) return itemsInList;
        return null;
    }

    @Override
    public void save(Comment comment) {
        comment.setId(generateCommentId());
        this.findAll.add(comment);
    }

    @Override
    public void deleteByCommentId(int id) {
        for (Comment itemsInList : findAll){
            if (id == itemsInList.getUserId()){
                findAll.remove(itemsInList);
                break;
            }
        }
    }

    @Override
    public List<Comment> findAll() {
        return findAll;
    }

    public int generateCommentId(){
        return findAll.size() + 1;
    }

}
