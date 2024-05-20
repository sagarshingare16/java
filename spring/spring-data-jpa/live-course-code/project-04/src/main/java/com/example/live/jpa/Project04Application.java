package com.example.live.jpa;

import com.example.live.jpa.service.VaccineServiceImpl;
import com.example.live.jpa.view.ResultViewNameManufacturer;
import com.example.live.jpa.view.ResultViewNamePrice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Project04Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Project04Application.class, args);

		VaccineServiceImpl vaccineService = context.getBean(VaccineServiceImpl.class);

		vaccineService.getByVaccinePrice(1500, ResultViewNameManufacturer.class)
				.forEach(resultViewNameManufacturer -> System.out.println(resultViewNameManufacturer.getVaccineName()
				+ ":" + resultViewNameManufacturer.getVaccineManufactureBy()));
	}

}
