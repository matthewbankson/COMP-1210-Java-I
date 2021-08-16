import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.text.DecimalFormat;
/**
*This program is to define a SoftballTeam object
*and its methods.
*
*Project 11
*@author Matthew Bankson
*@version April 22, 2019
*/
public class SoftballTeam {
//Fields
   private String teamName;
   private SoftballPlayer[] roster;
   private int playerCount;
   private String[] excludedRecords;
   private int excludedCount;
   private int ignoredCount;
   private static int teamCount;
   /**
   *Max number of players on a team.
   */
   public static final int MAX_PLAYERS = 24;
   /**
   *Max number of excluded records.
   */
   public static final int MAX_EXCLUDED = 30;
   
   //Constructor
   /**
   *Creates a SoftballTeam object and initializes its fields.
   */
   public SoftballTeam() {
      teamName = "none";
      roster = new SoftballPlayer[24];
      playerCount = 0;
      excludedRecords = new String[30];
      excludedCount = 0;
      ignoredCount = 0;
      teamCount++;
   }
   
   //Methods
   /**
   *Returns the SoftballTeam name.
   *@return teamName
   */
   public String getTeamName() {
      return teamName;
   }
   
   /**
   *Sets team name to name passed in.
   *@param nameIn for teamName
   */
   public void setTeamName(String nameIn) {
      teamName = nameIn;
   }
   
   /**
   *Returns the roster of softball players.
   *@return roster
   */
   public SoftballPlayer[] getRoster() {
      return roster;
   }
   
   /**
   *Sets roster to roster passed in.
   *@param spIn for roser
   */
   public void setRoster(SoftballPlayer[] spIn) {
      roster = spIn;
   }
   
   /**
   *Returns number of players.
   *@return playerCount
   */
   public int getPlayerCount() {
      return playerCount;
   }
   
   /**
   *Sets player count to player count passed in.
   *@param pcIn for playerCount
   */
   public void setPlayerCount(int pcIn) {
      playerCount = pcIn;
   }
   
   /**
   *Returns the records excluded.
   *@return excludedRecords
   */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   
   /**
   *Sets excluded records to excluded records array passed in.
   *@param erIn for excludedRecords
   */
   public void setExcludedRecords(String[] erIn) {
      excludedRecords = erIn;
   }
   
   /**
   *Returns the number of excluded records.
   *@return excludedCount
   */
   public int getExcludedCount() {
      return excludedCount;
   }
   
   /**
   *Sets excluded count to number passed in.
   *@param ecIn for excludedCount
   */
   public void setExcludedCount(int ecIn) {
      excludedCount = ecIn;
   }
   
   /**
   *Returns the number of ignored records.
   *@return ignoredCount
   */
   public int getIgnoredCount() {
      return ignoredCount;
   }
   
   /**
   *Sets ignored count to number passed in.
   *@param icIn for ignoredCount
   */
   public void setIgnoredCount(int icIn) {
      ignoredCount = icIn;
   }
   
   /**
   *Returns the number of softball teams.
   *@return teamCount
   */
   public static int getTeamCount() {
      return teamCount;
   }
   
   /**
   *Sets team count to 0.
   */
   public static void resetTeamCount() {
      teamCount = 0;
   }
   
   /**
   *Reads in file and adds players to roster according to type.
   *If roster is full, adds player to excludedReport.
   *If both roster and excludedReport are full, increments ignoredCount.
   *@param fileIn for file to be read in
   *@throws IOException for file not found
   */
   public void readPlayerFile(String fileIn)
      throws IOException {
      
      String code, number, name, position, line;
      double specialization, batting, fielding, era;
      int wins, losses, saves;
      char codeChar;
      
      Scanner scanFile = new Scanner(new File(fileIn));
      teamName = scanFile.nextLine();
      
      while (scanFile.hasNextLine()) {
         line = scanFile.nextLine();
         
         try {
            if (playerCount < MAX_PLAYERS) {
               Scanner scanLine = new Scanner(line);
               scanLine.useDelimiter(",");
               code = scanLine.next();
               codeChar = code.charAt(0);
               switch (codeChar) {
                  case 'O':
                     number = scanLine.next();
                     name = scanLine.next();
                     position = scanLine.next();
                     specialization = Double.parseDouble(scanLine.next());
                     batting = Double.parseDouble(scanLine.next());
                     fielding = Double.parseDouble(scanLine.next());
                     roster[playerCount] = new Outfielder(number, name, 
                        position, specialization, batting, fielding);
                     playerCount++;
                     break;
                  
                  case 'I':
                     number = scanLine.next();
                     name = scanLine.next();
                     position = scanLine.next();
                     specialization = Double.parseDouble(scanLine.next());
                     batting = Double.parseDouble(scanLine.next());
                     fielding = Double.parseDouble(scanLine.next());
                     roster[playerCount] = new Infielder(number, name, 
                        position, specialization, batting, fielding);
                     playerCount++;
                     break;
                  
                  case 'P':
                     number = scanLine.next();
                     name = scanLine.next();
                     position = scanLine.next();
                     specialization = Double.parseDouble(scanLine.next());
                     batting = Double.parseDouble(scanLine.next());
                     wins = Integer.parseInt(scanLine.next());
                     losses = Integer.parseInt(scanLine.next());
                     era = Double.parseDouble(scanLine.next());
                     roster[playerCount] = new Pitcher(number, name, position, 
                        specialization, batting, wins, losses, era);
                     playerCount++;
                     break;
                  
                  case 'R':
                     number = scanLine.next();
                     name = scanLine.next();
                     position = scanLine.next();
                     specialization = Double.parseDouble(scanLine.next());
                     batting = Double.parseDouble(scanLine.next());
                     wins = Integer.parseInt(scanLine.next());
                     losses = Integer.parseInt(scanLine.next());
                     era = Double.parseDouble(scanLine.next());
                     saves = Integer.parseInt(scanLine.next());
                     roster[playerCount] = new ReliefPitcher(number, name, 
                        position, specialization, batting, wins, 
                        losses, era, saves);
                     playerCount++;
                     break;
                  
                  default:
                     throw new InvalidCategoryException(code);
               }
            }
            else if (excludedCount < MAX_EXCLUDED) {
               excludedRecords[excludedCount] = "Maximum player count "
                  + "of 24 exceeded for: " + line;
               excludedCount++;
            }
            
            else {
               ignoredCount++;
            }
         }
         catch (InvalidCategoryException e) {
            excludedRecords[excludedCount] = e + " in: " + line;
            excludedCount++;
         }
         catch (NumberFormatException e) {
            excludedRecords[excludedCount] = e + " in: " + line;
            excludedCount++;
         } 
      }
   }
   
   /**
   *Makes string with list of players.
   *@return report
   */
   public String generateReport() {
      String report = "\n---------------------------------------"
         + "\nTeam Report for " + getTeamName()
         + "\n---------------------------------------\n";
      for (int i = 0; i < playerCount; i++) {
         report += "\n" + roster[i] + "\n";
      }
      return report;
   }
   
   /**
   *Makes a string with player sorted by number.
   *@return report
   */
   public String generateReportByNumber() {
      String report = "\n---------------------------------------"
         + "\nTeam Report for " + getTeamName() + " (by Number)"
         + "\n---------------------------------------\n";
      SoftballPlayer[] bp = Arrays.copyOf(roster, playerCount);
      Arrays.sort(bp);
      for (SoftballPlayer s: bp) {
         report += s.getNumber() + " " + s.getName()
            + " " + s.getPosition() + " " + s.stats() + "\n";
      }
      return report;
   }
   
   /**
   *Makes string with players sorted by name.
   *@return report
   */
   public String generateReportByName() {
      String report = "\n---------------------------------------"
         + "\nTeam Report for " + getTeamName() + " (by Name)"
         + "\n---------------------------------------\n";
      SoftballPlayer[] bp = Arrays.copyOf(roster, playerCount);
      Arrays.sort(bp, new NameComparator());
      for (SoftballPlayer s: bp) {
         report += s.getNumber() + " " + s.getName()
            + " " + s.getPosition() + " " + s.stats() + "\n";
      }
      return report;
   }
   
   /**
   *Makes string with players sorted by rating.
   *@return report
   */
   public String generateReportByRating() {
      DecimalFormat df = new DecimalFormat("0.000");
      String report = "\n---------------------------------------"
         + "\nTeam Report for " + getTeamName() + " (by Rating)"
         + "\n---------------------------------------\n";
      SoftballPlayer[] bp = Arrays.copyOf(roster, playerCount);
      Arrays.sort(bp, new RatingComparator());
      for (SoftballPlayer s: bp) {
         report += df.format(s.rating()) + " " + s.getNumber()
            + " " + s.getName() + " " + s.getPosition() + " " 
            + s.stats() + "\n";
      }
      return report;
   }
   
   /**
   *Makes string of excluded players and tells ignored count.
   *@return report
   */
   public String generateExcludedRecordsReport() {
      String report = "\n---------------------------------------"
         + "\nExcluded Records Report"
         + "\n---------------------------------------\n";
      for (int i = 0; i < excludedCount; i++) {
         report += excludedRecords[i] + "\n";
      }
      report += "Number of ignored records from file: " + ignoredCount;
      return report;
   }
}