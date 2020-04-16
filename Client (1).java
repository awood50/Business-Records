
/**
 * Write a description of class Client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Client
{
    private String lastName;
    private String firstName;
    private String address;
    private int ID;
    private int visits;
    private double balance;
    private Pet [] pets;
    
    public Client ()
    {
        lastName = " ";
        firstName = " ";
        address = " ";
        ID = 0;
        visits = 0;
        balance = 0;
        for (int k = 0; k < pets.length; k++)
        {
            pets[k] = new Pet();
        }
    }
    
    public Client (String inLastName, String inFirstName, String inAddress, int inID, int inVisits, double inBalance, Pet [] inPets)
    {
        lastName = inLastName;
        firstName = inFirstName;
        address = inAddress;
        ID = inID;
        visits = inVisits;
        balance = inBalance;
        pets = inPets;
    }
    
    public Client (Client other)
    {
        this.lastName = other.lastName;
        this.firstName = other.lastName;
        this.address = other.address;
        this.ID = other.ID;
        this.visits = other.visits;
        this.balance = other.balance;
        for (int k = 0; k < pets.length; k++)
        {
            this.pets[k] = other.pets[k];
        }
    }
    
    public int compareTo(Client other){
    return this.lastName.compareTo(other.lastName);   
   
}
    
    public boolean equals(Client other)
    {
        boolean result = false;
        if (this.ID == other.ID)
        {
            result = true;
        }
        return result;
    }
    
    public String toString()
    {
        String result = "Last Name: " + lastName + "\nFirst Name: " + firstName + "\nAddress: " + address + "\nID: " + ID + "\nNumber of Visits: " + visits + "\nOutstanding Balance: " + balance;
        for(int k = 0; k < pets.length; k++)
        {
            result += "\n" + pets[k].toString() + ", ";
        }
        return result;
    }
}
