package com.example.springMongodb;

import com.example.springMongodb.dto.CustomerInfoDto;
import com.example.springMongodb.model.CustomerInfo;
import com.example.springMongodb.service.CustomerInfoServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMongodbApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringMongodbApplication.class, args);
		CustomerInfoServiceImpl service = context.getBean(CustomerInfoServiceImpl.class);

		/*CustomerInfo customerInfo = new CustomerInfo();
		customerInfo.setCustomerName("Navin");
		customerInfo.setCustomerAddress("Pune");

		String status = service.registerCustomerDetails(customerInfo);
		System.out.println(status);*/


		CustomerInfo customerInfo1 = service.findCustomerDetailsById("664f893988f3c77bdd1136a2");
		System.out.println(customerInfo1);
	}

}
