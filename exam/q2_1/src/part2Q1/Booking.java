/**
 * Encapsulates
 */

package part2Q1;

public class Booking {

    private int id;
    private Hotel hotel;
    private Room room;
    private TimeSlot timeSlot;
    private int numGuests;

    public Booking(int id, Hotel hotel, Room room, TimeSlot timeSlot, int numGuests) {
        this.id = id;
        this.hotel = hotel;
        this.room = room;
        this.timeSlot = timeSlot;
        this.numGuests = numGuests;
    }
}
