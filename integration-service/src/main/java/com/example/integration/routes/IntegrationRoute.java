package com.example.integration.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.example.integration.processor.IntegrationProcessor;


/**
 * This class is responsible for reading a message from the RabbitMQ and process the message using camel route
 * 
 * @author Sudipta Mallick
 *
 */
@Component
public class IntegrationRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("rabbitmq://localhost:5672/test-exchange?queue=test-queue&autoDelete=false")
				.log("From RabbitMQ: \n${body}").process(new IntegrationProcessor())
				.errorHandler(defaultErrorHandler().redeliveryDelay(1000).maximumRedeliveries(10).backOffMultiplier(2));

	}

}
