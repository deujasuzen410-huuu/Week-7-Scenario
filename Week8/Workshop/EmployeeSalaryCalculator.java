package Week8.Workshop;


/**
 * Write a description of class EmployeeSalaryCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeSalaryCalculator
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee(20000.0);
         System.out.println("Basic Salary: "+e1.BasicSalary());
        System.out.println("Gross Salary:"+e1.GrossSalary());
    }
}