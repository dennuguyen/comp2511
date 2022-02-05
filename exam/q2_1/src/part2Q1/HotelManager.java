/**
 * Hotel managers belong to a hotel and can manage rooms.
 */

package part2Q1;

import java.util.ArrayList;

public class HotelManager extends Person implements Manageable {

    private Hotel hotel;

    public HotelManager(String name) {
        this(name, null);
    }

    public HotelManager(String name, Hotel hotel) {
        super(name);
        this.hotel = hotel;
    }

    @Override
    public Room addRoom(int size) {
        if (this.hotel == null)
            return null;
        return this.hotel.addRoom(size);
    }

    @Override
    public ArrayList<Booking> getBookedRooms(TimeSlot timeSlot) {
        if (this.hotel == null)
            return null;
        return this.hotel.getBookedRooms(timeSlot);
    }

    @Override
    public ArrayList<Booking> getEmptyRooms(TimeSlot timeSlot) {
        if (this.hotel == null)
            return null;
        return this.hotel.getBookedRooms(timeSlot);
    }
}
