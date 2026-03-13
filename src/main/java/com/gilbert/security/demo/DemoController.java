package com.gilbert.security.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    @GetMapping("/api/v1/demo")
    public String sayHello() {
        return "Hello from secured endpoint!";
    }
}