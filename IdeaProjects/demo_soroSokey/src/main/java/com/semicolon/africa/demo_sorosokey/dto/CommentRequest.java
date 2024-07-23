package com.semicolon.africa.demo_sorosokey.dto;


import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentRequest {

    private String commmentid;
    private String comment;
}
