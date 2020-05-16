package com.capstone_loc.restservice.service;

import com.capstone_loc.restservice.domain.Location;
import com.capstone_loc.restservice.repository.LocationDto;
import com.capstone_loc.restservice.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<Location> getAll() {
        List<LocationDto> locationDtos = locationRepository.findAll();

        List<Location> locations = new ArrayList<>();

        for (LocationDto locationDto:locationDtos) {
            locations.add(new Location(locationDto.getId(), locationDto.getName(), locationDto.getZipCode()));
        }

        return locations;
    }

}
