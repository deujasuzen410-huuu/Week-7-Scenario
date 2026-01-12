package Week10.Week10Workshop;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends Account
{
    public CurrentAccount(int accountNo, String holderName, double balance){
        super(accountNo, holderName, balance);
    }
    
    @Override
    public double calculateInterest(){
        return (this.getBalance()*5.0)/100;
    }
    public double calculateInterest(double rate){
        return ((this.getBalance()*this.calculateInterest()*rate)/100);
    }
    @Override
    public String toString(){
        return (super.toString());
    }
}