package com.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieApiApplication {

    private static ApplicationContext APPLICATION_CONTEXT;

    public static void main(String[] args) {
        SpringApplication.run(MovieApiApplication.class, args);
    }

    public static <T> T getBean(Class<T> type) {
        return APPLICATION_CONTEXT.getBean(type);
    }

}
