/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewrite;
import java.util.*;
import java.io.*;
public class FileWrite {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File inputFile = new File("customers.txt");
        File outputFile = new File("customersDetail.txt");
        try
        {
        Scanner input = new Scanner(inputFile);
        PrintWriter output = new PrintWriter(outputFile);
        String person;
        while (input.hasNextLine())
        {
            person = input.nextLine();
            System.out.println("Enter age for " + person + ":");
            int age = sc.nextInt();
            output.println(person + "\t" + age);
        }
        
            output.close();
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.toString());
        }
        
    }
    
}
