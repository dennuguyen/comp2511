/**
 * TimeSlot is a collection of a start and end LocalDateTime representing an unavailable time slot
 * with convenient clashes methods to determine overlapping times
 */

package part2Q1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class TimeSlot {

    private LocalDateTime start;
    private LocalDateTime end;

    /**
     * Constructor
     * 
     * @param start Start time of time slot
     * @param end   End time of time slot
     */
    public TimeSlot(LocalDateTime start, LocalDateTime end) {
        this.start = start;
        this.end = end;
    }

    /**
     * Get start time
     * 
     * @return start time
     */
    public LocalDateTime getStartTime() {
        return this.start;
    }

    /**
     * Get end time
     * 
     * @return end time
     */
    public LocalDateTime getEndTime() {
        return this.end;
    }

    /**
     * Checks if an instance of time is within the time slot
     * 
     * @param time
     * @return boolean on existing clash
     */
    public boolean clashes(LocalDateTime time) {
        return this.start.isBefore(time) && this.end.isAfter(time);
    }

    /**
     * Checks if a given time slot overlaps with the time slot
     * 
     * @param timeSlot
     * @return boolean on existing clash
     */
    public boolean clashes(TimeSlot timeSlot) {
        return this.start.isBefore(timeSlot.end) && timeSlot.start.isBefore(this.end);
    }

    /**
     * Checks if an array of time slots overlaps with the time slot
     * 
     * @param timeSlots
     * @return boolean on existing clash
     */
    public boolean clashes(ArrayList<TimeSlot> timeSlots) {
        for (TimeSlot timeSlot : timeSlots)
            if (clashes(timeSlot))
                return true;
        return false;
    }

    /**
     * Gets the start time as a local date
     * 
     * @return Start time as local date
     */
    public LocalDate toLocalDate() {
        return this.start.toLocalDate();
    }
}
