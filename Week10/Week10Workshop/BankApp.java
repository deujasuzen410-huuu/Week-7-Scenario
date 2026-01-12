package Week10.Week10Workshop;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp
{
    public static void main(String[] args){
        SavingsAccount s1 = new SavingsAccount(101, "Jane", 50000);
        System.out.println(s1.toString());
        System.out.println("Interest: "+s1.calculateInterest());
        
        CurrentAccount c1 = new CurrentAccount(101, "John", 40000);
        System.out.println(c1.toString());
        System.out.println("Interest: "+c1.calculateInterest());
        
        
    }
}