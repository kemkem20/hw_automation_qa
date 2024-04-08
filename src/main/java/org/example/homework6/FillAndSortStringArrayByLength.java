package org.example.homework6;

import java.util.Scanner;

public class FillAndSortStringArrayByLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int length = Integer.parseInt(scanner.nextLine());

        String[] array = new String[length];
        fillTheArray(scanner, array);
        sortArrayByStringLength(array);
        printArray(array);
    }

    private static void printArray(String[] array) {
        System.out.println("Sorted array");
        for (String str : array) {
            System.out.println(str);

        }
    }

    private static void sortArrayByStringLength(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (i = 0; i < array.length - i - 1; i++) {
                if (array[i].length() > array[i + 1].length()) {
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    private static void fillTheArray(Scanner scanner, String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a string element #" + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }
    }
}
