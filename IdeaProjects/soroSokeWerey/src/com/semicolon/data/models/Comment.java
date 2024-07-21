package com.semicolon.data.models;


import java.time.LocalDateTime;
import java.util.List;

public class Comment {

    private int id;
    private int userId;
    private String title;
    private String comment;
    private List<Comment> comments;
    private LocalDateTime getCreatedAt = LocalDateTime.now();

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    };

    public LocalDateTime getGetCreatedAt() {
        return getCreatedAt;
    }

    public void setGetCreatedAt(LocalDateTime getCreatedAt) {
        this.getCreatedAt = getCreatedAt;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Comment> getListOfComments() {
        return comments;
    }

    public LocalDateTime getGetUpdatedAt() {
        return getUpdatedAt;
    }

    public void setGetUpdatedAt(LocalDateTime getUpdatedAt) {
        this.getUpdatedAt = getUpdatedAt;
    }

    private LocalDateTime getUpdatedAt;

}
