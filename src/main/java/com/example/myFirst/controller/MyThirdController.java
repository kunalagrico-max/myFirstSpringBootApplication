package com.example.myFirst.controller;

import com.example.myFirst.service.MyThirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MyThirdController {
    private MyThirdService myThirdService;

    MyThirdController(MyThirdService myThirdService)
    {
        this.myThirdService=myThirdService;
    }

    @GetMapping("/math/add/{number1},{number2}")
    public String addition(@PathVariable("number1") int num1,@PathVariable("number2")int num2)
    {
        return myThirdService.addition(num1,num2);
    }

}
