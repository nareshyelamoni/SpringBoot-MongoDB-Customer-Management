package com.naresh.SpringMongoDB.dto;

public class CustomerDTO {

	private Integer custoNo;
	
	private String name;
	
	private String city;

	
	public Integer getCustoNo() {
		return custoNo;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
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

	public CustomerDTO(Integer custoNo, String name, String city) {
		super();
		this.custoNo = custoNo;
		this.name = name;
		this.city = city;
	}

	public CustomerDTO() {
		super();
		System.out.println("customer bean created");
	}

	@Override
	public String toString() {
		return "Customer [custoNo=" + custoNo + ", name=" + name + ", city=" + city + "]";
	}
	
}
