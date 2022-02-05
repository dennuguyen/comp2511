
package unsw.enrolment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CourseOffering {

    private Course course;
    private String term;
    private List<Student> enrolments;
    private List<Session> sessions;

    public CourseOffering(Course course, String term, List<Student> enrolments,
            List<Session> sessions) {
        this.course = course;
        this.term = term;
        this.enrolments = enrolments;
        this.sessions = sessions;
    }

    public CourseOffering(Course course, String term) {
        this(course, term, new ArrayList<Student>(), new ArrayList<Session>());
    }

    public void addEnrolment(Student student, List<Session> sessions) {
        for (Course c : course.getPrereqs()) {
            if (student.getGrade(c) == null || !student.getGrade(c).passed()) {
                System.out.println("Student has not passed " + c.getCourseCode());
                return;
            }
        }
        System.out.println("Enrolling student into " + course.getCourseCode());
        this.enrolments.add(student);
        this.sessions.addAll(sessions);
    }

    public void removeEnrolment(Student student) {
        this.enrolments.removeIf(s -> Objects.equals(s.getZID(), student.getZID()));
    }

    public void addSession(Session session) {
        this.sessions.add(session);
    }

    public void removeSession(Session session) {
        this.sessions.removeIf(s -> Objects.equals(s.getID(), session.getID()));
    }

    public String getTerm() {
        return this.term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Course getCourse() {
        return this.course;
    }
}
