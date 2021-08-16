import java.io.IOException;
/**
*This program is to demonstrate the SoftballTeam
*class and its methods.
*
*Project 11
*@author Matthew Bankson
*@version April 22, 2019
*/
public class SoftballPlayersPart3 {
/**
*Reads in file and generates reports on team.
*@param args for command line argument - name of file
*/
   public static void main(String[] args) {
      if (args.length == 0) {
         System.out.println("File name expected as command line argument."
            + "\nProgram ending.");
      }
      else {
         try {
            SoftballTeam myTeam = new SoftballTeam();
            myTeam.readPlayerFile(args[0]);
            System.out.println(myTeam.generateReport());
            System.out.print(myTeam.generateReportByNumber());
            System.out.print(myTeam.generateReportByName());
            System.out.print(myTeam.generateReportByRating());
            System.out.print(myTeam.generateExcludedRecordsReport());
         }
         catch (IOException e) {
            System.out.println("Attempted to read file: " + args[0]
               + " (No such file or directory)\nProgram ending.");
         }
      }
   }
}