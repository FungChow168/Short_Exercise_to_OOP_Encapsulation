package com.techreturner.encapsulation;

public class Main {
    public static void main(String[] args) {
        WeatherReporter aReporter = new WeatherReporter("Some where else", 6.6);
        System.out.println(aReporter.getWeatherReport());
    }
}
