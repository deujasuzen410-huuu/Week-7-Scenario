package Week10.Week10Workshop;


/**
 * Write a description of class BikeDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BikeDelivery extends DeliveryPartner
{
    public BikeDelivery(int partnerid,String name,double basePay){
        super(partnerid,name,basePay);
    }
    @Override
    public double calculatePayment(){
        return super.calculatePayment()+200;
    }
    public double calculatePayment(int extraOrders){
        return this.calculatePayment()+(extraOrders+200);
    }
    @Override
    public String toString()
    {
        return "Person Details---->Delivery Partner ID:"+getPartnerId()+"Person Name:"+getName()+"Base Pay:"+getBasePay();
    }
    
    
}