package Week10.Week10Workshop;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int rollno;
    private String name;
    private double marks;
    
    public Student(int rollno,String name,double marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
    public void setRollNo(int newRollno)
    {
        this.rollno = newRollno;
    }
    
    public int getRollNo()
    {
        return this.rollno;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public String getName()
    {
        return this.name;
    }
    public void setMarks(double newMarks)
    {
        this.marks = newMarks;
    }
    
    public double getMarks()
    {
        return this.marks;
    }
    public String calculateResult(){
        if(marks<40){
        return "FAIL";}
        else{
            return"PASS";
        }
        
    }
    @Override
    public String toString()
    {
        return "Person Details---->Roll no:"+getRollNo()+"Name:"+getName()+"Marks:"+getMarks();
    }
}