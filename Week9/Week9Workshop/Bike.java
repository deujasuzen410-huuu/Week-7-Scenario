package Week9.Week9Workshop;


/**
 * Write a description of class Bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bike extends Vehicle
{
    private int engineCapacity;
    public Bike(int vehicleId,String brand, double basePrice,int engineCapacity)
    {
        super(vehicleId,brand,basePrice);
        this.engineCapacity = engineCapacity;
    }
    
    public void displayBikeDetails()
    {
         System.out.println("Bike ID :"+super.vehicleId);
        System.out.println("Bike brand Name :"+super.brand);
        System.out.println("Bike base price :"+super.basePrice);
        System.out.println("Engine Capacity :"+this.engineCapacity+"%");
    }
    double calculateFinalPrice(){
    double FinalPrice = basePrice + CalculateTax();
    return FinalPrice;
    }
    
}