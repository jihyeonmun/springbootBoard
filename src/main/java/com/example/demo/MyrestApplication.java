package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyrestApplication {
    public static void main(String[] args){
        System.out.println(SpringApplication.run(MyrestApplication.class, args));
    }
}
