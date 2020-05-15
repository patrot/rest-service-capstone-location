package com.capstone_loc.restservice.unit.service;

import com.capstone_loc.restservice.domain.Location;
import com.capstone_loc.restservice.service.LocationServiceImpl;
import com.capstone_loc.restservice.repository.LocationDto;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LocationServiceTest {

    @Test
    public void getAllLocationsTest() {

        // Arrange

        List<LocationDto> locationDtos = new ArrayList<>();
        locationDtos.add(new LocationDto("Irving", "75016"));
        locationDtos.add(new LocationDto("Plano", "75025"));

        MockLocationRepository mockLocationRepository = new MockLocationRepository(locationDtos);
        LocationServiceImpl locationService = new LocationServiceImpl();
        locationService.setRepository(mockLocationRepository);

        List<Location> expectedLocations = new ArrayList<>();
        for (LocationDto locationDto:locationDtos) {
            expectedLocations.add(new Location(locationDto.getId(), locationDto.getName(), locationDto.getZipCode()));
        }

        // Act

        List<Location> actualLocations = locationService.getAll();

        // Assert

        assertTrue(Arrays.deepEquals(expectedLocations.toArray(), actualLocations.toArray()));

        assertEquals(1, mockLocationRepository.getFindAllInvocationCount());
    }
}
