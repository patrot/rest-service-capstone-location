package com.capstone_loc.restservice.controller;

import com.capstone_loc.restservice.domain.Location;
import com.capstone_loc.restservice.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/locations")
    public List<Location> allLocations() {

        return locationService.getAll();
    }
}
