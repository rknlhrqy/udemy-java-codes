package com.keningren;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        //theatre.getSeats();
        if (theatre.reserveSeat("H11")) {
            System.out.println("Seat H1 is reserved");
        } else {
            System.out.println("H11 is not available");
        }
        if (theatre.reserveSeat("H11")) {
            System.out.println("Seat H1 is reserved");
        } else {
            System.out.println("H11 is not available");
        }

        theatre.printNewList();
    }
}
