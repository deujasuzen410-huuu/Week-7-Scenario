package Week7.Workshop.Week7_Scenario;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    public class BankAccount
{
    int accNo;
    String holderName;
    double balance;
    
    public BankAccount(int accNo, String hName, int balance){
    this.accNo = accNo;
    this.holderName = hName;
    this.balance = balance;
    }
    public void deposit(double amt){
        if(amt > 0){
        balance = balance + amt;
        }
        
    }
    public void withdraw(double amt){
        if (amt > 0 && amt <= balance){
        balance = balance - amt;
        }
        else{
        System.out.println("Insufficient Balance in "+holderName+" Account");
        }
        
    }
    public void display(){
    System.out.println("Account Holder: "+holderName);
    System.out.println("Account Number: "+accNo);
    System.out.println("Final Balance: "+balance);
    System.out.println();
    }
}
