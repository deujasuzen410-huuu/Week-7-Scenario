package Week9.Week9Workshop;


/**
 * Write a description of class Payroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payroll
{
    public static void main(String[] args){
        permanentEmployee e1 = new permanentEmployee (101, "Harry", 3000, 4000, 2000);
        ContractEmployee ce1 = new ContractEmployee (201, "Kane", 250, 50);
        
        e1.displayEmployee();
        System.out.println("Final Salary: "+e1.calculateTotalSalary());
        
        ce1.displayEmployee();
        System.out.println("Final Salary: "+ce1.calculateTotalSalary());
    }
}