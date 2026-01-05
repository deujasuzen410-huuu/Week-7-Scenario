package Week8.Workshop;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // attributes
    private String name;
    private int id;
    private String address;
    private long phoneNumber;
    private static String collegeName;
    
    //constructors
    
    public Student(String name,int id,String address,long phoneNumber,String collegeName){
    this.name = name;
    this.id = id;
    this.address = address;
    this.phoneNumber = phoneNumber;
    Student.collegeName = collegeName;
    }
    
    //setters and getters method
    
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setId()
    {
        this.id = id;
    }
    public int getId()
    {
        return this.id;
    }
    public void setAddress()
    {
        this.address = address;
    }
    public String getAddress()
    {
        return this.address;
    }
    public void setPhoneNum()
    {
        this.phoneNumber = phoneNumber;
    }
    public long getPhoneNum()
    {
        return this.phoneNumber;
    }
    public static String CollegeName(String collegeName)
    {
    return collegeName;
}
    
    public void DisplayInfo()
    {
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("Address:"+address);
        System.out.println("Phone Number"+phoneNumber);
        System.out.println("College Name:"+collegeName);
    }
}