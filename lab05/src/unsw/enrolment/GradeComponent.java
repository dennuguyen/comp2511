package unsw.enrolment;

public interface GradeComponent {
    public String getAssessment();

    public int getMark();

    public void setMark(int mark);

    public boolean isPassing();
}
