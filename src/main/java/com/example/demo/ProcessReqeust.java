package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.*;

@Controller("/login")
public class ProcessReqeust {

    @GetMapping("/login")
    public String processLoginViewRequest() {
        return "loginView";
    }

    @PostMapping("/login")
    public String processLoginRequest(@RequestParam("username") String username, @RequestParam("password") String password) throws SQLException {
        System.out.println("Processing login request for user " + username);
        return "loginView";
    }
}
