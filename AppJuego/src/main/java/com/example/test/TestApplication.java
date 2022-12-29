package com.example.test;

import com.example.test.models.ui.UIMain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        new UIMain();
        SpringApplication.run(TestApplication.class, args);
    }

}
