package staff;

import java.time.LocalDate;

public class StaffTest {
    /**
     * StaffTest class.
     */

    /**
     * Prints the staff details.
     * 
     * @param member Staff member
     */
    public static void printStaffDetails(StaffMember member) {
        System.out.println(member.toString());
    }

    /**
     * main().
     */
    public static void main(String[] args) {
        StaffMember john =
                new StaffMember("John", 100.00, LocalDate.of(1999, 1, 1), LocalDate.of(1999, 1, 2));
        Lecturer bill = new Lecturer("Bill", 100.00, LocalDate.of(1999, 1, 1),
                LocalDate.of(2020, 1, 1), "School", 'A');

        printStaffDetails(john);
        printStaffDetails(bill);
        System.out.println(john.equals(john));
        System.out.println(john.equals(bill));
        System.out.println(bill.equals(john));
        System.out.println(bill.equals(bill));
    }
}
