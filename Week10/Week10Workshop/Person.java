package Week10.Week10Workshop;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private int id;
    private String name;
    public Person(int id,String name){
    this.id = id;
    this.name=name;
    }
    public void setId(int newId)
    {
        this.id = newId;
    }
    
    public int getId()
    {
        return this.id;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public double calculateSalary(){
    double baseSalary = 20000;
    return baseSalary;
}
    @Override
    public String toString()
    {
        return "Person Details---->Person ID:"+getId()+"Person Name:"+getName();
    }
    
}