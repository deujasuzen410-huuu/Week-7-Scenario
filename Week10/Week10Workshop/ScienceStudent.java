package Week10.Week10Workshop;


/**
 * Write a description of class ScienceStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScienceStudent extends Student
{
    public ScienceStudent(int rollno,String name,double marks)
    {
        super(rollno,name,marks);
    }
    @Override
    public String calculateResult(){
    return super.calculateResult();
        } 
    public String calculateResult(int graceMarks){
        if((getMarks()+graceMarks)<40){
        return "FAIL";}
        else{
            return"PASS";
        }
    }
}