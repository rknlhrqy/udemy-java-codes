package com.keningren;

public class Main {

    public static void main(String[] args) {
        // Data type
        byte myByteValue = 127;
        short myShortNumber = 32767;
        int myNumber = 2_001_234_345;
        long myLongNumber = 100L;

        long myNewLongNumber = (long)myNumber + (long) myByteValue + (long) myShortNumber + (myLongNumber/2);

        byte myNewByteNumber = (byte) (myByteValue/2);
        short myNewShortNumber = (short) (myShortNumber/2);
        System.out.println("MyNewByteNumber: " + myNewByteNumber);
        System.out.println("myNewShortNumber: " + myNewShortNumber);
        System.out.println("myNewLongNumber: " + myNewLongNumber);


    }
}
