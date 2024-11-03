package com.spring.boot.aop;

import com.spring.boot.aop.beans.Employee;
import com.spring.boot.aop.beans.Students;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAopApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context= SpringApplication.run(SpringBootAopApplication.class, args);
//		Employee employee= context.getBean(Employee.class);
//		employee.work();
        System.out.println(".......................................");
		Students students=context.getBean(Students.class);
		students.work();
	}

}
