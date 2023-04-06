package com.adihou.tobi;

import com.adihou.tobi.config.ApplicationProperties;

import org.springframework.stereotype.Service;

@Service

public class HelloWorldService {
    public HelloWorldService (ApplicationProperties applicationProperties) {
        System.out.println(applicationProperties.getHello());
    }
}
