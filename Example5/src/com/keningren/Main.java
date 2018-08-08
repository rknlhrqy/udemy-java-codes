package com.keningren;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    private static void printIntegerArray(int[] integerArray) {
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println(integerArray[i] + " ");
        }
    }

    private static int[] getIntegers(int number) {
        int[] values = new int[number];
        for(int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int[] sortIntArray(int[] array) {
        int[] sortedIntArray = Arrays.copyOf(array, array.length);
        Boolean flag = true;
        int temp = 0;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedIntArray.length - 1; i++) {
                if (sortedIntArray[i] > sortedIntArray[i + 1]) {
                    temp = sortedIntArray[i];
                    sortedIntArray[i] = sortedIntArray[i + 1];
                    sortedIntArray[i + 1] = temp;
                }
            }
        }
        return sortedIntArray;
    }

    public static void main(String[] args) {
        Car Porche = new Car("Porche", 24);
        Limo myCar;
        myCar = new Limo();
        Limo anotherCar = myCar;
        Car mySecondCar = Porche;

        int number = 10;
        int[] values = new int[number];
        values[3] = 2;
        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double[] myDoubleValues = new double[5];
        Boolean[] myBools = {true, false, true, false, false, true};
        myDoubleValues[3] = 4.2;

        /*
        int[] myValues = getIntegers(5);
        printIntegerArray(myValues);
        int[] mySortedValue = sortIntArray(myValues);
        printIntegerArray(mySortedValue);
        */

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tim");
        stringArrayList.add("Loves");
        stringArrayList.add("Harry");

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(new Integer(10));
        integerArrayList.add(20);
        System.out.println(stringArrayList.size());
        System.out.println(integerArrayList.size());
        System.out.println(stringArrayList.get(1));


        GroceryList myList = new GroceryList();

        myList.addGrocery("Pen");
        myList.addGrocery("Pencil");
        myList.addGrocery("Eraser");
        myList.addGrocery("Ruler");
        myList.addGrocery("Paper");
        myList.addGrocery("Printer");
        myList.addGrocery("Notebook");
        myList.addGrocery("Marker");

        myList.printGroceryList();


        Integer myInt = new Integer(54);
        Double myDouble = new Double(0.3);
        myInt = Integer.valueOf(20);
        int realInt = myInt.intValue();
        myInt = 23;
        realInt = myInt;


        ITelephone myPhone;
        myPhone = new DeskPhone(12345, false);
        myPhone.answer();
        myPhone.callPhone(654321);

        Team miamiTiger = new Team("MiamiTiger");
        miamiTiger.addPlayer(new Player("John Smith") {
            @Override
            public void play() {
                System.out.println(this.getName() + " is playing");
            }
        });

        System.out.println(miamiTiger.getName() + " has " + miamiTiger.numPlayers() + " players.");

    };


}
