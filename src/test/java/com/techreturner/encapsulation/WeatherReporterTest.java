package com.techreturner.encapsulation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WeatherReporterTest {

    @Test
    public void checkLocationTest(){
        WeatherReporter aReporter = new WeatherReporter("London", 12.6);
        assertEquals("🌦", aReporter.checkLocation());
        aReporter = new WeatherReporter("California", 12.6);
        assertEquals("🌅", aReporter.checkLocation());
        aReporter = new WeatherReporter("Cape Town", 12.6);
        assertEquals("🌤", aReporter.checkLocation());
        aReporter = new WeatherReporter("Some where else", 12.6);
        assertEquals("🔆", aReporter.checkLocation());
    }

    @Test
    public void checkTemperatureTest(){
        WeatherReporter reporter2 = new WeatherReporter("London", 36.6);
        assertEquals("It's too hot 🥵!", reporter2.checkTemperature());
        reporter2 = new WeatherReporter("London", 26.6);
        assertEquals("Ahhh...it's just right 😊!", reporter2.checkTemperature());
        reporter2 = new WeatherReporter("London", 16.6);
        assertEquals("Ahhh...it's just right 😊!", reporter2.checkTemperature());
        reporter2 = new WeatherReporter("London", 6.6);
        assertEquals("It's too cold 🥶!", reporter2.checkTemperature());
    }

    @Test
    public void getWeatherReportTest(){
        WeatherReporter reporter3 = new WeatherReporter("Cape Town", 36.6);
        assertEquals("I am in Cape Town and it is 🌤. It's too hot 🥵!. The temperature in Fahrenheit is 97.88.",
                reporter3.getWeatherReport());
        reporter3 = new WeatherReporter("California", 26.6);
        assertEquals("I am in California and it is 🌅. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 79.88.",
                reporter3.getWeatherReport());
        reporter3 = new WeatherReporter("London", 16.6);
        assertEquals("I am in London and it is 🌦. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 61.88.",
                reporter3.getWeatherReport());
        reporter3 = new WeatherReporter("Some where else", 6.6);
        assertEquals("I am in Some where else and it is 🔆. It's too cold 🥶!. The temperature in Fahrenheit is 43.88.",
                reporter3.getWeatherReport());
    }
}
