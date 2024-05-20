package com.example.mvcpractice.controller;

import com.example.mvcpractice.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class PracticeController {

    @PostMapping("/users")
    void saveUser(@ModelAttribute User user) {

        System.out.println(user.getName());

    }

    @GetMapping("/exception")
    @ExceptionHandler(Exception.class)
    void getUser(@ModelAttribute User user) throws Exception {

        throw new Exception();

    }
}