/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;
import java.io.*;
import java.util.*;

public class FileHandling {
    public static void main(String[] args) {
        File inputFile = new File("answers.txt");
        ArrayList<String> answers = new ArrayList<String>();
        String answer, response = "y";
        Random rand = new Random();
        try
        {
            Scanner input = new Scanner(inputFile);
            while(input.hasNextLine())
            {
                answer = input.nextLine();
                answers.add(answer);
            } 
        }
        catch(Exception e)
        {
            System.out.println("The input file \"answers.txt\" was not found.");
            System.out.println(e.toString());
        }
        Scanner sc = new Scanner(System.in);
        while(response.equalsIgnoreCase("y"))
        {
            System.out.println("The fortune teller is ready.....\n" 
            + "Please think of a question in your mind and hit Enter for reply");
            sc.nextLine();
            System.out.println("The fortune teller says: \n"
            + answers.get(rand.nextInt(answers.size())));
            //System.out.println(answers.size());
            System.out.println("Do you have another question? (y/n)");
            response = sc.nextLine();
        }
    }
    
}
