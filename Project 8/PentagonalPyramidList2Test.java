import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
*This program tests the PentagonalPyramidList2 classes' methods.
*
*Project 8
*@author Matthew Bankson
*@version March 27, 2019
*/
public class PentagonalPyramidList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   *Tests getName() method.
   */
   @Test public void getNameTest() {
      PentagonalPyramid[] ppArray = new PentagonalPyramid[20];
      
      ppArray[0] = new PentagonalPyramid("Test1", 5.0, 7.0);
      ppArray[1] = new PentagonalPyramid("Test2", 4.0, 6.0);
      ppArray[2] = new PentagonalPyramid("Test3", 3.0, 5.0);
      
      PentagonalPyramidList2 ppList = new PentagonalPyramidList2("Test List",
         ppArray, 3);
      
      Assert.assertEquals("getName Test", "Test List", ppList.getName());
   }
   
   /**
   *Tests numberOfPentagonalPyramids() method.
   */
   @Test public void numberOfPentagonalPyramidsTest() {
      PentagonalPyramid[] ppArray = new PentagonalPyramid[20];
      
      ppArray[0] = new PentagonalPyramid("Test1", 5.0, 7.0);
      ppArray[1] = new PentagonalPyramid("Test2", 4.0, 6.0);
      ppArray[2] = new PentagonalPyramid("Test3", 3.0, 5.0);
      
      PentagonalPyramidList2 ppList = new PentagonalPyramidList2("Test List",
         ppArray, 3);
         
      Assert.assertEquals("numberOfPentagonalPyramids Test",
         3, ppList.numberOfPentagonalPyramids());
   }
   
   /**
   *Tests total methods.
   */
   @Test public void totalsTest() {
      PentagonalPyramid[] ppArray = new PentagonalPyramid[20];
      
      ppArray[0] = new PentagonalPyramid("Test1", 5.0, 7.0);
      ppArray[1] = new PentagonalPyramid("Test2", 4.0, 6.0);
      ppArray[2] = new PentagonalPyramid("Test3", 3.0, 5.0);
      
      PentagonalPyramidList2 ppList = new PentagonalPyramidList2("Test List",
         ppArray, 3);
         
      PentagonalPyramidList2 ppList2 = new PentagonalPyramidList2("Test2",
         null, 0);
         
      Assert.assertEquals("totalSurfaceArea Test", 290.1085,
         ppList.totalSurfaceArea(), .001);
      
      Assert.assertEquals("totalVolume Test", 181.2236,
         ppList.totalVolume(), .001);
         
      Assert.assertEquals("totalSurfaceArea Test", 0,
         ppList2.totalSurfaceArea(), .001);
         
      Assert.assertEquals("totalVolume Test", 0,
         ppList2.totalVolume(), .001);
   }
   
   /**
   *Tests average methods.
   */
   @Test public void averagesTest() {
      PentagonalPyramid[] ppArray = new PentagonalPyramid[20];
      
      ppArray[0] = new PentagonalPyramid("Test1", 5.0, 7.0);
      ppArray[1] = new PentagonalPyramid("Test2", 4.0, 6.0);
      ppArray[2] = new PentagonalPyramid("Test3", 3.0, 5.0);
      
      PentagonalPyramidList2 ppList = new PentagonalPyramidList2("Test List",
         ppArray, 3);
         
      PentagonalPyramidList2 ppList2 = new PentagonalPyramidList2("Test2",
         null, 0);
         
      Assert.assertEquals("averageSurfaceArea Test", 96.7028,
         ppList.averageSurfaceArea(), .001);
         
      Assert.assertEquals("averageVolume Test", 60.4079,
         ppList.averageVolume(), .001);
         
      Assert.assertEquals("averageSurfaceArea Test", 0,
         ppList2.averageSurfaceArea(), .001);
         
      Assert.assertEquals("averageVolume Test", 0,
         ppList2.averageVolume(), .001);
   }
   
   /**
   *Tests toString() method.
   */
   @Test public void toStringTest() {
      PentagonalPyramid[] ppArray = new PentagonalPyramid[20];
      
      ppArray[0] = new PentagonalPyramid("Test1", 5.0, 7.0);
      ppArray[1] = new PentagonalPyramid("Test2", 4.0, 6.0);
      ppArray[2] = new PentagonalPyramid("Test3", 3.0, 5.0);
      
      PentagonalPyramidList2 ppList = new PentagonalPyramidList2("Test List",
         ppArray, 3);
         
      Assert.assertEquals("toString Test", true, 
         ppList.toString().contains("Test List"));
   }
   
   /**
   *Tests summaryInfo() method.
   */
   @Test public void summaryInfoTest() {
      PentagonalPyramid[] ppArray = new PentagonalPyramid[20];
      
      ppArray[0] = new PentagonalPyramid("Test1", 5.0, 7.0);
      ppArray[1] = new PentagonalPyramid("Test2", 4.0, 6.0);
      ppArray[2] = new PentagonalPyramid("Test3", 3.0, 5.0);
      
      PentagonalPyramidList2 ppList = new PentagonalPyramidList2("Test List",
         ppArray, 3);
         
      Assert.assertEquals("summaryInfo Test", true, 
         ppList.summaryInfo().contains("Number of PentagonalPyramid: 3"));
   }
   
   /**
   *Tests getList() method.
   */
   @Test public void getListTest() {
      PentagonalPyramid[] ppArray = new PentagonalPyramid[20];
      
      ppArray[0] = new PentagonalPyramid("Test1", 5.0, 7.0);
      ppArray[1] = new PentagonalPyramid("Test2", 4.0, 6.0);
      ppArray[2] = new PentagonalPyramid("Test3", 3.0, 5.0);
      
      PentagonalPyramidList2 ppList = new PentagonalPyramidList2("Test List",
         ppArray, 3);
         
      Assert.assertArrayEquals("getList Test", ppArray, ppList.getList());
   }
   
   /**
   *Tests readFile() method.
   *@throws IOException for reading a file.
   */
   @Test public void readFileTest() throws IOException {
      PentagonalPyramid[] ppArray = new PentagonalPyramid[20];
      
      ppArray[0] = new PentagonalPyramid("Test1", 5.0, 7.0);
      ppArray[1] = new PentagonalPyramid("Test2", 4.0, 6.0);
      ppArray[2] = new PentagonalPyramid("Test3", 3.0, 5.0);
      
      PentagonalPyramidList2 ppList = new PentagonalPyramidList2("Test List",
         null, 0);
      ppList = ppList.readFile("PentagonalPyramid_data_1.txt");
         
      Assert.assertEquals("readFile Test", "PentagonalPyramid Test List",
         ppList.getName());
   }
   
   /**
   *Tests addPentagonalPyramid() method.
   */
   @Test public void addPentagonalPyramidTest() {
      PentagonalPyramid[] ppArray = new PentagonalPyramid[20];
      
      ppArray[0] = new PentagonalPyramid("Test1", 5.0, 7.0);
      ppArray[1] = new PentagonalPyramid("Test2", 4.0, 6.0);
      ppArray[2] = new PentagonalPyramid("Test3", 3.0, 5.0);
      
      PentagonalPyramidList2 ppList = new PentagonalPyramidList2("Test List",
         ppArray, 3);
         
      PentagonalPyramid p = new PentagonalPyramid("Test", 8.0, 9.0);
      ppList.addPentagonalPyramid("Test", 8.0, 9.0);
      PentagonalPyramid[] ppA = ppList.getList();
      
      Assert.assertEquals("addPentagonalPyramid Test", p, ppA[3]);
   }
   
   /**
   *Tests findPentagonalPyramid() method.
   */
   @Test public void findPentagonalPyramidTest() {
      PentagonalPyramid[] ppArray = new PentagonalPyramid[20];
      
      ppArray[0] = new PentagonalPyramid("Test1", 5.0, 7.0);
      ppArray[1] = new PentagonalPyramid("Test2", 4.0, 6.0);
      ppArray[2] = new PentagonalPyramid("Test3", 3.0, 5.0);
      
      PentagonalPyramidList2 ppList = new PentagonalPyramidList2("Test List",
         ppArray, 3);
   
      Assert.assertEquals("findPentagonalPyramid Test", ppArray[0],
         ppList.findPentagonalPyramid("Test1"));
   }
   
   /**
   *Tests deletePentagonalPyramid() method.
   */
   @Test public void deletePentagonalPyramidTest() {
      PentagonalPyramid[] ppArray = new PentagonalPyramid[20];
      
      ppArray[0] = new PentagonalPyramid("Test1", 5.0, 7.0);
      ppArray[1] = new PentagonalPyramid("Test2", 4.0, 6.0);
      ppArray[2] = new PentagonalPyramid("Test3", 3.0, 5.0);
      
      PentagonalPyramidList2 ppList = new PentagonalPyramidList2("Test List",
         ppArray, 3);
      PentagonalPyramid p = ppList.deletePentagonalPyramid("Test1");
      Assert.assertEquals("deletePentagonalPyramid Test", null,
         ppList.findPentagonalPyramid("Test1"));
      Assert.assertEquals("deletePentagonalPyramid null Test",
         null, ppList.deletePentagonalPyramid("Test20"));
   }
   
   /**
   *Tests editPentagonalPyramid() method.
   */
   @Test public void editPentagonalPyramidTest() {
      PentagonalPyramid[] ppArray = new PentagonalPyramid[20];
      
      ppArray[0] = new PentagonalPyramid("Test1", 5.0, 7.0);
      ppArray[1] = new PentagonalPyramid("Test2", 4.0, 6.0);
      ppArray[2] = new PentagonalPyramid("Test3", 3.0, 5.0);
      
      PentagonalPyramidList2 ppList = new PentagonalPyramidList2("Test List",
         ppArray, 3);
         
      PentagonalPyramid p = new PentagonalPyramid("Test1", 6.0, 8.0);
      
      Assert.assertFalse("editPentagonalPyramid false Test", 
         ppList.editPentagonalPyramid("Test4", 5.0, 6.0));
      
      Assert.assertTrue("editPentagonalPyramid true Test", 
         ppList.editPentagonalPyramid("Test1", 6.0, 8.0));
      
      Assert.assertEquals("editPentagonalPyramid equal Test", p, ppArray[0]);
   }
   
   /**
   *Tests findPentagonalPyramidWithShortestBaseEdge() method.
   */
   @Test public void findPentagonalPyramidWithShortestBaseEdgeTest() {
      PentagonalPyramid[] ppArray = new PentagonalPyramid[20];
      
      ppArray[0] = new PentagonalPyramid("Test1", 5.0, 7.0);
      ppArray[1] = new PentagonalPyramid("Test2", 4.0, 6.0);
      ppArray[2] = new PentagonalPyramid("Test3", 3.0, 5.0);
      
      PentagonalPyramidList2 ppList = new PentagonalPyramidList2("Test List",
         ppArray, 3);
         
      PentagonalPyramidList2 ppList2 = new PentagonalPyramidList2("Test2",
         null, 0);
   
      Assert.assertEquals("ShortestBaseEdge Test", ppArray[2], 
         ppList.findPentagonalPyramidWithShortestBaseEdge());
         
      Assert.assertEquals("ShortestBaseEdge null Test", null, 
         ppList2.findPentagonalPyramidWithShortestBaseEdge());
   }
   
   /**
   *Tests findPentagonalPyramidWithLongestBaseEdge() method.
   */
   @Test public void findPentagonalPyramidWithLongestBaseEdgeTest() {
      PentagonalPyramid[] ppArray = new PentagonalPyramid[20];
      
      ppArray[0] = new PentagonalPyramid("Test1", 5.0, 7.0);
      ppArray[1] = new PentagonalPyramid("Test2", 4.0, 6.0);
      ppArray[2] = new PentagonalPyramid("Test3", 3.0, 5.0);
      
      PentagonalPyramidList2 ppList = new PentagonalPyramidList2("Test List",
         ppArray, 3);
         
      PentagonalPyramidList2 ppList2 = new PentagonalPyramidList2("Test2",
         null, 0);
   
      Assert.assertEquals("LongestBaseEdge Test", ppArray[0], 
         ppList.findPentagonalPyramidWithLongestBaseEdge());
         
      Assert.assertEquals("LongestBaseEdge null Test", null, 
         ppList2.findPentagonalPyramidWithLongestBaseEdge());
   }
   
   /**
   *Tests findPentagonalPyramidWithSmallestVolume() method.
   */
   @Test public void findPentagonalPyramidWithSmallestVolumeTest() {
      PentagonalPyramid[] ppArray = new PentagonalPyramid[20];
      
      ppArray[0] = new PentagonalPyramid("Test1", 5.0, 7.0);
      ppArray[1] = new PentagonalPyramid("Test2", 4.0, 6.0);
      ppArray[2] = new PentagonalPyramid("Test3", 3.0, 5.0);
      
      PentagonalPyramidList2 ppList = new PentagonalPyramidList2("Test List",
         ppArray, 3);
         
      PentagonalPyramidList2 ppList2 = new PentagonalPyramidList2("Test2",
         null, 0);
   
      Assert.assertEquals("SmallestVolume Test", ppArray[2], 
         ppList.findPentagonalPyramidWithSmallestVolume());
         
      Assert.assertEquals("SmallestVolume null Test", null, 
         ppList2.findPentagonalPyramidWithSmallestVolume());
   }
   
   /**
   *Tests findPentagonalPyramidWithLargestVolume() method.
   */
   @Test public void findPentagonalPyramidWithLargestVolumeTest() {
      PentagonalPyramid[] ppArray = new PentagonalPyramid[20];
      
      ppArray[0] = new PentagonalPyramid("Test1", 5.0, 7.0);
      ppArray[1] = new PentagonalPyramid("Test2", 4.0, 6.0);
      ppArray[2] = new PentagonalPyramid("Test3", 3.0, 5.0);
      
      PentagonalPyramidList2 ppList = new PentagonalPyramidList2("Test List",
         ppArray, 3);
         
      PentagonalPyramidList2 ppList2 = new PentagonalPyramidList2("Test2",
         null, 0);
   
      Assert.assertEquals("LargestVolume Test", ppArray[0], 
         ppList.findPentagonalPyramidWithLargestVolume());
         
      Assert.assertEquals("LargestVolume null Test", null, 
         ppList2.findPentagonalPyramidWithLargestVolume());
   }
}
