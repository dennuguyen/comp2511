package unsw.enrolment;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;

public class Tutorial extends Session {

    private String tutor;

    public Tutorial(int id, String location, DayOfWeek day, LocalTime start, LocalTime end,
            List<Student> enrolments, String tutor) {
        super(id, location, day, start, end, enrolments);
        this.tutor = tutor;
    }

    public Tutorial(int id, String location, DayOfWeek day, LocalTime start, LocalTime end,
            String tutor) {
        super(id, location, day, start, end);
        this.tutor = tutor;
    }

    public String getTutor() {
        return this.tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
}
