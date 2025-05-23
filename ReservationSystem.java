
package AirlinesReservationSystem;

import java.util.*;

public class ReservationSystem {
    protected static Scanner scanner = new Scanner(System.in);
    protected static List<Flight> flights = new ArrayList<>();
    protected static List<Booking> bookings = new ArrayList<>();

    public void addDummyFlights() {
        flights.add(new Flight("F101", "Dhaka", "Chittagong", "10:00 AM", 10));
        flights.add(new Flight("F102", "Dhaka", "Sylhet", "03:00 PM", 8));
        flights.add(new Flight("F103", "Chittagong", "Cox'sBazar", "11:30 AM", 5));
    }

    public void searchFlights() {
        System.out.print("Enter source: ");
        String source = scanner.next();
        System.out.print("Enter destination: ");
        String destination = scanner.next();

        boolean found = false;
        for (Flight f : flights) {
            if (f.source.equalsIgnoreCase(source) && f.destination.equalsIgnoreCase(destination)) {
                System.out.println("Flight ID: " + f.flightId + ", Departure: " + f.departureTime + ", Seats Available: " + f.availableSeats);
                found = true;
            }
        }
        if (!found) System.out.println("No flights available.");
    }

    public void bookFlight() {
        System.out.print("Enter passenger name: ");
        String name = scanner.next();
        System.out.print("Enter flight ID: ");
        String flightId = scanner.next();

        for (Flight f : flights) {
            if (f.flightId.equalsIgnoreCase(flightId) && f.availableSeats > 0) {
                f.availableSeats--;
                Booking b = new Booking(UUID.randomUUID().toString(), name, flightId);
                bookings.add(b);
                System.out.println("Booking successful! Booking ID: " + b.bookingId);
                return;
            }
        }
        System.out.println("Flight not available or full.");
    }

    public void makePayment() {
        System.out.print("Enter booking ID: ");
        String bookingId = scanner.next();
        for (Booking b : bookings) {
            if (b.bookingId.equals(bookingId)) {
                if (!b.isPaid) {
                    b.isPaid = true;
                    System.out.println("Payment successful for booking ID: " + bookingId);
                } else {
                    System.out.println("Already paid.");
                }
                return;
            }
        }
        System.out.println("Booking not found.");
    }

    public void issueTicket() {
        System.out.print("Enter booking ID: ");
        String bookingId = scanner.next();
        for (Booking b : bookings) {
            if (b.bookingId.equals(bookingId)) {
                if (b.isPaid) {
                    System.out.println("Ticket issued for " + b.passengerName + ", Flight: " + b.flightId);
                } else {
                    System.out.println("Payment pending. Cannot issue ticket.");
                }
                return;
            }
        }
        System.out.println("Booking not found.");
    }

    public void viewSortedBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
            return;
        }

        System.out.println("\nBookings (sorted by passenger name):");
        bookings.stream()
                .sorted(Comparator.comparing(b -> b.passengerName))
                .forEach(b -> System.out.println("Passenger: " + b.passengerName + ", Booking ID: " + b.bookingId + ", Flight ID: " + b.flightId + ", Paid: " + b.isPaid));
    }
}
