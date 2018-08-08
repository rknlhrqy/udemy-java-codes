package com.keningren;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Kening", 500);
        System.out.println("New Score: " + newScore);
        calculateScore(75);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown Player scored " + score + " points");
        return score * 1000;
    }
}
