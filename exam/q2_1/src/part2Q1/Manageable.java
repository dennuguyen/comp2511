/**
 * Manageable interface to manage rooms of a hotel.
 */

package part2Q1;

import java.util.ArrayList;

public interface Manageable {

    /**
     * Adds room to a hotel
     * 
     * @param size Room size
     * @return Room on success
     */
    public Room addRoom(int size);

    /**
     * Gets the booked rooms of a hotel in the given time slot.
     * 
     * @return Booked hotel rooms
     */
    public ArrayList<Booking> getBookedRooms(TimeSlot timeSlot);

    /**
     * Gets the empty rooms of a hotel in the given time slot.
     * 
     * @return Empty hotel rooms
     */
    public ArrayList<Booking> getEmptyRooms(TimeSlot timeSlot);
}
