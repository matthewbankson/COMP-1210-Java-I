import java.util.Scanner;
import java.text.DecimalFormat;
/**
*This program is to evaluate the expression given
*based off the user's value for x.
*
*Project 3
*@author Matthew Bankson
*@version January 30, 2019
*/
public class ExpressionEvaluator {
/**
*Evaluates expression after user inputs x and
*tells how many numbers are to each side of the decimal.
*@param args Command line arguments - not used.
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String stringresult = "", stringleft = "", stringright = "";
      double absval, sqrt = 0, x = 0, denom = 0, paren = 0, result = 0;
      int period = 0, length = 0, digleft = 0, digright = 0;
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      //Expression in denominator
      denom = (Math.pow(x, 2.0) + 10.0);
      //Expression in absolute value
      absval = (Math.abs(1.2 * Math.pow(x, 3.0) - 10 * x + 1));
      //Expression in parentheses in sqare root
      paren = (5 * Math.pow(x, 4.0) - 7 * Math.pow(x, 3.0));
      paren = (Math.pow(paren, 2.0));
      //Expression of square root
      sqrt = (absval + paren);
      sqrt = (Math.sqrt(sqrt));
      result = (sqrt / denom);
      //Prints result
      System.out.println("Result: " + result);
      stringresult = Double.toString(result);
      //Prints char left of decimal
      period = stringresult.indexOf(".");
      stringleft = stringresult.substring(0, period);
      System.out.println("# of characters to left "
         + "of decimal point: " + stringleft.length());
         //Prints char right of decimal
      stringright = stringresult.substring(period, stringresult.length() - 1);
      System.out.println("# of characters to right "
         + "of decimal point: " + stringright.length());
         //Prints in correct format
      DecimalFormat df = new DecimalFormat("#,##0.0###");
      System.out.println("Formatted Result: " + df.format(result));
   }
}