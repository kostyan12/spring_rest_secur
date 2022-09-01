package com.example.spring_rest_secur.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class BasicController {
    @GetMapping ("/public")
    public String publicRes(){
        return "public";
    }

    @GetMapping ("/authenticated")
    public String authRes(){
        String username = ((Principal)SecurityContextHolder.getContext().getAuthentication()).getName();
        return username;
        //return "authenticated" + principal.getName();
    }

}
