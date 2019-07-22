package com.kafein.melih.bookingroom.controller;

import com.kafein.melih.bookingroom.dto.UserDTO;
import com.kafein.melih.bookingroom.model.User;
import com.kafein.melih.bookingroom.service.base.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RequestMapping("/bookingroom/users")
@RestController

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseBody

    public List<UserDTO> getAll(){

        return userService.findAll();
    }
    @PostMapping
    @ResponseBody

    public UserDTO save(@RequestBody UserDTO user){

        return userService.save(user);
    }

    @GetMapping("/by-id")
    @ResponseBody
    public UserDTO findById(@RequestParam ("id") int id){

        return userService.findById(id);
    }

    @GetMapping("/by-fname")
    @ResponseBody
    public List<UserDTO> findAllByFname(@RequestParam ("fname") String fname){

        return userService.findAllByFname(fname);
    }

    @GetMapping("/by-lname")
    @ResponseBody
    public List<UserDTO> findAllByLname(@RequestParam ("lname") String lname){

        return userService.findAllByLname(lname);
    }

    @GetMapping("/by-phoneNumber")
    @ResponseBody
    public List<UserDTO> findAllByphoneNumber(@RequestParam ("phoneNumber") String phoneNumber){

        return userService.findAllByphoneNumber(phoneNumber);
    }

    @GetMapping("/by-email")
    @ResponseBody
    public UserDTO findByEmail(@RequestParam ("email") String email){

        return userService.findByEmail(email);
    }



    @GetMapping("/by-birthDate")
    @ResponseBody
    public List<UserDTO> findAllBybirthDate(@RequestParam ("birthDate") Date birthDate){

        return userService.findAllBybirthDate(birthDate);
    }

}
