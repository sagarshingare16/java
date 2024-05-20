package com.example.live.jpa;

import com.example.live.jpa.service.VaccineServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Project02Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Project02Application.class, args);

		VaccineServiceImpl vaccineService = context.getBean(VaccineServiceImpl.class);

		/*vaccineService.getVaccineByPrice(1500).forEach(System.out::println);
		vaccineService.getVaccineBYManufacturer("Astrazaneka").forEach(System.out::println);*/
		vaccineService.getVaccineByNameEquals("Phiser").forEach(System.out::println);
	}

}
