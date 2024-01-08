package org.example;

import java.util.Arrays;

public class Cinema {
    private int[][][] seatingArrangement;

    public Cinema(int halls, int rows, int seatsPerRow) {
        seatingArrangement = new int[halls][rows][seatsPerRow];
        initializeSeats();
    }

    private void initializeSeats() {
        for (int[][] ints : seatingArrangement) {
            for (int[] anInt : ints) {
                Arrays.fill(anInt, 0);
            }
        }
    }
    public void bookSeats(int hallNumber, int row, int[] seats) {
        for (int seat : seats) {
            if (seatingArrangement[hallNumber][row][seat] == 1) {
                System.out.println("Seat at Hall " + hallNumber + ", Row " + row + ", Seat " + seat + " is already booked.");
            } else {
                seatingArrangement[hallNumber][row][seat] = 1;
                System.out.println("Seat at Hall " + hallNumber + ", Row " + row + ", Seat " + seat + " booked successfully.");
            }
        }
    }
    public void cancelBooking(int hallNumber, int row, int[] seats) {
        for (int seat : seats) {
            if (seatingArrangement[hallNumber][row][seat] == 0) {
                System.out.println("Seat at Hall " + hallNumber + ", Row " + row + ", Seat " + seat + " is not booked.");
            } else {
                seatingArrangement[hallNumber][row][seat] = 0;
                System.out.println("Booking canceled for Seat at Hall " + hallNumber + ", Row " + row + ", Seat " + seat + ".");
            }
        }
    }

    public boolean checkAvailability(int hallNumber, int numSeats) {
        for (int i = 0; i < seatingArrangement[hallNumber].length; i++) {
            int consecutiveSeats = 0;
            for (int j = 0; j < seatingArrangement[hallNumber][i].length; j++) {
                if (seatingArrangement[hallNumber][i][j] == 0) {
                    consecutiveSeats++;
                    if (consecutiveSeats == numSeats) {
                        return true;
                    }
                } else {
                    consecutiveSeats = 0;
                }
            }
        }
        return false;
    }
    public void printSeatingArrangement(int hallNumber) {
        System.out.println("Seating Arrangement for Hall " + hallNumber + ":");
        for (int i = 0; i < seatingArrangement[hallNumber].length; i++) {
            for (int j = 0; j < seatingArrangement[hallNumber][i].length; j++) {
                if (seatingArrangement[hallNumber][i][j] == 0) {
                    System.out.print("O ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}