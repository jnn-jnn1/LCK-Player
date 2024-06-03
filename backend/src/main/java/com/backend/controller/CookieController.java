package com.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CookieController {
    @GetMapping("/")
    public String getCookie() {
        System.out.println("cookie");
        return null;
    }
}
