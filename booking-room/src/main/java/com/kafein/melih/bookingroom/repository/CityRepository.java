package com.kafein.melih.bookingroom.repository;

import com.kafein.melih.bookingroom.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

    City findById(int id);
    List<City> findAllByCname(String cname);


}
