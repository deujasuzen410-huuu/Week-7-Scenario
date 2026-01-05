package Week9.Week9Workshop;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employees
{
    protected int employeeId;
    protected String Name;
    protected double basicSalary;
    
    public Employees(int employeeId, String Name, double basicSalary){
        this.employeeId = employeeId;
        this.Name = Name;
        this.basicSalary = basicSalary;
    }
    
    double calculateBonus(){
        double bonus = 0.1 * basicSalary;
        return bonus;
    }
    
    void displayEmployee(){
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Name: "+Name);
        System.out.println("Base Salary: "+basicSalary);
        
    }
}