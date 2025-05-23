
package AirlinesReservationSystem;

public class MainApp {
    public static void main(String[] args) {
        FlightManager system = new FlightManager();
        system.addDummyFlights();

        while (true) {
            System.out.println("\n1. Search Flights\n2. Book Flight\n3. Make Payment\n4. Issue Ticket\n5. Manage Flights\n6. Exit\n7. View Bookings (Sorted)");
            int choice = ReservationSystem.scanner.nextInt();
            switch (choice) {
                case 1 -> system.searchFlights();
                case 2 -> system.bookFlight();
                case 3 -> system.makePayment();
                case 4 -> system.issueTicket();
                case 5 -> system.manageFlights();
                case 6 -> System.exit(0);
                case 7 -> system.viewSortedBookings();
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
