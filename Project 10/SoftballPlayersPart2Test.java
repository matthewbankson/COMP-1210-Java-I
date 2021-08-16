import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
*This program is to test the SoftballPlayersPart2 main method.
*
*Project 10
*@author Matthew Bankson
*@version April 17, 2019
*/
public class SoftballPlayersPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   *Test of no command line args passed in.
   *@throws IOException for file not found
   */
   @Test public void noCommandLineTest() throws IOException {
      SoftballPlayersPart2 app = new SoftballPlayersPart2();
      SoftballTeam.resetTeamCount();
      String[] args1 = {};
      SoftballPlayersPart2.main(args1);
      Assert.assertEquals("Team count should be 0", 0, 
         SoftballTeam.getTeamCount());
   }
   
   /**
   *Test with command line args passed in.
   *@throws IOException for file not found
   */
   @Test public void commandLineTest() throws IOException {
      SoftballTeam.resetTeamCount();
      String[] args2 = {"softball_player_data1.csv"};
      SoftballPlayersPart2.main(args2);
      Assert.assertEquals("Team count should be 1", 1, 
         SoftballTeam.getTeamCount());
   }
}
