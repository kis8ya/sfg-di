package com.github.kis8ya.sfdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "meow... mini CONSTRUCTOR";
    }
}
