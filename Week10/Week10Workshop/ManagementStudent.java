package Week10.Week10Workshop;


/**
 * Write a description of class ManagementStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ManagementStudent extends Student
{
    public ManagementStudent(int rollno,String name,double marks)
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