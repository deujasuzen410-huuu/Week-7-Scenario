package Week10.Week10Workshop;


/**
 * Write a description of class Doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor extends Person
{
    private String specialization;
    private int consultationFee;
    public Doctor(int id,String name,String specialization,int consultationFee){
    super(id,name);
    this.specialization = specialization;
    this.consultationFee = consultationFee;
    }
    @Override
    public double calculateSalary()
    {
        return super.calculateSalary() + consultationFee;
    }
    public double calculateSalary(int emergencyCases)
    {
        return this.calculateSalary() + consultationFee + emergencyCases;
    }
    @Override
    public String toString()
    {
        return super.toString()+"Specialization:"+specialization+"Consultation Fees:"+consultationFee;
    }
}