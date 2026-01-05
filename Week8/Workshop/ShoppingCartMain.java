package Week8.Workshop;


/**
 * Write a description of class ShoppingCartMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCartMain
{
    public static void main(String[] args){
        ShoppingCart s1 = new ShoppingCart("Laptop", 60000, 2);
        s1.display();
        System.out.println("Discounted Price: "+s1.calculateDiscountedTotal(10));
    }
}