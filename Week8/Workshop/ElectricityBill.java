package Week8.Workshop;


/**
 * Write a description of class ElectricityBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityBill{

    private String consumerName;
    private int unitsConsumed;
    public ElectricityBill(String consumerName, int unitsConsumed) {
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }
    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }
    public int getUnitsConsumed() {
        return unitsConsumed;
    }
    public double calculateBill(double bill) {
        
        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 5;
        } else {
            bill = (100 * 5) + ((unitsConsumed - 100) * 8);
        }
        return bill;
    }
        public void DisplayInfo(){
        System.out.println("Consumer Name: " + "Sujen Deuja");
        System.out.println("Units Consumed: " +unitsConsumed);
        System.out.println("Total Bill: ₹" +calculateBill);
        }
    }
    