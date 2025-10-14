package com.klef.prac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsspringbootApplication extends SpringBootServletInitializer {

    // Required for WAR deployment
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JenkinsspringbootApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsspringbootApplication.class, args);
        System.out.println("My Project is working");
    }
}
