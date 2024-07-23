package com.springJwt.restController;

import com.springJwt.model.EntityDetails;
import com.springJwt.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class EntityController {

    @Autowired
    EntityService entityService;

    @PostMapping("/register")
    public ResponseEntity<EntityDetails> registerEntity(@RequestBody EntityDetails entityDetails) {
        return ResponseEntity.ok(entityService.registerEntity(entityDetails));
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody EntityDetails entityDetails) {
        return ResponseEntity.ok(entityService.login(entityDetails));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EntityDetails> getEntity(@PathVariable("id") Long id) {
        return ResponseEntity.ok(entityService.getEntityDetails(id));
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<EntityDetails> updateEntity(@RequestBody EntityDetails entityDetails,
                                                      @PathVariable("id") Long id) {
        return ResponseEntity.ok(entityService.updateEntity(entityDetails));
    }
}
