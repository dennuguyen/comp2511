/**
 * Rooms have their unique room number and track bookings made for that room.
 */

package part2Q1;

import java.util.ArrayList;

public abstract class Room implements Bookable {

    private int roomNumber;
    private ArrayList<Integer> bookings;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.bookings = new ArrayList<Integer>();
    }

    @Override
    public Booking addBooking(Integer id) {
        // TODO: Check id for valid booking for this room.
        return null;
    }

    @Override
    public Boolean removeBooking(Integer id) {
        // TODO: Remove booking for this room.
        return false;
    }
}
