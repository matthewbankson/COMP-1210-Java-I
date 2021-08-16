import java.util.Scanner;
/**
*This program is to calculate the volume
*and surface area of a pentagonal pyramid.
*
*Project 4
*@author Matthew Bankson
*@version February 6, 2019.
*/
public class PentagonalPyramidApp {
/**
*Takes user input and calculates the surface area
*and volume of a pentagonal pyramid.
*@param args Command line arguments - not used.
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter label, base edge, and height "
         + "for a pentagonal pyramid.");
      System.out.print("\tlabel: ");
      String userlabel = userInput.nextLine();
      System.out.print("\tbase edge: ");
      String base = userInput.nextLine();
      double b = Double.parseDouble(base);
      if (b <= 0) {
         System.out.println("Error: base edge must be greater than 0.");
      }
      else {
         System.out.print("\theight: ");
         String height = userInput.nextLine();
         double h = Double.parseDouble(height);
         if (h <= 0) {
            System.out.println("Error: height must be greater than 0.");
         }
         else {
            PentagonalPyramid pyramid = new PentagonalPyramid(userlabel, b, h);
            String result = pyramid.toString();
            System.out.println("\n" + result);
         }
      }
   }
}