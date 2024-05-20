package com.example.live.jpa.springdatajpa;

import com.example.live.jpa.springdatajpa.model.Vaccine;
import com.example.live.jpa.springdatajpa.service.VaccineServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		VaccineServiceImpl vaccineService = context.getBean(VaccineServiceImpl.class);

		/*Vaccine vaccine = new Vaccine();
		vaccine.setVaccineName("Sputnik");
		vaccine.setVaccineManufactureBy("Russian");
		vaccine.setVaccinePrice(800);

		String vaccineInfo = vaccineService.registerVaccineInfo(vaccine);
		System.out.println(vaccineInfo);*/

		/*Vaccine vaccine1 = new Vaccine();
		vaccine1.setVaccineName("Sputnik");
		vaccine1.setVaccineManufactureBy("Russian");
		vaccine1.setVaccinePrice(800);

		Vaccine vaccine2 = new Vaccine();
		vaccine2.setVaccineName("Covaxin");
		vaccine2.setVaccineManufactureBy("BharatBiotech");
		vaccine2.setVaccinePrice(500);

		Vaccine vaccine3 = new Vaccine();
		vaccine3.setVaccineName("Covishield");
		vaccine3.setVaccineManufactureBy("Astrazaneka");
		vaccine3.setVaccinePrice(1000);

		Vaccine vaccine4 = new Vaccine();
		vaccine4.setVaccineName("Phiser");
		vaccine4.setVaccineManufactureBy("USA-BIOTECH");
		vaccine4.setVaccinePrice(1500);

		List<Vaccine> vaccineList = new ArrayList<>();
		vaccineList.add(vaccine1);
		vaccineList.add(vaccine2);
		vaccineList.add(vaccine3);
		vaccineList.add(vaccine4);

		vaccineService.registerMultipleVaccines(vaccineList).forEach(vaccine -> System.out.println(vaccine));*/

		/*Long vaccinesCount = vaccineService.getVaccinesCount();
		System.out.println("Total vaccines available: "+vaccinesCount);*/

		/*Boolean isPresent = vaccineService.checkAvailability(152);
		if(isPresent){
			System.out.println("Vaccine is available..");
		}else {
			System.out.println("Vaccine is not available..");
		}*/

		/*List<Vaccine> vaccineList= (List<Vaccine>) vaccineService.getAllVaccinesInfo();
		vaccineList.forEach(System.out::println);*/

		/*List<Integer> vaccineIds = new ArrayList<>();
		vaccineIds.add(153);
		vaccineIds.add(154);
 		vaccineService.getAllVaccinesInfoSpecific(vaccineIds).forEach(System.out::println);*/

		/*Optional<Vaccine> vaccine = vaccineService.getVaccineById(200);
		if(vaccine.isPresent()) {
			System.out.println(vaccine.get());
		}
		else {
		//	optional.orElseThrow(()-> new IllegalArgumentException("Record not found"));
			System.out.println(vaccine.orElse(new Vaccine()));
		}*/

		/*System.out.println(vaccineService.removeVaccineById(152));*/

		/*List<Integer> vaccineIds=new ArrayList<>();
		vaccineIds.add(1);
		vaccineIds.add(2);
		vaccineIds.add(5);
		System.out.println(vaccineService.deleteVaccinesById(vaccineIds));*/

		/*Vaccine vaccine = new Vaccine(153,"Covaxin","BharatBiotech",500);
		System.out.println(vaccineService.deleteVaccineByVaccineObj(vaccine));*/

		/*vaccineService.fetchDetails(true,"vaccineId","vaccineName")
				.forEach(vaccine -> System.out.println(vaccine.getVaccineId()+"->"+vaccine.getVaccineName()));

		vaccineService.fetchDetails(0,2,true,"vaccineId","vaccineName")
				.forEach(vaccine -> System.out.println(vaccine.getVaccineId()+"->"+vaccine.getVaccineName()));*/

		/*vaccineService.fetchDetailsPagination(2);*/

		Vaccine vaccine = new Vaccine(154,"Covishield","Astrazaneka",1000);
		vaccineService.searchByGivenVaccineInfo(vaccine, true, "vaccineName")
				.forEach(v->System.out.println(v.getVaccineName()+ " : "+v.getVaccineManufactureBy()));
	}

}
