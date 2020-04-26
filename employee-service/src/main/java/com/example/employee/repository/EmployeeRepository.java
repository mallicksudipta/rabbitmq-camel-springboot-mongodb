package com.example.employee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.model.Employee;

/**
 * This is Employee repository class with Spring Data Mongo
 * 
 * @author Sudipta Mallick
 *
 */
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{

}
