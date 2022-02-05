package unsw.enrolment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A course in the enrolment system.
 * 
 * @author Robert Clifton-Everest
 *
 */
public class Course {

    private String courseCode;
    private String title;
    private int uoc;
    private List<Course> prereqs;

    public Course(String courseCode, String title, int uoc, List<Course> prereqs) {
        this.courseCode = courseCode;
        this.title = title;
        this.uoc = uoc;
        this.prereqs = prereqs;
    }

    public Course(String courseCode, String title, int uoc) {
        this(courseCode, title, uoc, new ArrayList<Course>());
    }

    public List<Course> getPrereqs() {
        return this.prereqs;
    }

    public void addPrereq(Course course) {
        prereqs.add(course);
    }

    public void removePrereq(Course course) {
        prereqs.removeIf(c -> Objects.equals(c.courseCode, course.courseCode));
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUOC() {
        return this.uoc;
    }

    public void setUOC(int uoc) {
        this.uoc = uoc;
    }
}
