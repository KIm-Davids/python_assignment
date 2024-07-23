package com.semicolon.africa.demo_sorosokey.service;

import com.semicolon.africa.demo_sorosokey.dto.*;

public interface UserServices {

    UserResponse signUp(UserRequest userRequest);
    CommentResponse commentToPost(CommentRequest commentRequest);
    CommentResponse deleteCOmment(CommentResponse commentResponse);
    SharePostResponse sharePost (SharePostResponse sharePostRequest);
}
