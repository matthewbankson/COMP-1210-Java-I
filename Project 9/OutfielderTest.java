import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*This program is to test the methods of the
*SoftballPlayer and Outfielder classes.
*
*Project 9
*@author Matthew Bankson
*@version April 3, 2019
*/
public class OutfielderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   *Test of the getter methods.
   */
   @Test public void gettersTest() {
      Outfielder o = new Outfielder("34", "Bo", "LF", 2.0,
         .333, .8);
      Assert.assertEquals("getNumber test", "34", o.getNumber());
      Assert.assertEquals("getName test", "Bo", o.getName());
      Assert.assertEquals("getPosition test", "LF", o.getPosition());
      Assert.assertEquals("getBattingAvg test", .333, 
         o.getBattingAvg(), .000001);
      Assert.assertEquals("getSpecializationFactor test", 2.0, 
         o.getSpecializationFactor(), .000001);
      Assert.assertEquals("getCount test", 4, SoftballPlayer.getCount());
      Assert.assertEquals("getOutfielderFieldingAvg test", .8, 
         o.getOutfielderFieldingAvg(), .000001);
   }
   
   /**
   *Test of the setter methods.
   */
   @Test public void settersTest() {
      Outfielder o = new Outfielder("34", "Bo", "LF", 2.0,
         .333, .8);
         
      o.setNumber("2");
      o.setName("Cam");
      o.setPosition("RF");
      o.setBattingAvg(.275);
      o.setSpecializationFactor(1.0);
      o.setOutfielderFieldingAvg(.6);
      
      Assert.assertEquals("setNumber test", "2", o.getNumber());
      Assert.assertEquals("setName test", "Cam", o.getName());
      Assert.assertEquals("setPosition test", "RF", o.getPosition());
      Assert.assertEquals("setBattingAvg test", .275, 
         o.getBattingAvg(), .000001);
      Assert.assertEquals("setSpecializationFactor test", 1.0, 
         o.getSpecializationFactor(), .000001);
      Assert.assertEquals("setOutfielderFieldingAvg test", .6, 
         o.getOutfielderFieldingAvg(), .000001);
   }
   
   /**
   *Test of the resetCount() method.
   */
   @Test public void resetCountTest() {
      Outfielder o = new Outfielder("34", "Bo", "LF", 2.0,
         .333, .8);
      SoftballPlayer.resetCount();
      Assert.assertEquals("resetCount test", 0, o.getCount());
   }
   
   /**
   *Test of the stats() method.
   */
   @Test public void statsTest() {
      Outfielder o = new Outfielder("34", "Bo", "LF", 2.0,
         .333, .8);
      Assert.assertEquals("stats test", ".333", o.stats());
   }
   
   /**
   *Test of the toString() method.
   */
   @Test public void toStringTest() {
      Outfielder o = new Outfielder("34", "Bo", "LF", 2.0,
         .333, .8);
      Assert.assertTrue("toString test", o.toString().contains("34 Bo (LF)"));
   }
   
   /**
   *Test of the rating() method.
   */
   @Test public void ratingTest() {
      Outfielder o = new Outfielder("34", "Bo", "LF", 2.0,
         .333, .8);
      Assert.assertEquals("rating test", 5.328, o.rating(), .000001);
   }
}
