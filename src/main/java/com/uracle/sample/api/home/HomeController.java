package com.uracle.sample.api.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Hello World";
    }

    @PostMapping("/")
    public String homePost() {
        return "Hello Post World";
    }
}
