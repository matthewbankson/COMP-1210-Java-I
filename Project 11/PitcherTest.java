import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*This program tests the methods of the Pitcher class.
*
*Project 11
*@author Matthew Bankson
*@version April 22, 2019
*/
public class PitcherTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   *Test of the getters methods.
   */
   @Test public void gettersTest() {
      Pitcher p = new Pitcher("34", "Bo", "RHP", 2.0,
         .333, 10, 5, 2.43);
      Assert.assertEquals("getWins test", 10, p.getWins());
      Assert.assertEquals("getLosses test", 5, p.getLosses());
      Assert.assertEquals("getEra test", 2.43, p.getEra(), .000001);
   }
   
   /**
   *Test of the setters methods.
   */
   @Test public void settersTest() {
      Pitcher p = new Pitcher("34", "Bo", "RHP", 2.0,
         .333, 10, 5, 2.43);
      p.setWins(12);
      p.setLosses(7);
      p.setEra(3.12);
      Assert.assertEquals("setWins test", 12, p.getWins());
      Assert.assertEquals("setLosses test", 7, p.getLosses());
      Assert.assertEquals("setEra test", 3.12, p.getEra(), .000001);
   }
   
   /**
   *Test of the rating() method.
   */
   @Test public void ratingTest() {
      Pitcher p = new Pitcher("34", "Bo", "RHP", 2.0,
         .333, 10, 5, 2.43);
      Assert.assertEquals("rating test", 1.16618, p.rating(), .000001);
   }
   
   /**
   *Test of the stats() method.
   */
   @Test public void statsTest() {
      Pitcher p = new Pitcher("34", "Bo", "RHP", 2.0,
         .333, 10, 5, 2.43);
      Assert.assertTrue("stats test", p.stats().contains("10 wins, "
         + "5 losses, 2.43 ERA"));
   }
}
