package com.keningren;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("10000 at 2 % interest = " + calculateInterest(10000, 2 * i));
        }

        int count = 0;
        while (count < 5) {
            System.out.println("10000 at 2 % interest = " + calculateInterest(10000, 2 * count));
            count++;
        }

        int count2 = 0;
        do {
            System.out.println("10000 at 2 % interest = " + calculateInterest(10000, 2 * count2));
            count2 ++;
        } while(count2 < 5);
    }

    public static double calculateInterest(double amount, double interest) {
        return (amount * interest / 100);
    }
}
