package com.smartdev.springbootoauth2.controller;


import com.smartdev.springbootoauth2.domain.City;
import com.smartdev.springbootoauth2.domain.User;
import com.smartdev.springbootoauth2.service.CityService;
import com.smartdev.springbootoauth2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/resources")
public class ResourceController {

    @Autowired
    private UserService userService;

    @Autowired
    private CityService cityService;

    @GetMapping("/users")
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public List<User> getUsers(){
        return userService.findAllUser();
    }

    @GetMapping("/cities")
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public List<City> getCities(){
        return cityService.findAllCities();
    }

}
