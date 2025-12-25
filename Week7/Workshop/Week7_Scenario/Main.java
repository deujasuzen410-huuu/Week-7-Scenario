package Week7.Workshop.Week7_Scenario;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    
    public static void main(String[] args){
    BankAccount acc1 = new BankAccount(1, "Lebron", 200000);
    BankAccount acc2 = new BankAccount(2, "James", 700000);
    
    acc1.deposit(3000);
    acc1.withdraw(5000);
    
    acc2.deposit(6000);
    acc2.withdraw(6700);
    
    acc1.display();
    acc2.display();
    }
}