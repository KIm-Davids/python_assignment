package com.semicolon;

import com.semicolon.data.models.Post;
import com.semicolon.web.CommentController;
import com.semicolon.web.PostController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@SpringBootApplication
public class MainApplication {
    static PostController controller;
    private static PostController postController;

    static CommentController commentController;
    private static CommentController commentController1;
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        SpringApplication.run(MainApplication.class, args);

    }

    record PostController(String createPost, Post getPost) {}


    public static void mainMenu(){
        System.out.print("""
                WELCOME TO MEN'S FASHION
                        BLOG
                1 -> create a post
                2 -> Get a post
                3 -> Exit

                """);

        char userInput = input.next().charAt(0);
        switch (userInput){
            case '1' -> createPost();
            case '2' -> getPost();
        }
    }

    public static void createPost(){
        System.out.println("1 -> Enter a Title");
        String title = input.next();


        System.out.println("1 -> Enter a Content");
        String content = input.next();


        System.out.println(controller.createPost());
        mainMenu();
    }

    public static void getPost(){
        System.out.println("""
                1- > Enter Id
                """);
        int id = input.nextInt();


       System.out.println(
               controller.getPost().toString()
       );
        mainMenu();

    }


}
