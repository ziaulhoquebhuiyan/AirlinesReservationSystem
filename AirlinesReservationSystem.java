class Flight {
    String flightNumber;
    String source;
    String destination;
    Date departureTime;
    List<Seat> seats;

    void scheduleFlight() {}
    void cancelFlight() {}
}

class Seat {
    String seatNumber;
    boolean isBooked;

    void bookSeat() {}
    void cancelSeat() {}
}

class Passenger {
    String name;
    String passportNumber;
    Booking booking;

    void bookFlight(Flight flight) {}
}

class Booking {
    String bookingID;
    Flight flight;
    Passenger passenger;

    void confirmBooking() {}
    void cancelBooking() {}
}