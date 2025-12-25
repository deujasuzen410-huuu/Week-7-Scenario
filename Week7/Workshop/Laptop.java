package Week7.Workshop;


/**
 * Write a description of class Laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Laptop
{
    String brand;
    int RAM;
    int price;
    
    public Laptop(String brand,int RAM,int price){
    this.brand = brand;
    this.RAM = RAM;
    this.price = price;
    }
    public void display(){
        if(RAM > 8){
    System.out.println("Brand: "+brand);
    System.out.println("RAM: "+RAM+"GB");
    System.out.println("Price: "+price);}
    }
    
}