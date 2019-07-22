package com.kafein.melih.bookingroom.controller;

import com.kafein.melih.bookingroom.dto.DistrictDTO;
import com.kafein.melih.bookingroom.service.base.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/bookingroom/districts")
@RestController
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @GetMapping
    @ResponseBody

    public List<DistrictDTO> getAll(){

        return districtService.findAll();
    }
    @PostMapping
    @ResponseBody

    public DistrictDTO save(@RequestBody DistrictDTO district){

        return districtService.save(district);
    }

    @GetMapping("/by-id")
    @ResponseBody
    public DistrictDTO findById(@RequestParam ("id") int id){

        return districtService.findById(id);
    }


}
