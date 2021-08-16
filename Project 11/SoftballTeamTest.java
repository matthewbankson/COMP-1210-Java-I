import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
*This program is to test the methods of the SoftballTeam class.
*
*Project 11
*@author Matthew Bankson
*@version April 22, 2019
*/
public class SoftballTeamTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   *Test of the getters methods.
   */
   @Test public void gettersTest() {
      SoftballTeam team = new SoftballTeam();
      Assert.assertEquals("getTeamName test", "none", team.getTeamName());
      Assert.assertEquals("getPlayerCount test", 0, team.getPlayerCount());
      Assert.assertEquals("getExcludedCount test", 0, team.getExcludedCount());
      Assert.assertEquals("getIgnoredCount test", 0, team.getIgnoredCount());
      Assert.assertEquals("getTeamCount test", 2, team.getTeamCount());
   }
   
   /**
   *Test of the setters methods.
   */
   @Test public void settersTest() {
      SoftballTeam team = new SoftballTeam();
      SoftballPlayer[] squad = new SoftballPlayer[30];
      String[] testRecords = new String[45];
      
      team.setTeamName("test");
      team.setRoster(squad);
      team.setPlayerCount(12);
      team.setExcludedRecords(testRecords);
      team.setExcludedCount(24);
      team.setIgnoredCount(4);
      
      Assert.assertEquals("setTeamName test", "test", team.getTeamName());
      Assert.assertArrayEquals("setRoster and getRoster test", 
         squad, team.getRoster());
      Assert.assertEquals("setPlayerCount test", 12, team.getPlayerCount());
      Assert.assertArrayEquals("setExcludedRecords and "
         + "getExcludedRecords test", testRecords, team.getExcludedRecords());
      Assert.assertEquals("setExcludedCount test", 24, team.getExcludedCount());
      Assert.assertEquals("setIgnoredCount test", 4, team.getIgnoredCount());
   }
   
   /**
   *Test of the resetCount() method.
   */
   @Test public void resetCountTest() {
      SoftballTeam team = new SoftballTeam();
      team.resetTeamCount();
      Assert.assertEquals("resetTeamCount test", 0, team.getTeamCount());
   }
   
   /**
   *Test of the readPlayerFile() method.
   *@throws IOException for file not found
   */
   @Test public void readPlayerFileTest() throws IOException {
      SoftballTeam team = new SoftballTeam();
      SoftballTeam team2 = new SoftballTeam();
      team2.setPlayerCount(24);
      team2.setExcludedCount(0);
      team.readPlayerFile("softball_player_data3.large_team_file.csv");
      team2.readPlayerFile("softball_player_data1.csv");
      Assert.assertEquals("Test for players read in", 24, 
         team.getPlayerCount());
      Assert.assertEquals("Test for excluded players", 30, 
         team.getExcludedCount());
      Assert.assertEquals("Test for ignored players", 5, 
         team.getIgnoredCount());
      Assert.assertEquals("Test for excluded player "
         + "if else statement", 6, team2.getExcludedCount());
   }
   
   /**
   *Test of the generateReport() method.
   *@throws IOException for file not found
   */
   @Test public void generateReportTest() throws IOException {
      SoftballTeam team = new SoftballTeam();
      team.readPlayerFile("softball_player_data1.csv");
      Assert.assertEquals("generateReport test", true, 
         team.generateReport().contains("32 Pat Jones (RF)"));
   }
   
   /**
   *Test of the generateReportByNumber() method.
   *@throws IOException for file not found
   */
   @Test public void generateReportByNumberTest() throws IOException {
      SoftballTeam team = new SoftballTeam();
      team.readPlayerFile("softball_player_data1.csv");
      Assert.assertEquals("generateReportByNumber test", true, 
         team.generateReportByNumber().contains("09 Pat Williams RF "
         + ".480\n23 Jackie Smith"));
   }
   
   /**
   *Test of the generateReportByName() method.
   *@throws IOException for file not found
   */
   @Test public void generateReportByNameTest() throws IOException {
      SoftballTeam team = new SoftballTeam();
      team.readPlayerFile("softball_player_data1.csv");
      Assert.assertEquals("generateReportByName test", true, 
         team.generateReportByName().contains("2.85 ERA\n09 Pat Williams"));
   }
   
   /**
   *Test of the generateReportByRating() method.
   *@throws IOException for file not found
   */
   @Test public void generateReportByRatingTest() throws IOException {
      SoftballTeam team = new SoftballTeam();
      team.readPlayerFile("softball_player_data1.csv");
      Assert.assertEquals("generateReportByRating test", true, 
         team.generateReportByRating().contains("4.560 09 Pat Williams "
         + "RF .480\n3.740"));
   }
   
   /**
   *Test of the generateExcludedRecordsReport() method.
   *@throws IOException for file not found
   */
   @Test public void generateExcludedRecordsReportTest() throws IOException {
      SoftballTeam team = new SoftballTeam();
      team.readPlayerFile("softball_player_data1.csv");
      Assert.assertEquals("generateExcludedRecordsReport test", true, 
         team.generateExcludedRecordsReport().contains("L,13,Gayle Adams"));
   }
}
