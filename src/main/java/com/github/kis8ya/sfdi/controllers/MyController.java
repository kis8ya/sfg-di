package com.github.kis8ya.sfdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Meow...");
        return "Not bad ;)";
    }

}
