package com.example.apo.service;

import com.example.apo.model.Alien;
import com.example.apo.repository.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlienServiceImpl implements AlineService{
    @Autowired
    private AlienRepository alienRepository;

    @Override
    public Alien registerAlienInfo(Alien alien) throws Exception {
        String name=alien.getName();
        if(name.length()!=5)
            throw new Exception("Invalid name length exception");
        else
            return alienRepository.save(alien);
    }

    @Override
    public List<Alien> getAllAlienInfo() {
        return alienRepository.findAll();
    }
}
