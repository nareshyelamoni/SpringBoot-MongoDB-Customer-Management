package com.naresh.SpringMongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.naresh.SpringMongoDB.dto.CustomerDTO;
import com.naresh.SpringMongoDB.service.CustomerService;

@SpringBootApplication
public class SpringMongoDbApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringMongoDbApplication.class, args);
		CustomerService service = container.getBean(CustomerService.class);
		CustomerDTO dto=new CustomerDTO(2, "Prasad", "Hyderabad");
		String status = service.registerCustomer(dto);
		System.out.println(status);
		service.findAllCustomer().forEach(c->System.out.println(c));
	}

}
