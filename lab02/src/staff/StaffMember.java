package staff;

import java.time.LocalDate;
import java.util.Objects;

public class StaffMember {
    /**
     * StaffMember class.
     * 
     * @param name   Name of staff member
     * @param salary Salary of staff member
     * @param start  Hire date of staff member
     * @param end    End date of staff member
     */

    private String name;
    private Double salary;
    private LocalDate start;
    private LocalDate end;

    /**
     * StaffMember constructor.
     * 
     * @param name   Name of staff member
     * @param salary Salary of staff member
     * @param start  Hire date of staff member
     * @param end    End date of staff member
     */
    public StaffMember(String name, Double salary, LocalDate start, LocalDate end) {
        this.name = name;
        this.salary = salary;
        this.start = start;
        this.end = end;
    }

    /**
     * Gets the StaffMember name.
     * 
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the StaffMember salary.
     * 
     * @return salary
     */
    public Double getSalary() {
        return this.salary;
    }

    /**
     * Gets the StaffMember hire date.
     * 
     * @return start
     */
    public LocalDate getHireDate() {
        return this.start;
    }

    /**
     * Gets the StaffMember end date.
     * 
     * @return end
     */
    public LocalDate getEndDate() {
        return this.end;
    }

    /**
     * Sets the StaffMember name.
     * 
     * @param name Name of staff member
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the StaffMember salary.
     * 
     * @param salary Salary of staff member
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * Sets the StaffMember hire date.
     * 
     * @param start Hire date of staff member
     */
    public void setHireDate(LocalDate start) {
        this.start = start;
    }

    /**
     * Sets the StaffMember end date.
     * 
     * @param end End date of staff member
     */
    public void setEndDate(LocalDate end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return this.getClass().toString() + ", Name: '" + this.name + "', Salary: '" + this.salary
                + "', Hire Date: '" + this.start + "', End Date: '" + this.end + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        StaffMember that = (StaffMember) obj;

        return Objects.equals(this.name, that.name) && Objects.equals(this.salary, that.salary)
                && Objects.equals(this.start, that.start) && Objects.equals(this.end, that.end);
    }
}
