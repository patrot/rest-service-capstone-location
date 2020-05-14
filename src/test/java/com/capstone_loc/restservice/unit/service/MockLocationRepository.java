package com.capstone_loc.restservice.unit.service;

import com.capstone_loc.restservice.repository.LocationDto;
import com.capstone_loc.restservice.repository.LocationRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class MockLocationRepository implements LocationRepository {

    private final List<LocationDto> locationDtos;

    private int findAllInvocationCount;

    public MockLocationRepository(List<LocationDto> locationDtos) {
        this.locationDtos = locationDtos;
        findAllInvocationCount = 0;
    }

    public int getFindAllInvocationCount() {
        return findAllInvocationCount;
    }

    @Override
    public List<LocationDto> findAll() {
        findAllInvocationCount++;
        return locationDtos;
    }

    @Override
    public List<LocationDto> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<LocationDto> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<LocationDto> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(LocationDto entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends LocationDto> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends LocationDto> S save(S entity) {
        return null;
    }

    @Override
    public <S extends LocationDto> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<LocationDto> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends LocationDto> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<LocationDto> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public LocationDto getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends LocationDto> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends LocationDto> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends LocationDto> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends LocationDto> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends LocationDto> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends LocationDto> boolean exists(Example<S> example) {
        return false;
    }
}
