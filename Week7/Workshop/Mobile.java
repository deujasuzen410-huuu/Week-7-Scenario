package Week7.Workshop;


/**
 * Write a description of class Mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mobile
{
    String brand;
    int price;
    
    public void isAffordable(){
    if(price<20000){
    System.out.println("Brand: "+brand);
    System.out.println("Price: "+price);
    System.out.println("(Affordable)");
}
else{
    System.out.println("(not Affordable)");
}
    }
}