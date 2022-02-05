package unsw.enrolment;

public class Grade {

    private String grade;
    private String courseCode;

    public Grade(String grade, String courseCode) {
        this.grade = grade;
        this.courseCode = courseCode;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Boolean passed() {
        return this.grade != "FL";
    }
}
