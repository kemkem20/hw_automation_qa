package org.example.homework4;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else System.out.println(year + " isn't a Leap Year or out of range [1;9999]");
    }

    private static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else return false;
    }
}