package com.capstone_loc.restservice.unit.service;

import com.capstone_loc.restservice.domain.Location;
import com.capstone_loc.restservice.repository.LocationDto;
import com.capstone_loc.restservice.repository.LocationRepository;
import com.capstone_loc.restservice.service.LocationService;
import com.capstone_loc.restservice.service.LocationServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
public class LocationServiceTest {

    @TestConfiguration
    static class DepartmentServiceImplTestContextConfiguration {

        @Bean
        public LocationService departmentService() {
            return new LocationServiceImpl();
        }
    }

    @Autowired
    LocationService locationService;

    @MockBean
    private LocationRepository locationRepository;

    @Before
    public void setUp() {
        List<LocationDto> locationDtos = new ArrayList<>();
        locationDtos.add(new LocationDto("Irving", "75016"));
        locationDtos.add(new LocationDto("Plano", "75025"));

        locationDtos.get(0).setId(1L);
        locationDtos.get(1).setId(2L);

        Mockito.when(locationRepository.findAll())
                .thenReturn(locationDtos);
    }

    @Test
    public void getAllLocationsTest() {

        // Arrange

        List<Location> expectedLocations = new ArrayList<>();
        expectedLocations.add(new Location(1L,"Irving", "75016"));
        expectedLocations.add(new Location(2L,"Plano", "75025"));

        // Act

        List<Location> actualLocations = locationService.getAll();

        // Assert

        assertTrue(Arrays.deepEquals(expectedLocations.toArray(), actualLocations.toArray()));
    }
}
