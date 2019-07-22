package com.kafein.melih.bookingroom.controller;

import com.kafein.melih.bookingroom.dto.RentDTO;
import com.kafein.melih.bookingroom.service.base.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/bookingroom/rents")
@RestController
public class RentController {


    @Autowired
    private RentService rentService;

    @GetMapping
    @ResponseBody

    public List<RentDTO> getAll(){

        return rentService.findAll();
    }
    @PostMapping
    @ResponseBody

    public RentDTO save(@RequestBody RentDTO rent){

        return rentService.save(rent);
    }

    @GetMapping("/by-id")
    @ResponseBody
    public RentDTO findById(@RequestParam ("id") int id){

        return rentService.findById(id);
    }

    //@GetMapping("/by-email")
    //@ResponseBody
   // public RentDTO findByUser_Email(@RequestParam ("email") String email){

   //     return rentService.findByUser_Email(email);
    //}


}
