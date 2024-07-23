package com.semicolon.africa.demo_sorosokey.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder

public class UserResponse {
    private String id;
    private String name;
    private String email;


}
