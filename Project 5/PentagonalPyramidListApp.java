import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/**
*This program is to demonstrate the
*PentagonalPyramidList class.
*
*Project 5
*@author Matthew Bankson
*@version February 21, 2019
*/
public class PentagonalPyramidListApp {
/**
*Takes in user input to read a file and prints
*information about the list created from the file.
*@param args - is not used.
*@throws IOException from scanning input file.
*/
   public static void main(String[] args) throws IOException {
      ArrayList<PentagonalPyramid> myList = new ArrayList<PentagonalPyramid>();
      String ppListName = "";
      String label = "";
      double edge = 0.0;
      double height = 0.0;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      Scanner scanFile = new Scanner(new File(fileName));
      ppListName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine().trim();
         edge = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         PentagonalPyramid pentp = new PentagonalPyramid(label, edge, height);
         myList.add(pentp);
      }
      PentagonalPyramidList myPentagonalPyramidList 
         = new PentagonalPyramidList(ppListName, myList);
      System.out.println("\n" + myPentagonalPyramidList);
      System.out.println("\n" + myPentagonalPyramidList.summaryInfo());
   }
}