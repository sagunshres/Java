package roshamboapp;
import java.util.Scanner;

/**
 * This class Player1 extends Player class
 * It implements generateRoshambo() method which
 * which accepts input from user and returns
 * string value to the calling function
 * 
 * Player1 class also implements constructor with one parameter
 * @param name String value to be assigned to super class data member
 * @see Player
 * 
 * @author Sagun
 */
public class Player1 extends Player {
    Scanner sc = new Scanner(System.in);
    public String generateRoshambo()
    {
        String response = null;
        do
        {
        while(response == null){
            System.out.println("Would you like to enter ROCK, SCISSORS, PAPER? (R/S/P)");
            response = sc.next();
        
            if (response.equalsIgnoreCase("r") || response.equalsIgnoreCase("rock"))
                response = "ROCK";
            else if (response.equalsIgnoreCase("s") || response.equalsIgnoreCase("scissors"))
                response = "SCISSORS";
            else if (response.equalsIgnoreCase("p") || response.equalsIgnoreCase("paper"))
                response = "PAPER";
            else
            {
                System.out.println("Invalid Input!");
                response = null;
            }
         }
        }while(response == null);
        
        return response;
    }
    
     //public constuctor with one parameter 
     public Player1(String name)
     {
         super(name); //calling abstract class Player constructor
     }
   
}
