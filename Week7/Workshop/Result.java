package Week7.Workshop;


/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Result
{
    int subject1;
    int subject2;
    int subject3;
    
    public Result(int sub1,int sub2,int sub3){
    this.subject1 = sub1;
    this.subject2 = sub2;
    this.subject3 = sub3;
    }
    public void total(){
    int TotalMarks = subject1 + subject2 + subject3;
    double percentage = TotalMarks/3;
    
    System.out.println("Total Marks: "+TotalMarks);
    System.out.println("Percentage: "+percentage+"%");
    System.out.println();
    }
}