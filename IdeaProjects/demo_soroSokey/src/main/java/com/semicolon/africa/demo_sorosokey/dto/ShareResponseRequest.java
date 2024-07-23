package com.semicolon.africa.demo_sorosokey.dto;

import lombok.*;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ShareResponseRequest {

    private String postAuthorId;
    private String postRecipientId;
    private String postId;
}
