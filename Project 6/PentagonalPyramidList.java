import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.text.DecimalFormat;
/**
*This program defines the PentagonalPyramidList
*class and its methods.
*
*Project 6
*@author Matthew Bankson
*@version February 27, 2019
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
   
   /**
   *Returns the list of Pentagonal Pyramids.
   *@return ppList
   */
   public ArrayList<PentagonalPyramid> getList() {
      return ppList;
   }
   
   /**
   *Reads data from a file to create a new
   *Pentagonal Pyramid object.
   *@param fileNameIn for file name to read
   *@return ppL for the object created
   *@throws FileNotFoundException if file cannot be opened
   */
   public PentagonalPyramidList readFile(String fileNameIn)
      throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<PentagonalPyramid> myList = new ArrayList<PentagonalPyramid>();
      String myListName = "";
      String label = "";
      double edge = 0.0, height = 0.0;
      myListName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine().trim();
         edge = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         PentagonalPyramid pentp = new PentagonalPyramid(label, edge, height);
         myList.add(pentp);
      }
      PentagonalPyramidList ppL = new PentagonalPyramidList(myListName, myList);
      return ppL;
   }
   
   /**
   *Creates a new pyramid and adds it to
   *the pentagonal pyramid list object.
   *@param labelIn for pp label
   *@param edgeIn for pp edge
   *@param heightIn for pp height
   */
   public void addPentagonalPyramid(String labelIn, 
      double edgeIn, double heightIn) {
      PentagonalPyramid add = new PentagonalPyramid(labelIn, edgeIn, heightIn);
      ppList.add(add);
   }
   
   /**
   *Finds the pyramid matching the label passed in
   *and returns it.
   *@return p for pyramid found or null for not found
   *@param labelIn for label of pyramid looking for
   */
   public PentagonalPyramid findPentagonalPyramid(String labelIn) {
      for (PentagonalPyramid p : ppList) {
         if (labelIn.equalsIgnoreCase(p.getLabel())) {
            return p;
         }
      }
      return null;
   }
   
   /**
   *Deletes pyramid matching label passed in if found.
   *@param labelIn for label of pyramid
   *@return pyramid deleted or null if no pyramid found
   */
   public PentagonalPyramid deletePentagonalPyramid(String labelIn) {
      PentagonalPyramid pyramid = findPentagonalPyramid(labelIn);
      if ((pyramid) != null) {
         ppList.remove(pyramid);
         return pyramid;
      }
      return null;
   }
   
   /**
   *Finds pyramid based off name and edits according
   *to values passed in.
   *@return result for if edit worked
   *@param labelIn for label looked for
   *@param edgeIn for setting new edge
   *@param heightIn for setting new height
   */
   public boolean editPentagonalPyramid(String labelIn, 
      double edgeIn, double heightIn) {
      boolean result = false;
      PentagonalPyramid pyramid = findPentagonalPyramid(labelIn);
      if ((pyramid) != null) {
         pyramid.setBaseEdge(edgeIn);
         pyramid.setHeight(heightIn);
         result = true;
      }
      return result;
   }
}