package com.example.live.jpa.repository;

import com.example.live.jpa.model.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public interface VaccineRepository extends JpaRepository<Vaccine,Integer> {

    @Query("from Vaccine where vaccineManufactureBy=:manufacturerName")
    List<Vaccine> searchByVaccineManufacturer(String manufacturerName);

    /*@Query("from Vaccine where vaccineManufactureBy=:manufacturerName")
    List<Vaccine> searchByVaccineManufacturerName(@Param("manufacturerName")String manufacturer);

    @Query("from Vaccine where vaccineManufactureBy in(:manufacturer1, :manufacturer2)")
    List<Vaccine> searchByVaccineManufacturer(String manufacturer1, String manufacturer2);

    @Query("select vaccineName,vaccineManufactureBy from Vaccine where vaccinePrice between :minPrice AND :maxP")
    List<String> searchByVaccinePriceRange(Integer minPrice, Integer maxPrice);

    @Query("select vaccineManufactureBy, vaccinePrice from Vaccine where vaccineName in(:vaccineName1, :VaccineName2)")
    List<Object[]> searchVaccineInfoByVaccineName(String vaccineName1,String VaccineName2);

    @Transactional
    @Modifying
    @Query("update Vaccine set vaccinePrice=:newPrice where vaccineName=:vaccine")
    int updatePriceByVaccineName(Integer newPrice,String vaccine);

    @Transactional
    @Modifying
    @Query("delete from Vaccine where vaccinePrice between :minVaccinePrice and :maxVaccinePrice")
    int deleteByVaccinePriceRange(Integer minVaccinePrice, Integer maxVaccinePrice);

    @Transactional
    @Modifying
    @Query(value="insert into vaccine_info(`vaccine_id`,`vaccine_name`,`vaccine_manufacture_by`,`vaccine_manufacture_by`) " +
            "Values(?,?,?,?)", nativeQuery=true)
    int insertVaccineDetails(Integer id,String name, String manufacturer, Integer price);*/


}
