import java.io.IOException;
/**
*This program is to demonstrate the SoftballTeam
*class and its methods.
*
*Project 10
*@author Matthew Bankson
*@version April 17, 2019
*/
public class SoftballPlayersPart2 {
/**
*Reads in file and generates reports on team.
*@param args for command line argument - name of file
*@throws IOException for file not found
*/
   public static void main(String[] args) throws IOException {
      if (args.length == 0) {
         System.out.println("File name expected as command line argument."
            + "\nProgram ending.");
      }
      else {
         SoftballTeam myTeam = new SoftballTeam();
         myTeam.readPlayerFile(args[0]);
         System.out.println(myTeam.generateReport());
         System.out.print(myTeam.generateReportByNumber());
         System.out.print(myTeam.generateReportByName());
         System.out.print(myTeam.generateReportByRating());
         System.out.print(myTeam.generateExcludedRecordsReport());
      }
   }
}