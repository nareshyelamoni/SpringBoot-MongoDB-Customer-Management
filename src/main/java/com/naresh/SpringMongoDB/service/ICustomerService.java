package com.naresh.SpringMongoDB.service;

import java.util.List;

import com.naresh.SpringMongoDB.dto.CustomerDTO;
import com.naresh.SpringMongoDB.model.Customer;

public interface ICustomerService {
	public String registerCustomer(CustomerDTO dto);
	public List<Customer> findAllCustomer();
}
