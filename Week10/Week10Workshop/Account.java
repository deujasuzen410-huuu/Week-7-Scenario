package Week10.Week10Workshop;


/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account
{
    private int AccountNo;
    private String holderName;
    private double balance;
    public Account(int AccountNo,String holderName,double balance){
        this.AccountNo = AccountNo;
        this.holderName = holderName;
        this.balance = balance;
    }
    public void setAccountNo(int newAccountNo)
    {
        this.AccountNo = newAccountNo;
    }
    public int getAccountNo()
    {
        return this.AccountNo;
    }
    public void setHolderName(String newholderName)
    {
        this.holderName = newholderName;
    }
    public String getHolderName()
    {
        return this.holderName;
    }
    public void setBalance(double newBalance)
    {
        this.balance = newBalance;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public double calculateInterest(){
        return (this.getBalance()*2.0)/100;
    }
    @Override
    public String toString()
    {
        return "Person Details---->Account No:"+getAccountNo()+"Name:"+getHolderName()+"Marks:"+getBalance();
    }
}