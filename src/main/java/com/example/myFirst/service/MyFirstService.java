package com.example.myFirst.service;

import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    public String sayHelloTo(String name) {
        return "Hello " + name;
    }

    public String goodBye(String name) {
        return "good bye " + name;
    }
}
