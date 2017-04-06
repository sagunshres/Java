package roshamboapp;

import java.util.Random;

/**
 * Abstract class Player which contains string name field and
 * enum value called roshamboValue
 * It implements abstract method named generateRoshambo()
 * Constructor Player assigns string value to the private data member name
 * 
 * @param value string value to be assigned to private class data member
 * @param value1 enum value to be assigned to private class data member
 * @param name assigns string value to private data member
 * @author Sagun
 */
public abstract class Player
{
    private String name;
    private RoshamboApp.Roshambo roshamboValue;
    
    public abstract String generateRoshambo();
    
    public String getName()
    {
        return this.name;
    }
    
    public RoshamboApp.Roshambo getRoshambo()
    {
        return this.roshamboValue;
    }
    
    public void setName(String value)
    {
        this.name = value;
    }
    public void setRoshambo(RoshamboApp.Roshambo value1)
    {
        this.roshamboValue = value1;
    }
    
    public Player(String name)
    {
        this.name = name;
    }
    
   }


