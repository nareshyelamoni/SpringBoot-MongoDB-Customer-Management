package com.naresh.SpringMongoDB.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naresh.SpringMongoDB.dto.CustomerDTO;
import com.naresh.SpringMongoDB.model.Customer;
import com.naresh.SpringMongoDB.repo.ICustomerRepo;
@Service
public class CustomerService implements ICustomerService {
	
	private ICustomerRepo repo;

	@Autowired
	public void setRepo(ICustomerRepo repo) {
		this.repo = repo;
	}

	@Override
	public String registerCustomer(CustomerDTO dto) {
		Customer cx=new Customer();
		BeanUtils.copyProperties(dto, cx);
		Customer cxDoc = repo.save(cx);
		return "CUstomer info stored with id "+cxDoc.getId();
	}

	@Override
	public List<Customer> findAllCustomer() {
		return repo.findAll();
	}
	
	

}
