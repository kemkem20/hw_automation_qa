package org.example;

public class Temperature {
    public static void main(String[] args) {
        float celsius = 18;
        float fahrenheit = celsius * 9 / 5 + 32;
        double kelvin = celsius + 273.15;
        System.out.println("Temperature in fahrenheit is: " + fahrenheit);
        System.out.println("Temperature in kelvin is: " + kelvin);
    }
}