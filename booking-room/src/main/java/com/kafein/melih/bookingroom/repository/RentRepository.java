package com.kafein.melih.bookingroom.repository;

import com.kafein.melih.bookingroom.model.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentRepository extends JpaRepository<Rent,Integer> {

    Rent findById(int id);
    //Rent findByUser_Email(String email);

}
