package unsw.enrolment;

import java.util.ArrayList;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

public class Session {

    private int id;
    private String location;
    private DayOfWeek day;
    private LocalTime start;
    private LocalTime end;
    private List<Student> enrolments;

    public Session(int id, String location, DayOfWeek day, LocalTime start, LocalTime end,
            List<Student> enrolments) {
        this.id = id;
        this.location = location;
        this.day = day;
        this.start = start;
        this.end = end;
        this.enrolments = enrolments;
    }

    public Session(int id, String location, DayOfWeek day, LocalTime start, LocalTime end) {
        this(id, location, day, start, end, new ArrayList<Student>());
    }

    public int getID() {
        return this.id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public void addEnrolment(Student student) {
        this.enrolments.add(student);
    }

    public void removeEnrolment(Student student) {
        this.enrolments.removeIf(s -> Objects.equals(s.getZID(), student.getZID()));
    }
}
