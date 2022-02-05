package unsw.enrolment;

import java.util.ArrayList;
import java.util.List;
import unsw.log.Log;

public class Enrolment {

    private CourseOffering offering;
    private GradeComponent grade;
    private Student student;
    private List<Session> sessions;
    private Log log;

    public Enrolment(CourseOffering offering, Student student, Session... sessions) {
        this.offering = offering;
        this.student = student;
        this.grade = null; // Student has not completed course yet.
        student.addEnrolment(this);
        offering.addEnrolment(this);
        this.sessions = new ArrayList<>();
        for (Session session : sessions) {
            this.sessions.add(session);
        }
        this.log = new Log(this.offering.getCourse().getCourseCode() + "-" + this.offering.getTerm()
                + "-" + this.student.getZID());
    }

    public Course getCourse() {
        return offering.getCourse();
    }

    public String getTerm() {
        return offering.getTerm();
    }

    public boolean hasPassed() {
        return grade != null && grade.isPassing();
    }

    public void referenceGrade(GradeComponent grade) {
        this.grade = grade;
    }

    public Log getLog() {
        return this.log;
    }
}
