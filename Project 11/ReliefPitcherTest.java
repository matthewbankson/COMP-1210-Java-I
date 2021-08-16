import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*This program is to test the methods of the ReliefPitcher class.
*
*Project 11
*@author Matthew Bankson
*@version April 22, 2019
*/
public class ReliefPitcherTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   *Test of the getSaves() method.
   */
   @Test public void getSavesTest() {
      ReliefPitcher rp = new ReliefPitcher("34", "Bo", "RHP", 2.0,
         .333, 10, 5, 2.43, 7);
      Assert.assertEquals("getSaves test", 7, rp.getSaves());
   }
   
   /**
   *Test of the setSaves() method.
   */
   @Test public void setSavesTest() {
      ReliefPitcher rp = new ReliefPitcher("34", "Bo", "RHP", 2.0,
         .333, 10, 5, 2.43, 7);
      rp.setSaves(9);
      Assert.assertEquals("setSaves test", 9, rp.getSaves());
   }
   
   /**
   *Test of the rating() method.
   */
   @Test public void ratingTest() {
      ReliefPitcher rp = new ReliefPitcher("34", "Bo", "RHP", 2.0,
         .333, 10, 5, 2.43, 7);
      Assert.assertEquals("rating test", 2.3323615, rp.rating(), .000001);
   }
   
   /**
   *Test of the stats() method.
   */
   @Test public void statsTest() {
      ReliefPitcher rp = new ReliefPitcher("34", "Bo", "RHP", 2.0,
         .333, 10, 5, 2.43, 7);
      Assert.assertTrue("stats test", rp.stats().contains("10 wins, "
         + "5 losses, 7 saves, 2.43 ERA"));
   }
}
