package com.techreturner.encapsulation;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;
    private final double FACTORINCONVERSION = 9.0/5.0;
    private final int CONSTANTINCONVERSION = 32;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public double convertCelciusToFahrenheit (double celcius){
        return FACTORINCONVERSION * celcius + CONSTANTINCONVERSION;
    }

    public String getWeatherReport() {

        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.",
                location, checkLocation(), checkTemperature(), convertCelciusToFahrenheit(temperature));

    }

    public String checkLocation() {

        return switch (location) {
            case "London" -> "🌦";
            case "California" -> "🌅";
            case "Cape Town" -> "🌤";
            default -> "🔆";
        };

    }

    public String checkTemperature() {
        if (temperature > 30)
            return "It's too hot 🥵!";
        else if (temperature >= 10)
            return "Ahhh...it's just right 😊!";
        else
            return "It's too cold 🥶!";
    }

}