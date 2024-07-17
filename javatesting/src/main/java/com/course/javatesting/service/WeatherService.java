package com.course.javatesting.service;

import com.course.javatesting.model.Weather;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class WeatherService {

    @GetMapping("/api/weather")
    public Weather getWeather(){
        Weather weather = new Weather();
        weather.setMaxTemp(20);
        weather.setMinTemp(10);
        weather.setStatus("Cloudy");
        return weather;
    }
}
