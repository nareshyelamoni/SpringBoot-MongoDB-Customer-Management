package com.naresh.SpringMongoDB.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
	@Id
	private String id;
	
	private Integer custoNo;
	
	private String name;
	
	private String city;

	public String getId() {
		return id;
	}

	public Integer getCustoNo() {
		return custoNo;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setCustoNo(Integer custoNo) {
		this.custoNo = custoNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Customer(Integer custoNo, String name, String city) {
		super();
		this.custoNo = custoNo;
		this.name = name;
		this.city = city;
	}

	public Customer() {
		super();
		System.out.println("customer bean created");
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", custoNo=" + custoNo + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	

}
