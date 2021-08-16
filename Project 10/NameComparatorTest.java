import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*This program is to test the NameComparator class method.
*
*Project 10
*@author Matthew Bankson
*@version April 16, 2019
*/
public class NameComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   *Test of the compare() method.
   */
   @Test public void compareTest() {
      Outfielder test1 = new Outfielder("34", "Bo Jackson", 
         "RF", 2.0, .333, .8);
      Outfielder test2 = new Outfielder("02", "Cam Newton", 
         "LF", 2.0, .333, .8);
      Outfielder test3 = new Outfielder("45", "Cam Newton", 
         "LF", 2.0, .333, .8);
      NameComparator testName = new NameComparator();
      
      Assert.assertEquals("compare test less than", -4, 
         testName.compare(test1, test2));
      Assert.assertEquals("compare test greater than", 4, 
         testName.compare(test2, test1));
      Assert.assertEquals("compare test equal to", 0, 
         testName.compare(test2, test3));
   }
}
