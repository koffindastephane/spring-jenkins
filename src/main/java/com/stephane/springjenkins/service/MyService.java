package com.stephane.springjenkins.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MyService {

    public String greet(String greeting) {
        log.info("Executing greet service");
        return greeting;
    }

}
