package com.example.live.jpa;

import com.example.live.jpa.service.VaccineServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Project03Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Project03Application.class, args);

		VaccineServiceImpl vaccineService = context.getBean(VaccineServiceImpl.class);

		vaccineService.getVaccinePriceLessThan(2000).
				forEach(resultView -> System.out.println(resultView.getVaccineName() + ":" +resultView.getVaccineManufactureBy()));
	}

}
