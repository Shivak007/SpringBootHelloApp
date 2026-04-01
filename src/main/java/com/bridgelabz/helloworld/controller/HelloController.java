package com.bridgelabz.helloworld.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("")
    public String hello() {
        return "Hello from BridgeLabz";
    }

    @GetMapping("/query")
    public String helloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}