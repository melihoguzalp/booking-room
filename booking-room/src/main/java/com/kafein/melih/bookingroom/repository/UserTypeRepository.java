package com.kafein.melih.bookingroom.repository;

import com.kafein.melih.bookingroom.model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType,Integer> {

    UserType findById(int id);
    List<UserType> findAllByTname(String tname);


}
