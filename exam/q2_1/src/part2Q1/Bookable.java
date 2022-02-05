package part2Q1;

public interface Bookable {

    /**
     * Adds a booking to a room
     * 
     * @param id Booking id
     * @return Booking on success
     */
    public Booking addBooking(Integer id);

    /**
     * Removes booking from room
     * 
     * @param id Booking id
     * @return Success status
     */
    public Boolean removeBooking(Integer id);
}
