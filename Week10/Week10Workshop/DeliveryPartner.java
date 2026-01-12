package Week10.Week10Workshop;


/**
 * Write a description of class DeliveryPartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryPartner
{
    private int partnerid;
    private String name;
    private double basePay;
    public DeliveryPartner(int partnerid,String name,double basePay){
    this.partnerid = partnerid;
    this.name = name;
    this.basePay = basePay;
    }
    public void setPartnerId(int newId)
    {
        this.partnerid = newId;
    }
    
    public int getPartnerId()
    {
        return this.partnerid;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public String getName()
    {
        return this.name;
    }
    public void setBasePay(double newbasePay)
    {
        this.basePay = newbasePay;
    }
    
    public double getBasePay()
    {
        return this.basePay;
    }
    public double calculatePayment(){
    double basePay = 2000;
    return basePay;
}
@Override
    public String toString()
    {
        return "Person Details---->Delivery Partner ID:"+getPartnerId()+"Person Name:"+getName()+"Base Pay:"+getBasePay();
    }
}