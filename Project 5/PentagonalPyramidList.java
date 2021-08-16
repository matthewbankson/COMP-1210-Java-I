import java.util.ArrayList;
import java.text.DecimalFormat;
/**
*This program defines the PentagonalPyramidList
*class and its methods.
*
*Project 5
*@author Matthew Bankson
*@version February 20, 2019
*/
public class PentagonalPyramidList {
//Fields
   private String listName;
   private ArrayList<PentagonalPyramid> ppList;
   
   //Constructor
   /**
   *Constructs a PentagonalPyramidList object.
   *@param listNameIn for listName
   *@param ppListIn for ppList
   */
   public PentagonalPyramidList(String listNameIn, 
      ArrayList<PentagonalPyramid> ppListIn) {
      listName = listNameIn;
      ppList = ppListIn;
   }
   
   //Methods
   /**
   *Returns name of the list.
   *@return listName
   */
   public String getName() {
      return listName;
   }
   
   /**
   *Returns the number of pentagonal pyramids
   *in the list.
   *@return ppList.size() for number of objects in list
   */
   public int numberOfPentagonalPyramids() {
      return ppList.size();
   }
   
   /**
   *Calculates the total surface area for
   *all Pentagonal Pyramids in the list.
   *@return 0 if no pyramids or total for total SA
   */
   public double totalSurfaceArea() {
      double total = 0.0;
      int index = 0;
      if (ppList.size() != 0) {
         while (index < ppList.size()) {
            total += ppList.get(index).surfaceArea();
            index++;
         }
      }
      else {
         return 0.0;
      }
      return total;
   }
   
   /**
   *Calculates the total volume for
   *all Pentagonal Pyramids in the list.
   *@return 0 for no pyramids or total for total volume
   */
   public double totalVolume() {
      double total = 0.0;
      int index = 0;
      if (ppList.size() != 0) {
         while (index < ppList.size()) {
            total += ppList.get(index).volume();
            index++;
         }
      }
      else {
         return 0.0;
      }
      return total;
   }
   
   /**
   *Calculates the average surface area for
   *all the pyramids in the list.
   *@return 0 for no pyramids or average for average of SA
   */
   public double averageSurfaceArea() {
      double average = 0.0, total = 0.0;
      int index = 0;
      if (ppList.size() != 0) {
         while (index < ppList.size()) {
            total += ppList.get(index).surfaceArea();
            index++;
         }
         average = total / ppList.size();
      }
      else {
         return 0.0;
      }
      return average;
   }
   
   /**
   *Calculates the average volume of all the
   *pyramids in the list.
   *@return 0 for no pyramids and average for average of volume
   */
   public double averageVolume() {
      double average = 0.0, total = 0.0;
      int index = 0;
      if (ppList.size() != 0) {
         while (index < ppList.size()) {
            total += ppList.get(index).volume();
            index++;
         }
         average = total / ppList.size();
      }
      else {
         return 0.0;
      }
      return average;
   }
   
   /**
   *Converts info about pyramid list into a string.
   *@return result of string
   */
   public String toString() {
      String result = "";
      result = listName + "\n";
      int index = 0;
      while (index < ppList.size()) {
         result += "\n" + ppList.get(index) + "\n";
         index++;
      }
      return result;
   }
   
   /**
   *Returns a string containing summary information
   *about the list of pyramids.
   *@return summary for the summary string
   */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String summary = "";
      summary = "----- Summary for " + listName + " -----\n"
         + "Number of PentagonalPyramid: " + ppList.size() + "\n"
         + "Total Surface Area: " + df.format(totalSurfaceArea()) + "\n"
         + "Total Volume: " + df.format(totalVolume()) + "\n"
         + "Average Surface Area: " + df.format(averageSurfaceArea()) + "\n"
         + "Average Volume: " + df.format(averageVolume());
      return summary;
   }
}