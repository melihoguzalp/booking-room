package com.kafein.melih.bookingroom.controller;

import com.kafein.melih.bookingroom.dto.CityDTO;
import com.kafein.melih.bookingroom.service.base.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/bookingroom/cities")
@RestController
public class CityController {


    @Autowired
    private CityService cityService;

    @GetMapping
    @ResponseBody

    public List<CityDTO> getAll(){

        return cityService.findAll();
    }
    @PostMapping
    @ResponseBody

    public CityDTO save(@RequestBody CityDTO city){
        return cityService.save(city);
    }

    @GetMapping("/by-id")
    @ResponseBody
    public CityDTO findById(@RequestParam ("id") int id){

        return cityService.findById(id);
    }

    @GetMapping("/by-cname")
    @ResponseBody
    public List<CityDTO> findAllByCname(@RequestParam ("cname") String cname){

        return cityService.findAllByCname(cname);
    }


}
