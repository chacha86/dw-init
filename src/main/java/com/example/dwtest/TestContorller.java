package com.example.dwtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestContorller {
    @GetMapping("/test")
    public String test() {
        return "main";
    }
}
