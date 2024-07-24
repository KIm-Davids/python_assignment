package com.semicolon.africa.demo_sorosokey.dto;


import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentRequest {

    private String commenterId;
    private String comment;
    private String postId;
}
