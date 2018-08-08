package com.keningren;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("value = 1");
        } else if (value == 2) {
            System.out.println("value = 2");
        } else {
            System.out.println("value != 1 or 2");
        }

        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("value == 1");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("value == 2");
                break;
            default:
                System.out.println("value != 1 or 2");
                break;
        }

        char switchChar = 'A';
        switch (switchChar) {
            case 'A':
                System.out.println("Charactor is A");
                break;
            case 'B':
                System.out.println("Charactor is B");
                break;
            case 'C':
                System.out.println("Charactor is C");
                break;
            case 'D':
                System.out.println("Charactor is D");
                break;
            case 'E':
                System.out.println("Charactor is E");
                break;
            default:
                System.out.println("Unknown charactor");
        }

        String mouth = "January";
        switch (mouth.toLowerCase()) {
            case "january":
                System.out.println("January");
                break;
            case "february":
                System.out.println("February");
                break;
            default:
                System.out.println("Other month");
        }
    }
}
