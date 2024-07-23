package com.semicolon.africa.demo_sorosokey.data.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document
@RequiredArgsConstructor
public class Comment {
    @DBRef
    private User commenter;
    String comment;
    private String id;

}