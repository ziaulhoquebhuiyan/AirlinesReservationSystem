
package AirlinesReservationSystem;

public class FlightManager extends ReservationSystem {

    public void manageFlights() {
        System.out.println("\nCurrent Flights:");
        for (Flight f : flights) {
            System.out.println("Flight: " + f.flightId +
                    " | From: " + f.source +
                    " | To: " + f.destination +
                    " | Departure: " + f.departureTime +
                    " | Seats: " + f.availableSeats);
        }

        System.out.println("\n1. Add Flight\n2. Remove Flight\n3. Back");
        int option = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        switch (option) {
            case 1 -> addFlight();
            case 2 -> removeFlight();
            case 3 -> System.out.println("Returning to main menu...");
            default -> System.out.println("Invalid option.");
        }
    }

    private void addFlight() {
        System.out.print("Flight ID: ");
        String id = scanner.next();
        System.out.print("Source: ");
        String src = scanner.next();
        System.out.print("Destination: ");
        String dest = scanner.next();
        scanner.nextLine(); // consume newline
        System.out.print("Departure Time: ");
        String dep = scanner.nextLine();
        System.out.print("Seats: ");
        int seats = scanner.nextInt();

        flights.add(new Flight(id, src, dest, dep, seats));
        System.out.println("Flight added successfully.");
    }

    private void removeFlight() {
        System.out.print("Enter Flight ID to remove: ");
        String fid = scanner.next();
        boolean removed = flights.removeIf(f -> f.flightId.equalsIgnoreCase(fid));
        if (removed) {
            System.out.println("Flight removed successfully.");
        } else {
            System.out.println("Flight ID not found.");
        }
    }
}
