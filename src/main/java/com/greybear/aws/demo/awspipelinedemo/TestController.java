package com.greybear.aws.demo.awspipelinedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String welcomeMessage() {
        return "Hello there! It works :D";
    }
}
