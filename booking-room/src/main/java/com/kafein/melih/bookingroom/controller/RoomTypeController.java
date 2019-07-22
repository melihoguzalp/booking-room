package com.kafein.melih.bookingroom.controller;
import com.kafein.melih.bookingroom.dto.RoomTypeDTO;
import com.kafein.melih.bookingroom.service.base.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/bookingroom/roomTypes")
@RestController
public class RoomTypeController {


    @Autowired
    private RoomTypeService roomTypeService;

    @GetMapping
    @ResponseBody

    public List<RoomTypeDTO> getAll(){

        return roomTypeService.findAll();
    }
    @PostMapping
    @ResponseBody

    public RoomTypeDTO save(@RequestBody RoomTypeDTO roomType){

        return roomTypeService.save(roomType);
    }

    @GetMapping("/by-id")
    @ResponseBody
    public RoomTypeDTO findById(@RequestParam ("id") int id){

        return roomTypeService.findById(id);
    }



}
