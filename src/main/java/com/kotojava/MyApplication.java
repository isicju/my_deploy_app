package com.kotojava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;

@ConfigurationPropertiesScan
@SpringBootApplication
public class MyApplication {


    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyApplication.class, args);
    }


}
