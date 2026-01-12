package Week10.Week10Workshop;


/**
 * Write a description of class ExamApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExamApp
{
    public static void main(String[] args){
        ScienceStudent sc1 = new ScienceStudent(12, "Sita", 100);
        System.out.println(sc1.toString());
        System.out.println("Result: "+sc1.calculateResult());
        
        ManagementStudent m1 = new ManagementStudent(10, "Ram", 20);
        System.out.println(m1.toString());
        System.out.println("Result: "+m1.calculateResult(10));

    }
}