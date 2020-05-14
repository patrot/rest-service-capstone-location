package com.capstone_loc.restservice.unit.service;

import com.capstone_loc.restservice.domain.Location;
import com.capstone_loc.restservice.domain.LocationServiceImpl;
import com.capstone_loc.restservice.service.LocationService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LocationServiceTest {

    @Test
    public void GetAllLocationsTest() {

        // Arrange

        List<Location> expectedLocations = new ArrayList<>();
        expectedLocations.add(new Location(1L,"Irving", "75016"));
        expectedLocations.add(new Location(2L,"Plano", "75025"));

        LocationService locationService = new LocationServiceImpl();

        // Act

        List<Location> actualLocations = locationService.getAll();

        // Assert

        assertTrue(Arrays.deepEquals(expectedLocations.toArray(), actualLocations.toArray()));
    }
}
