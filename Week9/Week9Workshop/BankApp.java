package Week9.Week9Workshop;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp
{
    public static void main(String[] args){
        SavingAccount  sa = new SavingAccount(101, "John", 50000, 5);
        CurrentAccount ca = new CurrentAccount(201, "Jane", 40000, 10000);
        
        sa.deposit(5000);
        System.out.println("Balance: "+sa.getBalance());
        System.out.println("Interest: "+sa.calculateInterest());
        
        ca.deposit(4000);
        ca.withdraw(35000);
        System.out.println("Balance: "+ca.getBalance());
        
    }
}