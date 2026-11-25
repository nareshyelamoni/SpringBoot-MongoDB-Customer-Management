package com.naresh.SpringMongoDB.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.naresh.SpringMongoDB.model.Customer;

public interface ICustomerRepo extends MongoRepository<Customer, String> {

}
