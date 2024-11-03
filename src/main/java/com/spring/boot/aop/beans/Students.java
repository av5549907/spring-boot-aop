package com.spring.boot.aop.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Students {
    public Students() {
        System.out.println("Students Created");
    }

    public void work(){
        System.out.println("Students is working.");
    }

    @PreDestroy
    public void destroy() throws Exception {

        System.out.println("cleaning up Students");
        System.out.println("closing DB connection");
    }

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialize Students");
        System.out.println("open DB connections");
    }
}
