package com.semicolon.africa.demo_sorosokey.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentResponse {

    private String id;
    private String comment;
    private UserResponse commenter;
}
