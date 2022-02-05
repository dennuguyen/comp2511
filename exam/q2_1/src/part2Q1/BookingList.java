/**
 * BookingList is a unified booking system for multiple hotels and handles unique booking ids.
 */

package part2Q1;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class BookingList implements Requestable {

    private ArrayList<Booking> bookings;
    private ArrayList<Booking> temporary;

    /**
     * Constructor
     */
    private BookingList() {
        this.bookings = new ArrayList<Booking>();
        this.temporary = new ArrayList<Booking>();
    }

    /**
     * Bill Pugh singleton
     */
    private static class BillPughBookingList {
        private static final BookingList bookingList = new BookingList();
    }

    /**
     * Get BookingList singleton
     */
    public static BookingList getBookingList() {
        return BillPughBookingList.bookingList;
    }

    /**
     * Gets the booking by its id
     * 
     * @param id Booking id
     * @return Referenced booking
     */
    public Booking getBooking(Integer id) {
        // TODO: Get booking by its id.
        return null;
    }

    @Override
    public Integer book(Hotel hotel, int numGuests, LocalDateTime start, LocalDateTime end) {
        // TODO: Book a time slot into the appropriate room of a hotel. Checks if booking is valid.
        // Returns unique booking id.
        return null;
    }

    @Override
    public Integer change(int id, Hotel hotel, int numGuests, LocalDateTime start,
            LocalDateTime end) {
        // TODO: Book a time slot into the appropriate room of a hotel. Checks if booking is valid.
        // Returns unique booking id.
        saveState();
        restoreState();
        return null;
    }

    @Override
    public Boolean cancel(int id) {
        // TODO: Remove the booking. True if successful cancellation.
        return true;
    }

    /**
     * Helper function for changing a booking where state is saved into a temporary.
     */
    private void saveState() {
        this.temporary = new ArrayList<Booking>(this.bookings);
    }

    /**
     * Helper function for changing a booking where original state is restored.
     */
    private void restoreState() {
        this.bookings = new ArrayList<Booking>(this.temporary);
        this.temporary.clear();
    }
}
