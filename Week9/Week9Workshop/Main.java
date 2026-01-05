package Week9.Week9Workshop;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        Car c1 = new Car(101,"Tesla",100000.0,4,"Petrol");
        Bike b1 = new Bike(201,"Honda",10000,100);
           System.out.println("Car");
        c1.displayCarDetails();
        System.out.println("Tax:"+c1.CalculateTax());
        System.out.println("Final Price:"+c1.calculateFinalPrice());
           System.out.println("Bike");
        b1.displayBikeDetails();
        System.out.println("Tax:"+b1.CalculateTax());
        System.out.println("Final Price:"+b1.calculateFinalPrice());
    }
    
}