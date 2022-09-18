package com.dayo.security_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String home(){
        return "Hello, World!";
    }


    //authenticated by  user role endpoint
    @GetMapping("/users")
    public String user(){
       return  "Hello, Users!";
    }

    //Authenticated by admin role endpoint
    @GetMapping("/admin")
    public String admin(){
        return "Hello, Admin!";
    }


}
