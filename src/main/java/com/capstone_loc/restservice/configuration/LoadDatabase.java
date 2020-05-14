package com.capstone_loc.restservice.configuration;

import com.capstone_loc.restservice.repository.LocationDto;
import com.capstone_loc.restservice.repository.LocationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(LocationRepository locationRepository) {
        return args -> {

            log.info("Existing department items count " + locationRepository.count());

            if (locationRepository.count() < 1) {
                log.info("Preloading " + locationRepository.save(new LocationDto("Irving", "75016")));
                log.info("Preloading " + locationRepository.save(new LocationDto("Plano", "75025")));
            }
        };
    }
}
