package com.example.myFirst.controller;

import com.example.myFirst.service.MyFirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MyFirstController {

    private MyFirstService myFirstService;

    @Autowired
    public MyFirstController(MyFirstService myFirstService) {
        this.myFirstService = myFirstService;
    }

    @GetMapping("/hello/{name}")
   public String printHelloWorld(@PathVariable("name") String name) {
    {
     return myFirstService.sayHelloTo(name);
    }


}}
