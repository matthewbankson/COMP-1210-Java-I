import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*This program is to test the RatingComparator class method.
*
*Project 10
*@author Matthew Bankson
*@version April 16, 2019
*/
public class RatingComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   *Test of compare() method.
   */
   @Test public void compare() {
      Outfielder test1 = new Outfielder("34", "Bo Jackson", 
         "RF", 1.5, .450, .9);
      Outfielder test2 = new Outfielder("02", "Cam Newton", 
         "LF", 2.0, .333, .8);
      Outfielder test3 = new Outfielder("45", "Jason Campbell", 
         "LF", 2.0, .333, .8);
      RatingComparator testRating = new RatingComparator();
      Assert.assertEquals("compare less than test", -7470, 
         testRating.compare(test1, test2));
      Assert.assertEquals("compare greater than test", 7470, 
         testRating.compare(test2, test1));
      Assert.assertEquals("compare equals", 0, 
         testRating.compare(test2, test3));
   }
}
