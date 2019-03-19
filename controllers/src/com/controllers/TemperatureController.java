package com.controllers;

import com.services.TemperatureService;

public class TemperatureController {

    private TemperatureService temperatureService = new TemperatureService();

    public float toFahrenheit(float v) {
        return temperatureService.toFahrenheit(v);
    }

    public String toFormattedFahrenheit(float v) {
        return String.format("%.2fF", temperatureService.toFahrenheit(v));
    }

}
