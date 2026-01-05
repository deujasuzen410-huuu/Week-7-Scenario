package Week9.Week9Workshop;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;
    
    public BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    void deposit (double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Deposit Amount: "+amount);
        }
    }
    
    double getBalance(){
        return balance;
    }
}