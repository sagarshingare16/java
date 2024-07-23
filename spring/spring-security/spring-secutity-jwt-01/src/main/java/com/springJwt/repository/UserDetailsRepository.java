package com.springJwt.repository;

import com.springJwt.model.EntityDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<EntityDetails, Long> {
    EntityDetails findByName(String username);
}

