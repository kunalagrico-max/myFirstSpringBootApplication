package com.example.myFirst.service;

import org.springframework.stereotype.Service;

@Service
public class MySecondService {

    public String testGender(String gender)
    {
        if(gender.equalsIgnoreCase("Male")||gender.equalsIgnoreCase("Female"))
        {
        return "Sex is " + gender;
        }
        else
        {
            return "Please enter valid sex";
        }
    }
}
