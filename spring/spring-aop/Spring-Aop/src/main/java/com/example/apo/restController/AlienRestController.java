package com.example.apo.restController;

import com.example.apo.model.Alien;
import com.example.apo.service.AlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/alien")
public class AlienRestController {
    @Autowired
    private AlineService alineService;

    @PostMapping("/register")
    public ResponseEntity<Alien> registerAlien(@RequestBody Alien alien) throws Exception {
        return new ResponseEntity<>(alineService.registerAlienInfo(alien), HttpStatus.CREATED);
    }

    @GetMapping("/alien-info")
    public ResponseEntity<List<Alien>> getAlienInfo(){
        return new ResponseEntity<>(alineService.getAllAlienInfo(),HttpStatus.OK);
    }

}
