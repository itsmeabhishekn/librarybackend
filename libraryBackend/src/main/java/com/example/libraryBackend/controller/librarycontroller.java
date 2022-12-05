package com.example.libraryBackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class librarycontroller {

    @PostMapping("/login")
    public String login()
    {
        return "this is the login page";
    }

    @GetMapping("/")
    public String home()
    {
        return "this is the home page";
    }

    @PostMapping("/add")
    public String add()
    {
        return "this is the book adding page";
    }

    @PostMapping("/delete")
    public String delete()
    {
        return "this is the delete page";
    }

    @PostMapping("/edit")
    public String edit()
    {
        return "this is the edit page";
    }

    @PostMapping("/issue")
    public String issue()
    {
        return  "this is the book issue page";
    }

    @PostMapping("/search")
    public String search()
    {
        return "this is the search book page";
    }

    @PostMapping("/signin")
    public String signin()
    {
        return "this is the signin page";
    }

    @PostMapping("/userreg")
    public String userreg()
    {
        return "this is the user registration page";
    }

    @GetMapping("/view")
    public String view()
    {
        return "this is the viewall page"
    }






}
