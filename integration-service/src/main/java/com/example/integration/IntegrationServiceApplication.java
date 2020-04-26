package com.example.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is integration-service microservice. It is responsible for reading XML data (Employee) 
 * from RabbitMQ and then unmarshalling it to Employee object 
 * and call the employee-service microservice to save that object in MongoDB
 * 
 * @author Sudipta Mallick
 *
 */
@SpringBootApplication
public class IntegrationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationServiceApplication.class, args);
	}

}
