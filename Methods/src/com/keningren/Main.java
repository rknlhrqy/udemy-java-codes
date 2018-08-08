package com.keningren;

public class Main {

    public static void main(String[] args) {
        int result = 0;
        result = calculateScore(true, 100);
        System.out.println("Result: " + result);
        result = calculateScore(false, 100);
        System.out.println("Result: " + result);
    }

    public static int calculateScore(boolean gameOver, int score) {
        if (gameOver) {
            System.out.println("calculateScore(): " + score);
            displayHighScorePosition("Byron", 200);
        } else {
            System.out.println("calculateScore() so not: " + score);
            int rel = 0;
            rel = calculateHighScorePostion("Byron", 200);
            System.out.println("Return is: " + rel);
        }
        return score;
    }

    public static void displayHighScorePosition(String playerName, int score) {
        System.out.println(playerName + ": " + score);
    }

    public static int calculateHighScorePostion(String playerName, int score) {
        System.out.println(playerName + ": " + score);
        return 0;
    }
}
