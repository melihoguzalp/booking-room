package com.kafein.melih.bookingroom.controller;

import com.kafein.melih.bookingroom.dto.UserTypeDTO;
import com.kafein.melih.bookingroom.service.base.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/bookingroom/userTypes")
@RestController

public class UserTypeController {


    @Autowired
    private UserTypeService userTypeService;

    @GetMapping
    @ResponseBody

    public List<UserTypeDTO> getAll() {

        return userTypeService.findAll();
    }

    @PostMapping
    @ResponseBody

    public UserTypeDTO save(@RequestBody UserTypeDTO userType) {

        return userTypeService.save(userType);
    }

    @GetMapping("/by-id")
    @ResponseBody
    public UserTypeDTO findById(@RequestParam("id") int id) {

        return userTypeService.findById(id);
    }

}