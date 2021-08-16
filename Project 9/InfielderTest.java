import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*This program is to test the methods of the
*Infielders class.
*
*Project 9
*@author Matthew Bankson
*@version April 9, 2019
*/
public class InfielderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   *Test of the getInfielderFieldingAvg() method.
   */
   @Test public void getInfielderFieldingAvg() {
      Infielder i = new Infielder("34", "Bo", "1B", 2.0,
         .333, .8);
      Assert.assertEquals("getInfielderFieldingAvg test", .8, 
         i.getInfielderFieldingAvg(), .000001);
   }
   
   /**
   *Test of the setInfielderFieldingAvg() method.
   */
   @Test public void setInfielderFieldingAvgTest() {
      Infielder i = new Infielder("34", "Bo", "1B", 2.0,
         .333, .8);
      i.setInfielderFieldingAvg(.6);
      Assert.assertEquals("setInfielderFieldingAvg test", .6, 
         i.getInfielderFieldingAvg(), .000001);
   }
   
   /**
   *Test of the rating() method.
   */
   @Test public void ratingTest() {
      Infielder i = new Infielder("34", "Bo", "1B", 2.0,
         .333, .8);
      Assert.assertEquals("rating test", 5.328, i.rating(), .000001);
   }
}
