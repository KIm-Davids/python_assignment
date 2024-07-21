package com.semicolon.data.models;

import java.time.LocalDateTime;
import java.util.List;

public class Post {


    private int id;
    private String title;
    private String content;
    private List<Comment> comments;
    private LocalDateTime getCreatedAt = LocalDateTime.now();
    private LocalDateTime getUpdatedAt;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public LocalDateTime getGetUpdatedAt() {
        return getUpdatedAt;
    }

    public void setGetUpdatedAt(LocalDateTime getUpdatedAt) {
        this.getUpdatedAt = getUpdatedAt;
    }

    public LocalDateTime getGetCreatedAt() {
        return getCreatedAt;
    }

    public void setGetCreatedAt(LocalDateTime getCreatedAt) {
        this.getCreatedAt = getCreatedAt;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", comments=" + getComments() +
                ", getCreatedAt=" + getCreatedAt +
                ", getUpdatedAt=" + getUpdatedAt +
                '}';
    }

    public void setId(int id) {
        this.id = id;

    }

}
