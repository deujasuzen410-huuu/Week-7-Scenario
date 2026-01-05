package Week9.Week9Workshop;


/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    private int numberOfDoors;
    private String FuelType;
    public Car(int vehicleId,String brand, double basePrice,int numberOfDoors,String FuelType)
    {
        super(vehicleId,brand,basePrice);
        this.numberOfDoors = numberOfDoors;
        this.FuelType = FuelType;
    }
    
    public void displayCarDetails()
    {
         System.out.println("Car ID :"+super.vehicleId);
        System.out.println("Car brand Name :"+super.brand);
        System.out.println("Car base price :"+super.basePrice);
        System.out.println("No of doors :"+this.numberOfDoors);
        System.out.println("Fuel Type :"+this.FuelType);
    }
    double calculateFinalPrice(){
        double Luxury = basePrice*0.05;
    double FinalPrice = basePrice + CalculateTax() + Luxury;
    return FinalPrice;
    }
}