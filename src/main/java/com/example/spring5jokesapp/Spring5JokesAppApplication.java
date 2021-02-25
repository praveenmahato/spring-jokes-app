package com.example.spring5jokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:chuck-config.xml")
@SpringBootApplication
public class Spring5JokesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring5JokesAppApplication.class, args);
    }

}
