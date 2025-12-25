package Week8;


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
        Calculator calc = new Calculator();
        
        //invoking a method or method invocation
        
        calc.displayInfo();
        calc.add(2,4); //actual parameters
        calc.add(3,7);
        calc.add(5,6);
        calc.add(6,4);
        
        int fixNum = calc.getFixedNumber();
        System.out.println("The fix number is:"+(fixNum));
        int multi = calc.multiply(10,20);
        int multi1 = calc.multiply(30,40);
        
        System.out.println("The multiplication of first two numbers are: "+multi);
        Calculator.square(10);
    }
}