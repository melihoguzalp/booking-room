package com.kafein.melih.bookingroom.controller;

import com.kafein.melih.bookingroom.dto.RoomDTO;
import com.kafein.melih.bookingroom.model.District;
import com.kafein.melih.bookingroom.service.base.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/bookingroom/searches")
@RestController
public class SearchController {
    @Autowired
    private SearchService searchService;

    @GetMapping("/by-districtId")
    @ResponseBody
    public List<RoomDTO> findBySearch(@RequestParam("districtId")int districtId){
        return searchService.findBySearch(districtId);
    }
}