package Week7;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.collegeId = "np014sp10";
        s1.name = "Sujen";
        s1.age = 22;
        s1.study();
        
        System.out.println(s1.collegeId);
        System.out.println(s1.name);
        System.out.println(s1.age);
        
        Student s2 = new Student();
        s2.collegeId = "np67sp67";
        s2.name = "Sasson";
        s2.age = 18;
        s2.laugh();
        
        System.out.println(s2.collegeId);
        System.out.println(s2.name);
        System.out.println(s2.age);
        
        Car c1 = new Car();
        c1.color = "blue";
        c1.model = "Model7";
        c1.price = 100000;
        c1.brand = "Tesla";
        
        System.out.println(c1.color);
        System.out.println(c1.model);
        System.out.println(c1.price);
        System.out.println(c1.brand);
        c1.drive();
        c1.breaking();
        
        
    }
}