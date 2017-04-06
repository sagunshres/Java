package roshamboapp;

import java.util.Random;

/**
 * This class Bart extends Player class
 * and implements abstract method generateRoshambo()
 * The method returns string value to the calling function
 * @author Sagun
 */
public class Bart extends Player
{
    public String generateRoshambo()
    {
        return RoshamboApp.Roshambo.ROCK.toString();
    }
    
    public Bart(String name)
    {
        super(name); //abstract class Player constructor
    }
}
