package Week10.Week10Workshop;


/**
 * Write a description of class HospitalApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalApp
{
    public static void main(String[] args)
    {
        Doctor d1 = new Doctor(101,"Dr.House","Oncology",700);
        System.out.println("Doctor");
        System.out.println(d1.toString());
        System.out.println("Salary:"+d1.calculateSalary());
        Nurse n1 = new Nurse(201,"Ayusha","Day",2000);
        System.out.println("Nurse");
        System.out.println(n1.toString());
        System.out.println("Salary:"+n1.calculateSalary());
    }
}