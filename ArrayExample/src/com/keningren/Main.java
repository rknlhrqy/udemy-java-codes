package com.keningren;

import sun.nio.ch.sctp.SctpNet;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getInts(int num) {
        int[] values = new int[num];
        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] intArray) {
        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static int[] sortIntArray(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp = 0;
        while (flag) {
            flag = false;
            for (int i = 0; i <array.length - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
    public static void main(String[] args) {
        int[] myIntArray = getInts(5);
        printArray(myIntArray);
        int[] mySortedIntArray = new int[myIntArray.length];
        mySortedIntArray = sortIntArray(myIntArray);
        printArray(mySortedIntArray);
    }
}
