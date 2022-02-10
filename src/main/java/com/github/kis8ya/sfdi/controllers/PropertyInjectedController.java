package com.github.kis8ya.sfdi.controllers;

import com.github.kis8ya.sfdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
