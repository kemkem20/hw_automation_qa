package org.example;

public class LongInt {
    public static void main(String[] args) {
        long x = 999999999999L;
        int y = (int) x;
        System.out.println("Original is:" + x);
        System.out.println("Converted is:" + y);
    }
}
