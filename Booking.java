
package AirlinesReservationSystem;

public class Booking {
    public String bookingId;
    public String passengerName;
    public String flightId;
    public boolean isPaid;

    public Booking(String bookingId, String passengerName, String flightId) {
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.flightId = flightId;
        this.isPaid = false;
    }
}
