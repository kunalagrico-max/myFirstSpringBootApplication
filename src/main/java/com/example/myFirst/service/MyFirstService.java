package com.example.myFirst.service;

import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    public String sayHelloTo(String name) {
        return "Hello " + name;
    }

//
}
