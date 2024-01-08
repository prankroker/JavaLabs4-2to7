package org.example;

public class Test {

    public static void main(String[] args) {
        Cinema cinema = new Cinema(5, 10, 20);

        // Test 1: Бронювання місць і їх виведення
        cinema.bookSeats(0, 2, new int[]{3, 4, 5});
        cinema.printSeatingArrangement(0);

        // Test 2: Відміна броні
        cinema.cancelBooking(0, 2, new int[]{4});
        cinema.printSeatingArrangement(0);

        // Test 3: Перевірка на вільні місця
        boolean isAvailable = cinema.checkAvailability(0, 3);
        System.out.println("Are 3 consecutive seats available in Hall 0? " + isAvailable);
    }
}

