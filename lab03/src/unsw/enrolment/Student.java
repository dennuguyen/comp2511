package unsw.enrolment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    private String zid;
    private List<Grade> grades;

    public Student(String zid) {
        this.zid = zid;
        this.grades = new ArrayList<Grade>();
    }

    public String getZID() {
        return this.zid;
    }

    public void setZID(String zid) {
        this.zid = zid;
    }

    public Grade getGrade(Course course) {
        for (Grade g : this.grades)
            if (Objects.equals(g.getCourseCode(), course.getCourseCode()))
                return g;
        return null;
    }

    public void enrol(CourseOffering courseOffering, List<Session> sessions) {
        courseOffering.addEnrolment(this, sessions);
    }

    public void addGrade(Grade grade) {
        this.grades.add(grade);
    }

    public void joinSession(Session session) {
        session.addEnrolment(this);
    }
}
