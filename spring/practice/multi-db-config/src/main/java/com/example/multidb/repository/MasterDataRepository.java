package com.example.multidb.repository;

import com.example.multidb.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterDataRepository extends JpaRepository<UserInfo,Integer> {

}
