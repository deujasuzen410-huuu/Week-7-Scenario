package Week8.Workshop;


/**
 * Write a description of class BankAccountSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccountMain
{
    public static void main(String[] args){
    BankAccount b1 = new BankAccount(101, 40000, "Sujen");
    b1.deposit(3000);
    boolean success = b1.withdraw(2000);
    if(success){
    System.out.println("Withdrawl successful");
    }
    else{
    System.out.println("withdrawl failed");
    }
    b1.display();
    }
}