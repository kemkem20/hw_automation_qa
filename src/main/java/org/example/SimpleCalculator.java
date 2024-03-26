package org.example;

public class SimpleCalculator {
    public static void main(String[] args) {
        int x = 8;
        int y = 9;
        int addition = x + y;
        System.out.println("Addition is:" + addition);
        int subtraction = x - y;
        System.out.println("Subtraction is:" + subtraction);
        int multiplication = x * y;
        System.out.println("Multiplication is:" + multiplication);
        double division = (double) x / y;
        System.out.println("Division is:" + division);
    }
}
