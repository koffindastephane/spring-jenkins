package com.stephane.springjenkins.controller;

import com.stephane.springjenkins.service.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MyController {


    private MyService myService = new MyService();

    @GetMapping("/hello")
    public String hello() {
        log.info("Executing hello api!");
        return "Hello World";
    }

    @GetMapping ("/greet/{greeting}")
    public String greet(@PathVariable("greeting") String greeting) {
        log.info("Executing greet api!");
        return myService.greet(greeting);
    }
}
