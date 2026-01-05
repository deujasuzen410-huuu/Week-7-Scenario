package Week9.Week9Workshop;


/**
 * Write a description of class SavingsAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingAccount extends BankAccount
{
    private double InterestRate;
    
    public SavingAccount(int accountNumber, String accountHolderName, double balance, double InterestRate){
        super(accountNumber, accountHolderName, balance);
        this.InterestRate = InterestRate;
    }
    
    double calculateInterest(){
        double interest = super.getBalance() * (InterestRate / 100);
        return interest;
    }
    
}