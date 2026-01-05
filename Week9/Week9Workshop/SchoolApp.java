package Week9.Week9Workshop;


/**
 * Write a description of class SchoolApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SchoolApp
{
    public static void main(String[] args) {
        Teacher t1 = new Teacher(1, "Ram", 30000, "Math", 5000);
        System.out.println("Teacher Annual Salary: " +t1.calculateAnnualSalary());

        Staff s1 = new Staff(2, "Shyam", 160, 200);
        System.out.println("Staff Salary: " +s1.calculateSalary());

        System.out.println("College Name: " +Person.collegeName);
    }
}