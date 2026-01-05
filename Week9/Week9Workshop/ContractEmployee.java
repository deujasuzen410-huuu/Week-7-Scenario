package Week9.Week9Workshop;


/**
 * Write a description of class ContractEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContractEmployee extends Employees
{
    private int workingDays;
    
    public ContractEmployee(int employeeId, String Name, double basicSalary, int workingDays){
        super(employeeId, Name, basicSalary);
        this.workingDays = workingDays;
    }
    double calculateTotalSalary(){
        double total = basicSalary * workingDays;
        return total;
    }
}