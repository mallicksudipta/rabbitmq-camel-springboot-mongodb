package com.example.integration.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.web.client.RestTemplate;

import com.example.integration.model.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * This Camel processor class is responsible for converting the XML request coming from RabbitMQ to Object and then POST the object to employee-service to save the record in MongoDB
 * 
 * @author Sudipta Mallick
 *
 */
public class IntegrationProcessor implements Processor {
	
	@Override
    public void process(Exchange exchange) throws Exception {
		System.out.println("Start of process(Exchange exchange)");
    	System.out.println("exchange.getIn().getBody(String.class): " + exchange.getIn().getBody(String.class));
    	//ObjectMapper objectMapper = new ObjectMapper();
    	XmlMapper xmlMapper = new XmlMapper();
		//Employee employee = objectMapper.readValue(exchange.getIn().getBody(String.class),Employee.class);
    	Employee employee = xmlMapper.readValue(exchange.getIn().getBody(String.class),Employee.class);
        System.out.println("Marshalled Employee Object: "+employee.toString());
        RestTemplate restTemplate = new RestTemplate();
        Employee postedEmp = restTemplate.postForObject("http://localhost:8081/employee-service/employees", employee, Employee.class);
        System.out.println("Posted Employee Object: "+postedEmp.toString());
        System.out.println("End of process(Exchange exchange)");
    }
}
