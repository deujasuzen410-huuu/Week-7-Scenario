package Week7.Workshop;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
    Book b1 = new Book();
    b1.title = "Quran";
    b1.author = "Allah";
    b1.price = 2000;
    
     Book b2 = new Book();
    b2.title = "The Bible";
    b2.author = "Jesus";
    b2.price = 1500;
    
    System.out.println(b1.title);
    System.out.println(b1.author);
    System.out.println(b1.price);
    System.out.println(b2.title);
    System.out.println(b2.author);
    System.out.println(b2.price);
    
    Rectangle r1 = new Rectangle();
    r1.length = 10;
    r1.breadth = 20;
    System.out.println("Length = " +r1.length);
    System.out.println("Breadth = " +r1.breadth);
    System.out.println("Area of Rectangle = "+(r1.length*r1.breadth));
    
    Rectangle r2 = new Rectangle();
    r2.length = 20;
    r2.breadth = 30;
    System.out.println("Length = " +r2.length);
    System.out.println("Breadth = " +r2.breadth);
    System.out.println("Area of Rectangle = "+(r2.length*r2.breadth));
    
    Employee e1 = new Employee();
    e1.id = 11;
    e1.name = "Ram";
    e1.salary = 20000;
    System.out.println("Employee ID: "+e1.id);
    System.out.println("Name: "+e1.name);
    System.out.println("Salary: "+e1.salary);
    
    Employee e2 = new Employee();
    e2.id = 12;
    e2.name = "Sita";
    e2.salary = 30000;
    System.out.println("Employee ID: "+e2.id);
    System.out.println("Name: "+e2.name);
    System.out.println("Salary: "+e2.salary);
    
    Employee e3 = new Employee();
    e3.id = 13;
    e3.name = "Hari";
    e3.salary = 400000;
    System.out.println("Employee ID: "+e3.id);
    System.out.println("Name: "+e3.name);
    System.out.println("Salary: "+e3.salary);
    
    if(e1.salary>e2.salary && e1.salary>e2.salary){
        System.out.println("Highest Salary: "+e1.salary);}
        else if(e2.salary>e1.salary && e2.salary>e3.salary){
            System.out.println("Highest Salary: "+e2.salary);
        }
        else{
        System.out.println("Highest Salary: "+e3.salary);}
    
    
    Laptop l1 = new Laptop("MacBook",8,70000);
    Laptop l2 = new Laptop("ASUS",16,120000);
    Laptop l3 = new Laptop("Lenovo",4,35000);
    l1.display();
    l2.display();
    l3.display();
    
    Mobile m1 = new Mobile();
    m1.brand = "iPhone";
    m1.price = 120000;
    System.out.println("Brand: "+m1.brand);
    System.out.println("Price: "+m1.price);
    m1.isAffordable();
    
    Mobile m2 = new Mobile();
    m2.brand = "Samsung";
    m2.price = 70000;
    System.out.println("Brand: "+m2.brand);
    System.out.println("Price: "+m2.price);
    m2.isAffordable();
    
    Mobile m3 = new Mobile();
    m3.brand = "Xiaomi";
    m3.price = 19000;
    System.out.println("Brand: "+m2.brand);
    System.out.println("Price: "+m2.price);
    m3.isAffordable();
    
    Result R1 = new Result(70,60,50);
    Result R2 = new Result(80,90,50);
    R1.total();
    R2.total();
    
    
    }
}
