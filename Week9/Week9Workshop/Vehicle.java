package Week9.Week9Workshop;


/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
    protected int vehicleId;
    protected String brand;
    protected double basePrice;
    
    public Vehicle(int vehicleId,String brand ,double basePrice)
    {
        this.vehicleId=vehicleId;
        this.brand = brand;
        this.basePrice = basePrice;
    }
     double CalculateTax()
    {
       double Tax = basePrice*0.1;
       return Tax;
    }
}