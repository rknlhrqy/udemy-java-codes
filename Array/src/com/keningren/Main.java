package com.keningren;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        int[] myIntArray2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        double[] myDoubleArray = new double[10];
        printArray(myIntArray2);

        int[] myIntArray3 = getIntegers(5);
        printArray(myIntArray3);

    }
}
