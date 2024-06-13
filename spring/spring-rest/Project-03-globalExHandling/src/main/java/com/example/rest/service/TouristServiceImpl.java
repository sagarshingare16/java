package com.example.rest.service;

import com.example.rest.Exception.TouristNotFoundException;
import com.example.rest.model.Tourist;
import com.example.rest.reppository.TouristRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TouristServiceImpl implements TouristService{

    @Autowired
    TouristRepository repository;

    @Override
    public String registerTourist(Tourist tourist) {
        return "Tourist registered successfully with id: "+ repository.save(tourist).getTouristId();
    }

    @Override
    public List<Tourist> getAllTourist() {
        return repository.findAll();
    }

    @Override
    public Tourist getTouristById(Integer touristId) {
        return repository.findById(touristId).
                orElseThrow(()-> new TouristNotFoundException("Tourist with give id: "+touristId+ "not found"));
    }

    @Override
    public String updateTouristInfo(Tourist tourist) {
        if(repository.findById(tourist.getTouristId()).isPresent()){
            repository.save(tourist);
            return "Tourist details saved successfully";
        }else {
            throw new TouristNotFoundException("Tourist with give id: "+tourist.getTouristId()+ "not found");
        }
    }

    @Override
    public String updateTouristInfoById(Integer touristId, double touristBudget) {
        Optional<Tourist> optional =repository.findById(touristId);
        if(optional.isPresent()){
            Tourist tourist = optional.get();
            tourist.setTouristBudget(touristBudget);
            repository.save(tourist);
            return "Tourist budget saved successfully";
        }
        else {
            throw new TouristNotFoundException("Tourist with give id: "+touristId+ "not found");
        }
    }

    @Override
    public String deleteTouristById(Integer touristId) {
        if(repository.findById(touristId).isPresent()){
            repository.deleteById(touristId);
            return "Tourist details deleted successfully";
        }else {
            throw new TouristNotFoundException("Tourist with give id: "+touristId+ "not found");
        }
    }
}
