import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*Tests PentagonalPyramid class.
*
*Project 8
*@author Matthew Bankson
*@version March 20, 2019
*/
public class PentagonalPyramidTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
   *Test of getter methods.
   */
   @Test public void gettersTest() {
      PentagonalPyramid p = new PentagonalPyramid("Label", 5.0, 7.0);
      Assert.assertEquals("getLabel test", "Label", p.getLabel());
      Assert.assertEquals("getBaseEdge test", 5.0, p.getBaseEdge(), .000001);
      Assert.assertEquals("getHeight test", 7.0, p.getHeight(), .000001);
   }
   
   /**
   *Test of setter methods.
   */
   @Test public void settersTest() {
      PentagonalPyramid p = new PentagonalPyramid("Label", 5.0, 7.0);
      
      Assert.assertEquals("setLabel test true", true, p.setLabel("Test"));
      Assert.assertEquals("setLabel test false", false, p.setLabel(null));
      
      Assert.assertEquals("setBaseEdge test true", true, p.setBaseEdge(2.0));
      Assert.assertEquals("setBaseEdge test false", false, p.setBaseEdge(0));
      
      Assert.assertEquals("setHeight test true", true, p.setHeight(10.0));
      Assert.assertEquals("setHeight test false", false, p.setHeight(0));
   }
   
   /**
   *Test of surfaceArea() method.
   */
   @Test public void surfaceAreaTest() {
      PentagonalPyramid p = new PentagonalPyramid("Label", 5.0, 7.0);
   
      Assert.assertEquals("surfaceArea test", 140.512, p.surfaceArea(), .001);
   }
   
   /**
   *Test of volume() method.
   */
   @Test public void volume() {
      PentagonalPyramid p = new PentagonalPyramid("Label", 5.0, 7.0);
   
      Assert.assertEquals("volume test", 100.361, p.volume(), .001);
   }
   
   
   /**
   *Test of toString() method.
   */
   @Test public void toStringTest() {
      PentagonalPyramid p = new PentagonalPyramid("Label", 5.0, 7.0);
   
      Assert.assertEquals("toString test", true, 
         p.toString().contains("\"Label\" with base edge = "
         + "5.0 and height = 7.0"));
   }
   
   
   /**
   *Test of getCount method.
   */
   @Test public void getCountTest() {
      PentagonalPyramid p = new PentagonalPyramid("Label", 5.0, 7.0);
   
      Assert.assertEquals("getCount test", 60, PentagonalPyramid.getCount());
   }
   
   /**
   *Test of resetCount() method.
   */
   @Test public void resetCountTest() {
      PentagonalPyramid p = new PentagonalPyramid("Label", 5.0, 7.0);
      PentagonalPyramid.resetCount();
      
      Assert.assertEquals("resetCount test", 0, PentagonalPyramid.getCount());
   }
   
   /**
   *Test of equals() method.
   */
   @Test public void equalsTest() {
      PentagonalPyramid p = new PentagonalPyramid("Label", 5.0, 7.0);
      PentagonalPyramid p2 = new PentagonalPyramid("Label", 5.0, 7.0);
      
      Assert.assertEquals("equals test", true, p.equals(p2));
      
      p2 = new PentagonalPyramid("Test", 5.0, 7.0);
      Assert.assertEquals("equals test", false, p.equals(p2));
      
      p2 = new PentagonalPyramid("Label", 1.0, 7.0);
      Assert.assertEquals("equals test", false, p.equals(p2));
      
      p2 = new PentagonalPyramid("Label", 5.0, 1.0);
      Assert.assertEquals("equals test", false, p.equals(p2));
      
      Assert.assertEquals("equals test", false, p.equals("obj"));
      
      Assert.assertEquals("equals test", 0, p.hashCode());
      
   }
}
