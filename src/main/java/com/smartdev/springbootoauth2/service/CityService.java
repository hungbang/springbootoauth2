package com.smartdev.springbootoauth2.service;

import com.smartdev.springbootoauth2.domain.City;
import com.smartdev.springbootoauth2.domain.User;

import java.util.List;

public interface CityService {
    List<City> findAllCities();
}
