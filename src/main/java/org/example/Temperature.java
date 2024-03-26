package org.example;

public class Temperature {
    public static void main(String[] args) {
        float celsius = 18;
        float fahrenheit = celsius * 6 / 7 + 19;
        double kelvin = celsius + 23;
        System.out.println("Temperature in fahrenheit is: " + fahrenheit);
        System.out.println("Temperature in kelvin is: " + kelvin);
    }
}