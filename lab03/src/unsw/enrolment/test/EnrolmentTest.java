package unsw.enrolment.test;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import unsw.enrolment.*;

public class EnrolmentTest {

    public static void main(String[] args) {
        // Create courses
        Course comp1511 = new Course("COMP1511", "Programming Fundamentals", 6);
        Course comp1531 = new Course("COMP1531", "Software Engineering Fundamentals", 6);
        comp1531.addPrereq(comp1511);

        // Create course offerings
        CourseOffering comp1511Offering = new CourseOffering(comp1511, "19T1");
        CourseOffering comp1531Offering = new CourseOffering(comp1531, "19T1");

        // Create sessions
        Tutorial s0 = new Tutorial(0, "EE120", DayOfWeek.MONDAY, LocalTime.NOON,
                LocalTime.of(13, 0), "John");
        Lecture s1 = new Lecture(1, "CLB7", DayOfWeek.MONDAY, LocalTime.NOON, LocalTime.of(15, 0),
                "Hayden");
        comp1511Offering.addSession(s0);
        comp1531Offering.addSession(s1);

        // Create student
        Student z000 = new Student("z00");

        // Test
        z000.enrol(comp1511Offering, new ArrayList<Session>() {
            {
                add(s0);
            }
        });
        z000.enrol(comp1531Offering, new ArrayList<Session>() {
            {
                add(s1);
            }
        });
        z000.addGrade(new Grade("PS", "COMP1511"));
        z000.enrol(comp1531Offering, new ArrayList<Session>() {
            {
                add(s1);
            }
        });
    }
}
