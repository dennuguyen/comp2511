package unsw.enrolment;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;

public class Lecture extends Session {

    private String lecturer;

    public Lecture(int id, String location, DayOfWeek day, LocalTime start, LocalTime end,
            List<Student> enrolments, String lecturer) {
        super(id, location, day, start, end, enrolments);
        this.lecturer = lecturer;
    }

    public Lecture(int id, String location, DayOfWeek day, LocalTime start, LocalTime end,
            String lecturer) {
        super(id, location, day, start, end);
        this.lecturer = lecturer;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }
}
