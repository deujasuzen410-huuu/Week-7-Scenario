package Week10.Week10Workshop;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery extends DeliveryPartner
{
    public CarDelivery(int partnerid,String name,double basePay){
        super(partnerid,name,basePay);
    }
    @Override
    public double calculatePayment(){
        return super.calculatePayment()+5000;
    }
     public double calculatePayment(int extraOrders){
        return this.calculatePayment()+(extraOrders+5000);
    }
    @Override
    public String toString()
    {
        return "Person Details---->Delivery Partner ID:"+getPartnerId()+"Person Name:"+getName()+"Base Pay:"+getBasePay();
    }
}