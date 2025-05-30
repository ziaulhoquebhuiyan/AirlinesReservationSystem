class Hotel {
    String name;
    String location;
    List<Room> rooms;

    void addRoom(Room room) {}
    void removeRoom(Room room) {}
}

class Room {
    int roomNumber;
    String type;
    double price;
    boolean status;

    void book() {}
    void vacate() {}
}

class Customer {
    String name;
    String contactInfo;
    Booking booking;

    void makeBooking(Room room) {}
    void cancelBooking() {}
}

class Booking {
    String bookingID;
    Room room;
    Customer customer;
    Date date;

    void confirm() {}
    void cancel() {}
}