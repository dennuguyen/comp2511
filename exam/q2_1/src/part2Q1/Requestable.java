/**
 * Requestable interface to allow requests for bookings.
 */

package part2Q1;

import java.time.LocalDateTime;

public interface Requestable {

    /**
     * Make request for a new booking.
     * 
     * @param hotel     Name of hotel
     * @param numGuests Number of guests
     * @param start     Start date of booking
     * @param end       End date of booking
     * @return Booking id on success
     */
    public Integer book(Hotel hotel, int numGuests, LocalDateTime start, LocalDateTime end);

    /**
     * Make request to change an existing booking.
     * 
     * @param id        Booking id
     * @param hotel     Name of hotel
     * @param numGuests Number of guests
     * @param start     Start date of booking
     * @param end       End date of booking
     * @return Booking id on success
     */
    public Integer change(int id, Hotel hotel, int numGuests, LocalDateTime start,
            LocalDateTime end);

    /**
     * Make request to cancel an existing booking.
     * 
     * @param id Booking id
     * @return Success status
     */
    public Boolean cancel(int id);
}
