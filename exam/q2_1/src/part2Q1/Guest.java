/**
 * Guests have the ability to book, change and cancel their bookings. Guests can also track their
 * own bookings by booking id.
 */

package part2Q1;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Guest extends Person implements Requestable {

    private ArrayList<Integer> bookings;

    public Guest(String name) {
        super(name);
        this.bookings = new ArrayList<Integer>();
    }

    @Override
    public Integer book(Hotel hotel, int numGuests, LocalDateTime start, LocalDateTime end) {
        Integer booking = BookingList.getBookingList().book(hotel, numGuests, start, end);
        this.bookings.add(booking);
        return booking;
    }

    @Override
    public Integer change(int id, Hotel hotel, int numGuests, LocalDateTime start,
            LocalDateTime end) {
        Integer booking = BookingList.getBookingList().change(id, hotel, numGuests, start, end);
        // TODO: Change tracked bookings.
        return booking;
    }

    @Override
    public Boolean cancel(int id) {
        Boolean status = BookingList.getBookingList().cancel(id);
        this.bookings.remove(id);
        return status;
    }
}
