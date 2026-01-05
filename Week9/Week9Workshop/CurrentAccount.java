package Week9.Week9Workshop;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends BankAccount
{
    private double overdraftLimit;
    
    public CurrentAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit){
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }
    
    boolean withdraw(double amount){
        if (amount <= balance + overdraftLimit){
            balance = balance - amount;
            System.out.println("Withdrawn Amount: "+amount);
            return true;
        }
        else{
            System.out.println("Withdrawl failed");
            return false;
        }
    }
}