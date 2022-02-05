package unsw.enrolment;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;

public class Lab extends Session {

    private String tutor;
    private String labAssistant;

    public Lab(int id, String location, DayOfWeek day, LocalTime start, LocalTime end,
            List<Student> enrolments, String tutor, String labAssistant) {
        super(id, location, day, start, end, enrolments);
        this.tutor = tutor;
        this.labAssistant = labAssistant;
    }

    public Lab(int id, String location, DayOfWeek day, LocalTime start, LocalTime end, String tutor,
            String labAssistant) {
        super(id, location, day, start, end);
        this.tutor = tutor;
        this.labAssistant = labAssistant;
    }

    public String getTutor() {
        return this.tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getLabAssistant() {
        return this.labAssistant;
    }

    public void setLabAssistant(String labAssistant) {
        this.labAssistant = labAssistant;
    }
}
