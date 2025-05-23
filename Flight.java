
package AirlinesReservationSystem;

public class Flight {
    public String flightId;
    public String source;
    public String destination;
    public String departureTime;
    public int availableSeats;

    public Flight(String flightId, String source, String destination, String departureTime, int availableSeats) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.availableSeats = availableSeats;
    }
}
