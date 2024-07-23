package com.semicolon.africa.demo_sorosokey.data.model;

import lombok.*;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {

    private String id;
    private String name;
    private String email;

}

