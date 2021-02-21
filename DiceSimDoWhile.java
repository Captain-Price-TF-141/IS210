//Captain-Price-TF-141

import java.util.Random;   // Needed for the Random class

/**
   This class simulates rolling a pair of dice 10,000 times
   and counts the number of times doubles of are rolled for
   each different pair of doubles.
*/

public class DiceSimDoWhile
{
   public static void main(String[] args)
   {
      final int NUMBER = 10000;  // Number of dice rolls

      // A random number generator used in
      // simulating the rolling of dice
      Random generator = new Random();

      int die1Value;       // Value of the first die
      int die2Value;       // Value of the second die
      int count = 0;       // Total number of dice rolls
      int snakeEyes = 0;   // Number of snake eyes rolls
      int twos = 0;        // Number of double two rolls
      int threes = 0;      // Number of double three rolls
      int fours = 0;       // Number of double four rolls
      int fives = 0;       // Number of double five rolls
      int sixes = 0;       // Number of double six rolls

      // TASK #1 Enter your code for the algorithm here
      do
      {
    	  die1Value = generator.nextInt(7);
    	  die2Value = generator.nextInt(7);
    	  if(die1Value == die2Value)
    	  {
    	  
    	  if(die1Value == 1)
    	  {
    		  snakeEyes++;
    	  }
    	  else if(die1Value == 2)
    	  {
    		  twos++;
    	  }
    	  else if(die1Value == 3)
    	  {
    		  threes++;
    	  }
    	  else if(die1Value == 4)
    	  {
    		  fours++;
    	  }
    	  else if(die1Value == 5)
    	  {
    		  fives++;
    	  }
    	  else if(die1Value == 6)
    	  {
    		  sixes++;
    	  }
      }
      count++;
      
      }
      while(count < NUMBER);
      // Display the results
      System.out.println ("You rolled snake eyes " + snakeEyes + " out of " + count + " rolls.");
      
      System.out.println ("You rolled double twos " + twos + " out of " + count + " rolls.");
      
      System.out.println ("You rolled double threes " + threes + " out of " + count + " rolls.");
      
      System.out.println ("You rolled double fours " + fours + " out of " + count + " rolls.");
      
      System.out.println ("You rolled double fives " + fives + " out of " + count + " rolls.");
     
      System.out.println ("You rolled double sixes " + sixes + " out of " + count + " rolls.");
   }
}
