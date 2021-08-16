import java.util.Scanner;
/**
*This program is to solve for "result" when the
*user inputs values for x, y, and z.
*
*Project 2
*@author Matthew Bankson
*@version January 23, 2019
*/
public class Solver {
/**
*solves for "result" when user inputs values for variables.
*@param args Command line arguments - not used.
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      double x = 0, y = 0, z = 0, result = 0;
      //Display "result"
      System.out.println("result = (10x + 4.1) (5y + 8.7) "
         + "/ z");
         //Prompts user to input values for x, y, and z.
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
      //Computes and prints result.
      System.out.print("result = ");
      if (z != 0) {
         result = (10 * x + 4.1) * (5 * y + 8.7) / z;
      }
      else {
         result = 0;
      }
      System.out.println(result);
   }
}