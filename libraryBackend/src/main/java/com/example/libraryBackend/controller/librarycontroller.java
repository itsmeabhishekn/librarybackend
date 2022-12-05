package com.example.libraryBackend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class librarycontroller {

    @PostMapping("/login")
    public String login()
    {
        return "this is the login page";
    }
}
