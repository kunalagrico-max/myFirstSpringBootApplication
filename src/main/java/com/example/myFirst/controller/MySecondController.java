package com.example.myFirst.controller;

import com.example.myFirst.service.MyFirstService;
import com.example.myFirst.service.MySecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class MySecondController {
    private MySecondService mySecondService;

    @Autowired
    MySecondController(MySecondService mySecondService)
    {
        this.mySecondService=mySecondService;
    }


    @GetMapping("/person/{gender}")
    public String decideGender(@PathVariable("gender") String sex)
    {
        return mySecondService.testGender(sex);
    }
}
