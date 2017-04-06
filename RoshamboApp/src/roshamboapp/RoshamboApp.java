package roshamboapp;
import java.util.*;
/**
 * This RoshamboApp class contains Roshambo enum and a main method 
 * 
 * @author Sagun
 */
public class RoshamboApp {
/**
 * simple enum with values ROCK, PAPER, SCISSORS
 * contains toString() method which returns string value
 * contains compareValue() method which compares two inputs and return 
 * 0 for tie, 1 for user win and -1 for computer wins.
 * @param userValue first parameter to be compared to the second parameter
 * @param computerValue second parameter to be compared against first parameter
 */  
public enum Roshambo {
    ROCK,
    PAPER,
    SCISSORS;
    
    public String toString() {
        switch(this){
            case ROCK:
                return "ROCK";
            case PAPER:
                return "PAPER";
            case SCISSORS:
                return "SCISSORS";
        }
        return null;
    }
}   
    public static int compareValue(String userValue, String computerValue)
    {
        if (userValue == computerValue)
            return 0; //tie
        //different combination of rock, scissors and paper are matched
        //returns 1 for true and -1 for false condtion check
        switch(userValue) {
            case "ROCK":
                return (computerValue == Roshambo.SCISSORS.toString() ? 1 : -1);
            case "PAPER":
                return (computerValue == Roshambo.ROCK.toString() ? 1 : -1);
            case "SCISSORS":
                return (computerValue == Roshambo.PAPER.toString() ? 1 : -1);
        }
        return 0;
    }
    
    public static void main(String[] args) {
        startGame();
    }      
 /**
  * startGame() method
  * 
  */
    public static void startGame()
    {
        //declare and intialize variables
        int numberOfTies = 0;
        int userWins = 0;
        int computerWins = 0;
        String userResponse, selectPlayer, userValue;
        String computerValue = null;
        String computerUser = null;
        
        //display screen message and take uesr input
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the game of Roshambo:");
        System.out.println("----------------------------------");
        System.out.print("Enter your Name:");
        String inputPlayer = sc.next();
        
        //create p1 instance from Player1 class called constructor with name 
        Player1 p1 = new Player1(inputPlayer);
        System.out.println("Would you like to play Bart or Lisa? (B/L)");
        selectPlayer = sc.next();
        
        //the do looop continues while the user likes to keep playing the game
        //while user keeps on pressing ("y") as response
        do
        {
        userValue = p1.generateRoshambo(); //generate Roshambo value by taking input from user
                                           //defined in generateRoshambo() method
        
          do //this do loop continues as long as the user selects the correct player
              //i.e. lisa, bart,
       {   
        if (selectPlayer.equalsIgnoreCase("b") || selectPlayer.equals("bart"))
        {
            Bart bart = new Bart("Bart"); //creates new instance of bart with Constructor parameter
            computerUser = bart.getName();
            computerValue = bart.generateRoshambo(); //generate Roshambo value(paper, scissor, rock) and assign as computerValue
        }
        else if (selectPlayer.equalsIgnoreCase("l") || selectPlayer.equalsIgnoreCase("lisa"))
        {
            Lisa lisa = new Lisa("Lisa"); //creates new instance of lisa with constructo parameter
            computerUser = lisa.getName();
            computerValue = lisa.generateRoshambo();// generate Roshambo value(paper, scissor, rock) and assign as computerValue
        }
        else
        {
            System.out.println("Invalid input!"); //invalid input message 
            selectPlayer = null;
        }   
       } while (selectPlayer == null); //repeat loop until correct input is entered by user
          
        System.out.println(inputPlayer + ": " + userValue);
        System.out.println(computerUser + ": " + computerValue);
        
        //compare user input against computer input and determine winner
        int resultValue = compareValue(userValue, computerValue);
        switch (resultValue) {
        case 0: //Tie
            System.out.println("Game Tied!");
            numberOfTies++; //increment by 1 when there is tie
            break;
        case 1: //User Wins
            System.out.println(inputPlayer + " wins!");
            userWins++; //increment by 1 when user(input player) wins
            break;
        case -1: //Computer Wins
            System.out.println(computerUser + " wins!");
            computerWins++; //increment by 1 when computer(lisa, bart) wins
            break;
        }
        System.out.println("\n");
        System.out.println("Would you like to play again? (Y/N)");
        userResponse = sc.next();
        
        //the loop keeps on going until the user keeps pressing yes
        }while (userResponse.equalsIgnoreCase("Y") || userResponse.equalsIgnoreCase("YES")); 
    
        
     //print statistics
     System.out.println("Game Statistitics:");
     System.out.println("-----------------------------");
     System.out.println(inputPlayer + " won Games: \t" + userWins);
     System.out.println(computerUser + " won Games: \t" + computerWins);
     System.out.println("Tied Games: \t" + numberOfTies);
        
    }
   
  }
