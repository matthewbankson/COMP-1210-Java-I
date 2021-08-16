import java.util.Scanner;
import java.text.DecimalFormat;
/**
*This program is to take coded information and
*translate it into an order from a restaurant.
*
*Project 3
*@author Matthew Bankson
*@version January 30, 2019
*/
public class MealOrder {
   static final double DISCOUNT = 0.15;
   static final double DISCOUNT_THRESHOLD = 100.0;
/**
*Translates coded information into an order.
*@param args Command line arguments - not used.
*/
   public static void main(String[] args) {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      Scanner userInput = new Scanner(System.in);
      String ordercode = "", adultstring = "", kidsstring = "";
      String adultpricestring = "", kidspricestring = "", name = "";
      int adult = 0, kids = 0, luckynumber = 0;
      double adultprice = 0.0, kidsprice = 0.0, total = 0.0;
      double discounttotal = 0.0, discount = 0.0;
      //Prompts user for code
      System.out.print("Enter your order code: ");
      ordercode = userInput.nextLine();
      ordercode = ordercode.trim();
      //Error message
      if (ordercode.length() < 12) {
         System.out.println("\nInvalid Order Code.");
         System.out.println("Order code must have "
            + "at least 12 characters.");
      }
      else {
      //Breaks up string and does calculations
         adultstring = ordercode.substring(0, 2);
         adultpricestring = ordercode.substring(2, 6);
         kidsstring = ordercode.substring(6, 8);
         kidspricestring = ordercode.substring(8, 12);
         name = ordercode.substring(12, ordercode.length());
         adult = Integer.parseInt(adultstring);
         kids = Integer.parseInt(kidsstring);
         adultprice = Double.parseDouble(adultpricestring);
         kidsprice = Double.parseDouble(kidspricestring);
         adultprice = (adultprice / 100.0);
         kidsprice = (kidsprice / 100.0);
         total = (adultprice * adult + kidsprice * kids);
         //Prints name and information about meal
         System.out.println("\nName: " + name);
         System.out.println("Adult meals: "
            + adult + " at " + df.format(adultprice));
         System.out.println("Child meals: "
            + kids + " at " + df.format(kidsprice));
         if (total < DISCOUNT_THRESHOLD) {
            System.out.println("Total: " + df.format(total));
         }
         //Applies discount
         else {
            System.out.println("Subtotal: " + df.format(total));
            discount = DISCOUNT * total;
            System.out.println("15% Discount: -" + df.format(discount));
            discounttotal = total - discount;
            System.out.println("Total: " + df.format(discounttotal));
         }
         //Generates lucky number
         luckynumber = (int) (Math.random() * 99999) + 1;
         System.out.println("Lucky Number: " + luckynumber);
      }
   }
}