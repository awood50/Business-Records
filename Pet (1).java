
/**
 * Write a description of class Pet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pet
{
    private String name;
    private String type;
    private int weight;
    private String rabiesShot;
    private String lastVisit;
    
    public Pet()
    {
        name = " ";
        type = " ";
        weight = 0;
        rabiesShot = " ";
        lastVisit = " ";
    }
    
    public Pet(String inName, String inType, int inWeight, String inRabiesShot, String inLastVisit)
    {
        name = inName;
        type = inType;
        weight = inWeight;
        rabiesShot = inRabiesShot;
        lastVisit = inLastVisit;
    }
    
    public Pet(Pet other)
    {
        this.name = other.name;
        this.type = other.type;
        this.weight = other.weight;
        this.rabiesShot = other.rabiesShot;
        this.lastVisit = other.lastVisit;
    }
    
    public String toString()
    {
        return "Name: " + name + "\nType of Pet: " + type + "\nWeight: " + weight + "\nDate of Rabies Shot: " + rabiesShot + "\nDate of Last Visit: " + lastVisit;
    }
}
