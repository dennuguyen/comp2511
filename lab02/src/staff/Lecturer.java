package staff;

import java.time.LocalDate;
import java.util.Objects;

public class Lecturer extends StaffMember {
    /**
     * Lecturer class.
     * 
     * @param school Name of school
     * @param status Academic status
     */

    private String school;
    private Character status;

    /**
     * Lecturer constructor without Lecturer arguments.
     * 
     * @param name   Name of lecturer
     * @param salary Salary of lecturer
     * @param start  Hire date of lecturer
     * @param end    End date of lecturer
     */
    public Lecturer(String name, Double salary, LocalDate start, LocalDate end) {
        super(name, salary, start, end);
    }

    /**
     * Complete Lecturer constructor.
     * 
     * @param name   Name of lecturer
     * @param salary Salary of lecturer
     * @param start  Hire date of lecturer
     * @param end    End date of lecturer
     * @param school School of lecturer
     * @param status Academic status of lecturer
     */
    public Lecturer(String name, Double salary, LocalDate start, LocalDate end, String school,
            Character status) {
        super(name, salary, start, end);
        this.school = school;
        this.status = status;
    }

    /**
     * Gets the Lecturer's school.
     * 
     * @return school
     */
    public String getSchool() {
        return this.school;
    }

    /**
     * Gets the Lecturer's status.
     * 
     * @return status
     */
    public Character getStatus() {
        return this.status;
    }

    /**
     * Sets the Lecturer's school.
     * 
     * @param school School of lecturer
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Sets the Lecturer's status.
     * 
     * @param status Academic status of lecturer.
     */
    public void setStatus(Character status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        Lecturer that = (Lecturer) obj;

        return super.equals(obj) && Objects.equals(this.school, that.school)
                && Objects.equals(this.status, that.status);
    }

    @Override
    public String toString() {
        return super.toString() + ", School: '" + this.school + "', Status: '" + this.status + "'";
    }
}
