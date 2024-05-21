package com.example.live.jpa;

import com.example.live.jpa.service.VaccineServiceImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class Project05Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Project05Application.class, args);

		VaccineServiceImpl vaccineService = context.getBean(VaccineServiceImpl.class);

		vaccineService.fetchByVaccineManufacturer("Astrazaneka").
				forEach(System.out::println);


		vaccineService.fetchByVaccinePriceRange(1000,1500).forEach(System.out::println);

		List<Object[]> vaccineInfo = vaccineService.fetchVaccineInfoByVaccineName("Covishield","Phiser");
		for (Object[] vaccines : vaccineInfo){
			for(Object vaccine :vaccines){
				System.out.println(vaccine + " ");
			}
			System.out.println();
		}

	}

}
