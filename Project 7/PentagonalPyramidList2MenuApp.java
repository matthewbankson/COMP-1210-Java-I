import java.util.Scanner;
import java.io.FileNotFoundException;
/**
*This program is to demonstrate the
*PentagonalPyramidList2 class and its methods.
*
*Project 7
*@author Matthew Bankson
*@version March 6, 2019
*/
public class PentagonalPyramidList2MenuApp {
/**
*Main method takes user input and manipulates
*a list of pentagonal pyramids based off input.
*@param args - is not used
*@throws FileNotFoundException if the file cannot be opened
*/
   public static void main(String[] args) throws FileNotFoundException {
      String nameOfList = "no list name";
      PentagonalPyramid[] thisList = new PentagonalPyramid[20];
      PentagonalPyramidList2 thisPPList = 
         new PentagonalPyramidList2(nameOfList, thisList, 0);
      String fileName = "no file name";
      String label = "";
      double edge, height;
      String code = "";
      Scanner scan = new Scanner(System.in);
      System.out.println("PentagonalPyramid List System Menu"
         + "\nR - Read File and Create PentagonalPyramid List"
         + "\nP - Print PentagonalPyramid List"
         + "\nS - Print Summary"
         + "\nA - Add PentagonalPyramid"
         + "\nD - Delete PentagonalPyramid"
         + "\nF - Find PentagonalPyramid"
         + "\nE - Edit PentagonalPyramid"
         + "\nQ - Quit");
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char charCode = code.charAt(0);
         switch (charCode) {
            case 'R':
               System.out.print("\tFile Name: ");
               fileName = scan.nextLine();
               thisPPList = thisPPList.readFile(fileName);
               System.out.println("\tFile read in and "
                  + "PentagonalPyramid List created\n");
               break;
            case 'P':
               System.out.println(thisPPList);
               break;
            case 'S':
               System.out.println("\n" + thisPPList.summaryInfo() + "\n");
               break;
            case 'A':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tBase Edge: ");
               edge = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               thisPPList.addPentagonalPyramid(label, edge, height);
               System.out.println("\t*** PentagonalPyramid added ***\n");
               break;
            case 'D':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               PentagonalPyramid delete = 
                  thisPPList.deletePentagonalPyramid(label);
               if (delete != null) {
                  System.out.println("\t\""
                     + delete.getLabel() + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               PentagonalPyramid find = thisPPList.findPentagonalPyramid(label);
               if (find != null) {
                  System.out.println(find + "\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tBase Edge: ");
               edge = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               if (thisPPList.editPentagonalPyramid(label, edge, height)) {
                  System.out.println("\t\"" + label
                     + "\" successfully edited\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
            case 'Q':
               break;
            case 'Z':
               System.out.println(thisPPList.findPentagonalPyramidWithShortestBaseEdge());
               break;
            default:
               System.out.println("\t*** invalid code ***\n");
               break;
         }
      } while (!code.equalsIgnoreCase("Q"));
   }
}