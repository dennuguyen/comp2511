package unsw.enrolment.test;

import java.time.DayOfWeek;
import java.time.LocalTime;

import unsw.enrolment.Course;
import unsw.enrolment.CourseOffering;
import unsw.enrolment.Enrolment;
import unsw.enrolment.Grade;
import unsw.enrolment.Grades;
import unsw.enrolment.Lecture;
import unsw.enrolment.Student;
import unsw.enrolment.Tutorial;

public class EnrolmentTest {

    public static void main(String[] args) {

        // Create courses
        Course comp1511 = new Course("COMP1511", "Programming Fundamentals");
        Course comp1531 = new Course("COMP1531", "Software Engineering Fundamentals");
        comp1531.addPrereq(comp1511);
        Course comp2521 = new Course("COMP2521", "Data Structures and Algorithms");
        comp2521.addPrereq(comp1511);

        CourseOffering comp1511Offering = new CourseOffering(comp1511, "19T1");
        CourseOffering comp1531Offering = new CourseOffering(comp1531, "19T1");
        CourseOffering comp2521Offering = new CourseOffering(comp2521, "19T2");

        // Create some sessions for the courses
        Lecture lecture1511 = new Lecture(comp1511Offering, "Rex Vowels", DayOfWeek.TUESDAY,
                LocalTime.of(12, 0), LocalTime.of(14, 0), "Andrew Taylor");
        Lecture lecture1531 = new Lecture(comp1531Offering, "CLB 5", DayOfWeek.MONDAY,
                LocalTime.of(9, 0), LocalTime.of(11, 0), "Aarthi Natarajan");
        Lecture lecture2521 = new Lecture(comp2521Offering, "Clancy Auditorium", DayOfWeek.FRIDAY,
                LocalTime.of(15, 0), LocalTime.of(17, 0), "Ashesh Mahidadia");

        Tutorial tute1531 = new Tutorial(comp1531Offering, "Quad 1041", DayOfWeek.WEDNESDAY,
                LocalTime.of(18, 0), LocalTime.of(19, 0), "Hugh Chan");

        // Create a student
        Student student = new Student("z5555555");

        // Enrol the student in COMP1511 for T1 (this should succeed)
        Enrolment comp1511Enrolment = comp1511Offering.enrol(student, lecture1511);

        if (comp1511Enrolment != null)
            System.out.println("Enrolled in COMP1511");

        // Enrol the student in COMP1531 for T1 (this should fail as they
        // have not met the prereq)
        Enrolment comp1531Enrolment = comp1531Offering.enrol(student, lecture1531, tute1531);

        if (comp1531Enrolment == null)
            System.out.println("Can't enrol in COMP1531");

        ////////////////////////////////////////////////////////////////////////

        // Assign marks for COMP1511
        Grades comp1511Grades = new Grades("comp1511", false, comp1511Enrolment.getLog());
        comp1511Enrolment.referenceGrade(comp1511Grades);

        // Give the student a passing mark for assignment 1
        Grade assignment1 = new Grade("assignment1", comp1511Enrolment.getLog());
        assignment1.setMark(10);

        // Assignment 2 has milestones 1 and 2
        // Give the student an assignment 2 mark which is the average of
        // milestone 1 and 2
        Grades assignment2 = new Grades("assignment2", true, comp1511Enrolment.getLog());
        Grade milestone1 = new Grade("milestone1", comp1511Enrolment.getLog());
        Grade milestone2 = new Grade("milestone2", comp1511Enrolment.getLog());
        assignment2.add(milestone1);
        assignment2.add(milestone2);

        // Give the student a passing mark for milestone 1 of assignment 2
        // Give the student a passing mark for milestone 2 of assignment 2
        milestone1.setMark(30);
        milestone2.setMark(30);
        assignment2.updateMark();

        // Give the student a prac mark which is the sum of assignment 1
        // and 2
        Grades pracMark = new Grades("pracMark", false, comp1511Enrolment.getLog());
        pracMark.add(assignment1);
        pracMark.add(assignment2);
        pracMark.updateMark();

        // Give the student a passing exam mark.
        Grade examMark = new Grade("exam", comp1511Enrolment.getLog());
        examMark.setMark(10);

        // Reference assessments to COMP1511
        comp1511Grades.add(pracMark);
        comp1511Grades.add(examMark);
        comp1511Grades.updateMark();

        // Debugging info
        if (comp1511Enrolment.hasPassed())
            System.out.println("Passed COMP1511: " + comp1511Grades.getMark());
        else
            System.out.println("Failed COMP1511: " + comp1511Grades.getMark());

        ////////////////////////////////////////////////////////////////////////

        // Enrol the student in 2521 (this should succeed as they have met
        // the prereqs)
        Enrolment comp2521Enrolment = comp2521Offering.enrol(student, lecture2521);

        if (comp2521Enrolment != null)
            System.out.println("Enrolled in COMP2521");
    }
}
