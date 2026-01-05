package Week8.Workshop;


/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart
{
    private String itemName;
    private double itemPrice;
    private int quantity;
    double totalPrice;
    double discountPrice;
    public ShoppingCart(String itemName, double itemPrice, int quantity){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }
    public void setQuantity(int quantity){
        this.quantity  = quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public double calculateTotal(){
        totalPrice = quantity * itemPrice;
        return totalPrice;
    }
    public double calculateDiscountedTotal(double discountPercent){
        discountPrice = totalPrice - ((totalPrice) * (discountPercent/100));
        return discountPrice;
    }
    public void display(){
        System.out.println("Item Name: "+this.itemName);
        System.out.println("Item Price: "+this.itemPrice);
        System.out.println("Quantity: "+this.quantity);
        System.out.println("Total: "+calculateTotal());
        
    }
}