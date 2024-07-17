package com.course.javatesting.controller;

import com.course.javatesting.model.Weather;
import com.course.javatesting.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService service;
    @GetMapping("/api/weather")
    public Weather getWeather(){
        return service.getWeather();
    }
}
