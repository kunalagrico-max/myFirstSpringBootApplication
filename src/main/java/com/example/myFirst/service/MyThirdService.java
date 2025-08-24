package com.example.myFirst.service;

import org.springframework.stereotype.Service;

@Service
public class MyThirdService {

    public String addition(int num1,int num2)
    {
        int num=num1>num2?num1:num2;
        return "Larger number is "+num;
       // System.out.println("Factorial will be printed");
//        for(int i=1;i<=num1;i++)
//        {
//           f=f*i;
//        }


    }

}
