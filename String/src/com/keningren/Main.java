package com.keningren;

public class Main {

    public static void main(String[] args) {
        String myString = "I like my dream";
        System.out.println(myString);
        String my2ndString = myString + " \u00a9";
        System.out.println("The result is: " + my2ndString);

        double doubleNumber = 120.34;
        String my3rdString = "10";
        my3rdString = my3rdString + doubleNumber;
        System.out.println(my3rdString);
    }
}
