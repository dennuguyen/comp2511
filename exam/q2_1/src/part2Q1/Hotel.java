/**
 * Hotels have rooms and can manage and track bookings for their rooms.
 */

package part2Q1;

import java.util.ArrayList;

public class Hotel implements Manageable, Bookable {

    private String hotelName;
    private ArrayList<Room> rooms;

    public Hotel(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public Room addRoom(int size) {
        Room room = null;
        if (size <= 2)
            room = new SmallRoom(rooms.size());
        else if (size <= 6)
            room = new MediumRoom(rooms.size());
        else
            room = new LargeRoom(rooms.size());
        this.rooms.add(room);
        return room;
    }

    @Override
    public ArrayList<Booking> getBookedRooms(TimeSlot timeSlot) {
        // TODO: Check all rooms if booked in the given time slot. Use clash() from TimeSlot.
        return null;
    }

    @Override
    public ArrayList<Booking> getEmptyRooms(TimeSlot timeSlot) {
        // TODO: Check all rooms if empty in the given time slot. Use clash() from TimeSlot.
        return null;
    }

    @Override
    public Booking addBooking(Integer id) {
        // TODO: Check rooms for valid booking
        return null;
    }

    @Override
    public Boolean removeBooking(Integer id) {
        // TODO: Check rooms for valid booking
        return null;
    }
}
