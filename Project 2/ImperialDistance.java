import java.util.Scanner;
/**
*This program is to convert inches to
*a combination of miles, yards, feet, and inches.
*
*Project 2
*@author Matthew Bankson
*@version January 23, 2019
*/
public class ImperialDistance {
/**
*Converts inches to miles, yards, feet, and inches.
*@param args Command line arguments - not used.
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int userinches = 0, feet = 0, yards = 0, miles = 0, inches = 0;
      //Prompts user to input inches
      System.out.print("Enter the raw distance measurement in inches: ");
      userinches = userInput.nextInt();
      //Must be positive
      if (userinches < 0) {
         System.out.println("Measurement must be non-negative!");
      }
      //Converts and displays inches.
      else {
         System.out.println("\nMeasurement by combined miles, "
            + "yards, feet, inches:");
         miles = userinches / 63360;
         System.out.println("\tmiles: " + miles);
         yards = (userinches % 63360) / 36;
         System.out.println("\tyards: " + yards);
         feet = (userinches % 63360) % 36 / 12;
         System.out.println("\tfeet: " + feet);
         inches = (userinches % 63360) % 36 % 12 / 1;
         System.out.println("\tinches: " + inches);
         System.out.println("\n" + userinches + " in = "
            + miles + " mi, " + yards + " yd, " + feet + " ft, " 
            + inches + " in");
      }
   }
}