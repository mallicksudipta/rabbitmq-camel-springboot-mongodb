# rabbitmq-camel-springboot-mongodb
There are two microservices, integration-service and employee-service. The integration-service microservice is reading XML data (Employee) from RabbitMQ and then unmarshalling it to Employee object and call the employee-service microservice to save that object in MongoDB.

Pre-requisites:
1) RabbitMQ should be installed in Local
2) Exchange name test-exchange to be created in RabbitMQ
3) Queue name test-queue to be created in RabbitMQ and bind it with the test-exchange
4) MongoDB should be installed in Local
5) test_db needs to be created in MongoDB

Once both the microservices are running, XML representation of Employee needs to be posted in the test-exchange exchange (via Publish Message) of RabbitMQ. Here is the sample XML to be posted:
    
    <item>
        <empId>111</empId>
        <name>John</name>
        <age>25</age>
        <salary>8500.0</salary>
    </item>
    
After both the services completes their respective processings, the expected outcome is to persist the incoming XML data from the RabbitMQ to NoSQL MongoDB as an Employee object.
