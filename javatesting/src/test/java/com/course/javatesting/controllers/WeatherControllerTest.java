package com.course.javatesting.controllers;

import com.course.javatesting.controller.WeatherController;
import com.course.javatesting.model.Weather;
import com.course.javatesting.service.WeatherService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class WeatherControllerTest {

    @InjectMocks
    private WeatherController controller;

    @Mock
    private WeatherService service;

    @Test
    public void getWeatherTest() {
        Weather weatherMock = new Weather();
        weatherMock.setMaxTemp(30);
        weatherMock.setMinTemp(15);
        weatherMock.setStatus("Sunny");

        when(service.getWeather()).thenReturn(weatherMock);

        Weather result = controller.getWeather();

        verify(service, times(1)).getWeather();
    }
}
