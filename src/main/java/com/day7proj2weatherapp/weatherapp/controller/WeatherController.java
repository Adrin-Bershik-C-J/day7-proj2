package com.day7proj2weatherapp.weatherapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @GetMapping("/weather/today")
    public String getTodaysWeather() {
        return "Today's weather: Sunny, 30°C";
    }

    @GetMapping("/weather/tomorrow")
    public String getTomorrowsWeather() {
        return "Tomorrow's forecast: Cloudy with rain";
    }

    @GetMapping("/weather/city/{name}")
    public String getCityWeather(@PathVariable String name) {
        return "Weather report for " + name + " is currently unavailable.";
    }

}
