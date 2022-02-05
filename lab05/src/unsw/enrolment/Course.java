package unsw.enrolment;

import java.util.ArrayList;
import java.util.List;

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
    private List<CourseOffering> courseOfferings;


    public Course(String courseCode, String title) {
        this.courseCode = courseCode;
        this.prereqs = new ArrayList<Course>();
        this.courseOfferings = new ArrayList<CourseOffering>();
        this.title = title;
    }


    public void addPrereq(Course course) {
        this.prereqs.add(course);
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public int getUOC() {
        return this.uoc;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean satisfiesPrerequisites(Student student) {
        for (Course prereq : this.prereqs) {
            if (!student.hasPassed(prereq))
                return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Course course = (Course) obj;
        if (courseCode.equals(course.courseCode))
            return true;
        else
            return false;
    }

    public void addOffering(CourseOffering courseOffering) {
        this.courseOfferings.add(courseOffering);
    }
}
