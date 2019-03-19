package com.sample;

import com.controllers.TemperatureController;

public class AppRunner {

    public static void main(String[] args) {
        TemperatureController temperatureController = new TemperatureController();

        System.out.println(temperatureController.toFormattedFahrenheit(34.6f));
    }

}
