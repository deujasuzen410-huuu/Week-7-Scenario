package Week9.Week9Workshop;


/**
 * Write a description of class PermanentEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class permanentEmployee extends Employees
{
    private int HRA;
    private int DA;
    
    public permanentEmployee(int employeeId, String Name, double basicSalary, int HRA, int DA){
        super(employeeId, Name, basicSalary);
        this.HRA = HRA;
        this.DA = DA;
    }
    
    double calculateTotalSalary(){
        double total = basicSalary + HRA + DA + calculateBonus();
        return total;
    }
    
}