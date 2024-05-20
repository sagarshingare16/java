package com.example.live.jpa.springdatajpa.service;

import com.example.live.jpa.springdatajpa.model.Vaccine;
import com.example.live.jpa.springdatajpa.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VaccineServiceImpl implements VaccineService{
    @Autowired
    VaccineRepository vaccineRepository;


    /*@Override
    public String registerVaccineInfo(Vaccine vaccine) {
        Vaccine vaccine1 = vaccineRepository.save(vaccine);
        return "Vaccine with id "+vaccine1.getVaccineId()+" saved successfully";
    }

    @Override
    public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines) {
        return vaccineRepository.saveAll(vaccines);

    }

    @Override
    public Long getVaccinesCount() {
        return vaccineRepository.count();
    }

    @Override
    public Boolean checkAvailability(Integer vaccineId) {
        return vaccineRepository.existsById(vaccineId);
    }

    @Override
    public Iterable<Vaccine> getAllVaccinesInfo() {
        return vaccineRepository.findAll();
    }

    @Override
    public Iterable<Vaccine> getAllVaccinesInfoSpecific(Iterable<Integer> vaccineIds) {
        return vaccineRepository.findAllById(vaccineIds);
    }

    @Override
    public Optional<Vaccine> getVaccineById(Integer vaccineId) {
        return vaccineRepository.findById(vaccineId);

    }

    @Override
    public String removeVaccineById(Integer vaccineId) {
        boolean status = vaccineRepository.findById(vaccineId).isPresent();
        if(status){
            vaccineRepository.deleteById(vaccineId);
            return "Vaccine with id "+vaccineId+" deleted successfully";
        }else {
            return "Vaccine details with given id not found";
        }

    }

    @Override
    public String deleteVaccinesById(List<Integer> vaccineIds) {
        List<Vaccine> vaccineList = (List<Vaccine>) vaccineRepository.findAllById(vaccineIds);
        int count1=vaccineIds.size();
        int count2=vaccineList.size();
        if(count1==count2){
            vaccineRepository.deleteAllById(vaccineIds);
            return "Vaccine with specify id's deleted successfully";
        }else {
            return "Failed to delete.";
        }
    }

    @Override
    public String deleteVaccineByVaccineObj(Vaccine vaccine) {
        Integer vaccineId = vaccine.getVaccineId();
        boolean status = vaccineRepository.existsById(vaccineId);
        if(status){
            vaccineRepository.delete(vaccine);
            return "Vaccine deleted successfully..";
        }else {
            return "Failed to delete..";
        }
    }*/

    /*@Override
    public Iterable<Vaccine> fetchDetails(boolean status, String... properties) {
        Sort sort = Sort.by(status? Sort.Direction.ASC: Sort.Direction.DESC,properties);
        return vaccineRepository.findAll(sort);
    }

    @Override
    public List<Vaccine> fetchDetails(int pgNo, int PgSize, boolean status, String... properties) {
        *//*Sort sort = Sort.by(status? Sort.Direction.ASC: Sort.Direction.DESC);
        PageRequest.of(pgNo,pgSize,sort);*//*

        PageRequest pageable = PageRequest.of(pgNo, PgSize,status? Sort.Direction.ASC : Sort.Direction.DESC, properties);
        Page<Vaccine> page = vaccineRepository.findAll(pageable);
        return page.getContent();
    }

    @Override
    public void fetchDetailsPagination(int pageSize) {
        long count=2L;

        long pagesCount=count/pageSize;
        pagesCount = ((count % pageSize) == 0) ? pagesCount : ++pagesCount;
        for(int i=0; i<pagesCount; i++) {
            PageRequest pageable = PageRequest.of(i, pageSize);
            Page<Vaccine> page = vaccineRepository.findAll(pageable);
            System.out.println("Page Number : "+ i);
            page.getContent().forEach(vaccine->System.out.println(vaccine.getVaccineName()+ " : "+vaccine.getVaccineManufactureBy()));
            System.out.println("---------------------------------------------");
        }

    }*/

    @Override
    public List<Vaccine> searchByGivenVaccineInfo(Vaccine vaccine, boolean status, String... properties) {
        Example<Vaccine> example = Example.of(vaccine);
        Sort sort = Sort.by(status? Sort.Direction.ASC: Sort.Direction.DESC, properties);
        return vaccineRepository.findAll(example,sort);
    }



}
