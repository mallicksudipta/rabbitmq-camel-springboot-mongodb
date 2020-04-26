package com.example.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is employee-service microservice. It is responsible for CRUD operation on the Employee object stored in MongoDB
 * 
 * @author Sudipta Mallick
 *
 */
@SpringBootApplication
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
