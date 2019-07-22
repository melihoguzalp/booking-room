package com.kafein.melih.bookingroom.repository;

import com.kafein.melih.bookingroom.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findAllByFname(String fname);
    List<User> findAllByLname(String lname);
    List<User> findAllByphoneNumber(String phoneNumber);
    User findByEmail(String email);
    List<User> findAllBybirthDate(Date birthDate);
    User findById(int id);


}
