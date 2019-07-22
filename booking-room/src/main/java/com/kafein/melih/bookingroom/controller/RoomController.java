package com.kafein.melih.bookingroom.controller;

import com.kafein.melih.bookingroom.dto.RoomDTO;
import com.kafein.melih.bookingroom.service.base.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/bookingroom/rooms")
@RestController
public class RoomController {


    @Autowired
    private RoomService roomService;

    @GetMapping
    @ResponseBody

    public List<RoomDTO> getAll(){

        return roomService.findAll();
    }
    @PostMapping
    @ResponseBody

    public RoomDTO save(@RequestBody RoomDTO room){

        return roomService.save(room);
    }

    @GetMapping("/by-id")
    @ResponseBody
    public RoomDTO findById(@RequestParam ("id") int id){

        return roomService.findById(id);
    }

    @GetMapping("/empty-rooms")
    @ResponseBody
    public List<RoomDTO> findRoomsByRoomTypeAndDistrict(@RequestParam("roomTypeId") int roomTypeId,
                                                        @RequestParam("districtId") int districtId){
        return roomService.findRoomsByRoomTypeAndDistrict(roomTypeId, districtId);
    }

}
