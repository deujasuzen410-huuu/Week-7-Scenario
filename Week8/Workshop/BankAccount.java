package Week8.Workshop;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private int accno;
    private double balance;
    private String name;
    
    public BankAccount(int accno, double balance, String name){
        this.accno = accno;
        this.balance = balance;
        this.name = name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    
    public void deposit(double amt){
        if(amt > 0){
        balance = balance + amt;
        }
        
    }
    public boolean withdraw(double amt){
        if (amt > 0 && amt <= balance){
        balance = balance - amt;
        return true;
        }
        else{
        return false;
        }
        }
    public void display(){
        System.out.println("Account Number: "+this.accno);
        System.out.println("Final Balance: "+balance);
    }
    }