package Week10;


/**
 * Write a description of class OfflineCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OfflineCourse extends Course
{
    private double LabFees;
    
    public OfflineCourse(int courseId, String courseName,double baseFee,double LabFee)
    {
        super(courseId,courseName,baseFee);
        this.LabFees = LabFee;
    }
    
    @Override
    public double calculateFee()
    {
        return super.getBaseFee()+LabFees;
    }
}