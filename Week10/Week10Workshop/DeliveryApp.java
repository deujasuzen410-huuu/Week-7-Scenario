package Week10.Week10Workshop;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp
{
    public static void main(String[] args){
        BikeDelivery b1 = new BikeDelivery(101, "John Doe", 8000);
        System.out.println(b1.toString());
        System.out.println("Salary: "+b1.calculatePayment());
        
        CarDelivery c1 = new CarDelivery(201, "Jane Doe", 10000);
        System.out.println(c1.toString());
        System.out.println("Salary: "+c1.calculatePayment());
        
    }
}