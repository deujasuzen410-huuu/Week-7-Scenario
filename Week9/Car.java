package Week9;


/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    private int doors;
    
    public Car(String brandNme, int maxSpeed, int doors)
    {
        super(brandNme,maxSpeed);
        this.doors = doors;
    }
    
    public void displayCarDetails()
    {
        System.out.println("Car brand Name :"+super.brandName);
        System.out.println("Car brand Name :"+super.maxSpeed);
        System.out.println("No of doors :"+this.doors);
    }
}