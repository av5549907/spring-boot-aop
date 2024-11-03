package com.spring.boot.aop.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Employee implements InitializingBean , DisposableBean {
    public Employee() {
        System.out.println("Employee Created");
    }

    public void work(){
        System.out.println("Employee is working.");
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("cleaning up Employee");
        System.out.println("closing DB connection");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
       System.out.println("Initialize employee");
       System.out.println("open DB connections");
    }
}
