import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
/**
*This program defines the PentagonalPyramidList2
*class and its methods.
*
*Project 7
*@author Matthew Bankson
*@version March 6, 2019
*/
public class PentagonalPyramidList2 {
//Fields
   private String listName;
   private PentagonalPyramid[] ppArray;
   private int numPP;
   
   //Constructor
   /**
   *Constructs a PentagonalPyramidList2 object.
   *@param listNameIn for listName
   *@param ppArrayIn for ppArray
   *@param numPPIn for numPP
   */
   public PentagonalPyramidList2(String listNameIn, 
      PentagonalPyramid[] ppArrayIn, int numPPIn) {
      listName = listNameIn;
      ppArray = ppArrayIn;
      numPP = numPPIn;
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
      return numPP;
   }
   
   /**
   *Calculates the total surface area for
   *all Pentagonal Pyramids in the list.
   *@return 0 if no pyramids or total for total SA
   */
   public double totalSurfaceArea() {
      double total = 0.0;
      if (numPP != 0) {
         for (int i = 0; i < numPP; i++) {
            total += ppArray[i].surfaceArea();
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
      if (numPP != 0) {
         for (int i = 0; i < numPP; i++) {
            total += ppArray[i].volume();
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
      if (numPP != 0) {
         for (int i = 0; i < numPP; i++) {
            total += ppArray[i].surfaceArea();
         }
         average = total / numPP;
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
      if (numPP != 0) {
         for (int i = 0; i < numPP; i++) {
            total += ppArray[i].volume();
         }
         average = total / numPP;
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
      for (int i = 0; i < numPP; i++) {
         result += "\n" + ppArray[i] + "\n";
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
         + "Number of PentagonalPyramid: " + numPP + "\n"
         + "Total Surface Area: " + df.format(totalSurfaceArea()) + "\n"
         + "Total Volume: " + df.format(totalVolume()) + "\n"
         + "Average Surface Area: " + df.format(averageSurfaceArea()) + "\n"
         + "Average Volume: " + df.format(averageVolume());
      return summary;
   }
   
   /**
   *Returns the array of Pentagonal Pyramids.
   *@return ppArray
   */
   public PentagonalPyramid[] getList() {
      return ppArray;
   }
   
   /**
   *Reads data from a file to create a new
   *Pentagonal Pyramid object.
   *@param fileNameIn for file name to read
   *@return ppL for the object created
   *@throws FileNotFoundException if file cannot be opened
   */
   public PentagonalPyramidList2 readFile(String fileNameIn)
      throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      PentagonalPyramid[] myList = new PentagonalPyramid[20];
      String myListName = "";
      String label = "";
      double edge = 0.0, height = 0.0;
      int numberOfPP = 0;
      myListName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine().trim();
         edge = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         PentagonalPyramid pentp = new PentagonalPyramid(label, edge, height);
         myList[numberOfPP] = pentp;
         numberOfPP++;
      }
      PentagonalPyramidList2 ppL = 
         new PentagonalPyramidList2(myListName, myList, numberOfPP);
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
      ppArray[numPP] = add;
      numPP++;
   }
   
   /**
   *Finds the pyramid matching the label passed in
   *and returns it.
   *@return ppArray[i] for pyramid found or null for not found
   *@param labelIn for label of pyramid looking for
   */
   public PentagonalPyramid findPentagonalPyramid(String labelIn) {
      for (int i = 0; i < numPP; i++) {
         if (labelIn.equalsIgnoreCase(ppArray[i].getLabel())) {
            return ppArray[i];
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
      for (int i = 0; i < numPP; i++) {
         if (labelIn.equalsIgnoreCase(ppArray[i].getLabel())) {
            for (int j = i; j < numPP - 1; j++) {
               ppArray[j] = ppArray[j + 1];
            }
            ppArray[numPP - 1] = null;
            numPP--;
            return pyramid;
         }
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