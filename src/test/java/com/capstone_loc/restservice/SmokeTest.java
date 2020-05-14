package com.capstone_loc.restservice;

import com.capstone_loc.restservice.controller.LocationController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private LocationController locationController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(locationController).isNotNull();
    }
}
