package roshamboapp;

import java.util.Random;

/**
 * This class Lisa extends Player class
 * It implements generateRoshambo() method which
 * which assigns Roshambo enum values to an array
 * A random number generator is used to pick a random
 * element of the array and returned to the calling function.
 * 
 * Lisa class also implements constructor with one parameter
 * @param name String value to be assigned to super class data member
 * @see Player
 * 
 * @author Sagun
 */
public class Lisa extends Player
{
    public String generateRoshambo()
    {
        RoshamboApp.Roshambo[] rvalues = RoshamboApp.Roshambo.values(); //assigns enum values to an array of rvalues
        Random random = new Random();
        int index = random.nextInt(rvalues.length); //random index is generated according to the length of array
        return rvalues[index].toString(); //array content returned
    }
    
    public Lisa(String name)
    {
        super(name); //calling constructor of abstract class Player
    }
}
