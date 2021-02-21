//Captain-Price-TF-141

//TASK #2 Add an import statement for the Scanner class

import java.util.Scanner;

/**
This program demonstrates how numeric types and
operators behave in Java.
*/


public class NumericTypes
{
	
	
public static void main (String [] args)
{
   // TASK #2 Create a Scanner object here
	
	Scanner keyboard = new Scanner (System.in);
	
   // (not used for alternate)

   // Identifier declarations
   final int NUMBER = 2;            // Number of scores
   final int SCORE1 = 100;          // First test score
   final int SCORE2 = 95;           // Second test score
   final int BOILING_IN_F = 212;    // Boiling temperature
   final int fToC;                  // Temperature Celsius
   double average;               // Arithmetic average
   String output;                // Line of output

   // TASK #2 declare variables used here
   String firstName;
   String lastName;
   String fullName;
   
   // TASK #3 declare variables used here
   char firstInitial;
   
   // TASK #4 declare variables used here
   double diameter, radius, volume;

   // Find an arithmetic average.
   average = ((double)SCORE1 + SCORE2) / NUMBER;
   output = SCORE1 + " and " + SCORE2 +
            " have an average of " + average;
   System.out.println(output);

   // Convert Fahrenheit temperature to Celsius.
   fToC =  (BOILING_IN_F - 32) * 5/9;
   output = BOILING_IN_F + " in Fahrenheit is " +
            fToC + " in Celsius.";
   
   System.out.println(output);
   
   System.out.println();      // To leave a blank line

   // ADD LINES FOR TASK #2 HERE
   // Prompt the user for first name
   System.out.print("enter your first name ");
   
   // Read the user's first name
   firstName = keyboard.nextLine();
   
   // Prompt the user for last name
   System.out.print("enter your last name ");
   
   // Read the user's last name
   lastName = keyboard.nextLine();
   
   // Concatenate the user's first and last names
   fullName = firstName + " " + lastName;
   // Print out the user's full name
   System.out.println(fullName + " has " + fullName.length() + " characters");

   System.out.println();      // To leave a blank line

   // ADD LINES FOR TASK #3 HERE
   // Get the first character from the user's first name
   firstInitial = firstName.charAt(0);
   
   // Print out the user's first initial
   System.out.println("first initial: " + firstInitial);
   
   System.out.println();      // To leave a blank line
   
   // Convert the user's full name to uppercase
   fullName = fullName.toUpperCase();
   
   // Print out the user's full name in uppercase
   System.out.println("full name in all capital: " + fullName);
   
   System.out.println();      // To leave a blank line

   // ADD LINES FOR TASK #4 HERE
   // Prompt the user for a diameter of a sphere
   System.out.print("enter a diameter of a sphere: ");
   
   // Read the diameter
   diameter = keyboard.nextDouble();
   
   // Calculate the radius
   radius = diameter / 2;
   
   // Calculate the volume
   volume = (4 * (Math.PI) * (Math.pow(radius, 3)) / 3);
   
   // Print out the volume
   System.out.println("the volume is: " + volume);
   
   System.out.println();      // To leave a blank line
}
}
