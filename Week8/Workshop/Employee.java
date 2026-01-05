package Week8.Workshop;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    private double basicSalary;
    private double grossSalary;
    
    public Employee(double basicSalary)
    {
        this.basicSalary = basicSalary;
    }
    public double GrossSalary()
    {
        double bonus = basicSalary*0.20;
        return basicSalary + bonus;
    }
    public double BasicSalary()
    {
        return basicSalary;
    }
   
    
    
}