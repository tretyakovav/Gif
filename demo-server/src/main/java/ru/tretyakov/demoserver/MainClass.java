package ru.tretyakov.demoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class MainClass {
    public static void main(String[] args) {
        SpringApplication.run(MainClass.class, args);
    }
}
