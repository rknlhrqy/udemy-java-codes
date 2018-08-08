package com.keningren;

import org.omg.PortableServer.THREAD_POLICY_ID;
import sun.swing.BakedArrayList;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();
    //private List<Seat> seats = new LinkedList();
    //private Collection<Seat> seats = new LinkedList();
    //private Collection<Seat> seats = new HashSet<>();
    //private Collection<Seat> seats = new LinkedHashSet<>();

    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat s1, Seat s2) {
            if (s1.getPrice() < s2.getPrice()) {
                return -1;
            } else if (s1.getPrice() > s2.getPrice()) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12.00;
                if ((row < 'D') && (seatNum >= 4) && (seatNum <= 9)) {
                    price = 14.00;
                } else if ((row > 'F') && ((seatNum < 4) || (seatNum > 9))) {
                    price = 7.00;
                }

                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }
    public String getTheatreName() {
        return this.theatreName;
    }


    public void sortList(List<? extends Seat> list) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) >= 0) {
                    Collections.swap(list, i, i + 1);
                    swapped = true;
                }
            }
        }
    }
    public void printNewList() {
        List<Seat> seatsCopy = new ArrayList<>(seats);

        //Collections.reverse(seats);
        Collections.shuffle(seatsCopy);
        sortList(seatsCopy);

        Seat minSeat = Collections.min(seatsCopy);
        Seat maxSeat = Collections.max(seatsCopy);
        System.out.println(minSeat.getSeatNumber());
        System.out.println(maxSeat.getSeatNumber());

        seatsCopy.get(10).reserve();
        seats.get(10).reserve();

        for ( Seat seat: seatsCopy) {
            System.out.println(seat.getSeatNumber());
        }
        System.out.println("#######################");


        List<Seat> priceSeats = new ArrayList<>(getSeats());
        priceSeats.add(new Seat("B00", 13.00));
        priceSeats.add(new Seat("A00", 13.00));
        Collections.sort(priceSeats, PRICE_ORDER);
        for ( Seat seat: priceSeats) {
            System.out.println(seat.getSeatNumber());
        }
        System.out.println("@@@@@@@@@@@@@@@@@");

    }
    /*
    public boolean reserveSeat(String seatNum) {
        Seat requestedSeat = null;
        for(Seat seat: seats) {
            System.out.print(".");
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            if (seat.getSeatNumber().equals(seatNum)) {
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNum);
            return false;
        }

        return requestedSeat.reserve();
    }
    */

    public boolean reserveSeat(String seatNum) {
        Seat requestedSeat = new Seat(seatNum, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("Seat " + seatNum + " is not available");
            return false;
        }
    }


    // For testing purpose
    public void printSeats(){
        for (Seat seat: seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    public Collection<Seat> getSeats() {
        return seats;
    }

    private class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                System.out.println("Seat " + seatNumber + " cannot be reserved");
                return false;
            }
        }
        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of Seat " + seatNumber + " is cancelled");
                return true;
            } else {
                return false;
            }

        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }
    }

}
