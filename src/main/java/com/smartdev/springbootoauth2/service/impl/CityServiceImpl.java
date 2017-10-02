package com.smartdev.springbootoauth2.service.impl;

import com.smartdev.springbootoauth2.domain.City;
import com.smartdev.springbootoauth2.repository.CityRepository;
import com.smartdev.springbootoauth2.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> findAllCities() {
        return cityRepository.findAll();
    }
}
