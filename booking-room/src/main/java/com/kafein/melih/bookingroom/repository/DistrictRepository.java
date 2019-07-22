package com.kafein.melih.bookingroom.repository;

import com.kafein.melih.bookingroom.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {

    District findById(int id);
   // District findByDistrict(String dname);



}
