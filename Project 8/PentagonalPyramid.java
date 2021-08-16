import java.text.DecimalFormat;
/**
*This program creates the Pentagonal Pyramid
*class and defines its methods.
*
*Project 8
*@author Matthew Bankson
*@version March 20, 2019
*/
public class PentagonalPyramid {
//Fields
   private String label = "";
   private double edge = 0.0, height = 0.0;
   private static int count = 0;
   
   //constructor
   /**
   *Creates the PentagonalPyramid object.
   *@param labelIn for label
   *@param edgeIn for edge
   *@param heightIn for height
   */
   public PentagonalPyramid(String labelIn, double edgeIn, double heightIn) {
      setLabel(labelIn);
      setBaseEdge(edgeIn);
      setHeight(heightIn);
      count++;
   }
  
   //methods
   /**
   *Gets the String label.
   *@return label
   */
   public String getLabel() {
      return label;
   }
   /**
   *Sets label if it is not null.
   *@param labelIn for label
   *@return setLabel
   */
   public boolean setLabel(String labelIn) {
      boolean setLabel = false;
      if (labelIn != null) {
         labelIn.trim();
         label = labelIn;
         setLabel = true;
      }
      return setLabel;
   }
   /**
   *Gets the value for edge.
   *@return edge
   */
   public double getBaseEdge() {
      return edge;
   }
   /**
   *Sets edge if greater than zero.
   *@param edgeIn for edge
   *@return setBaseEdge
   */
   public boolean setBaseEdge(double edgeIn) {
      boolean setBaseEdge = false;
      if (edgeIn > 0) {
         edge = edgeIn;
         setBaseEdge = true;
      }
      return setBaseEdge;
   }
   /**
   *Gets value for height.
   *@return height
   */
   public double getHeight() {
      return height;
   }
   /**
   *Sets height if it is greater than zero.
   *@param heightIn for height
   *@return setHeight
   */
   public boolean setHeight(double heightIn) {
      boolean setHeight = false;
      if (heightIn > 0) {
         height = heightIn;
         setHeight = true;
      }
      return setHeight;
   }
   /**
   *Calculates the surface area of a pentagonal pyramid.
   *@return area
   */
   public double surfaceArea() {
      double left = 0.0, right = 0.0, fraction = 0.0, area = 0.0;
      left = (5.0 / 4.0) * Math.tan(Math.toRadians(54)) * Math.pow(edge, 2.0);
      fraction = edge * Math.tan(Math.toRadians(54)) / 2.0;
      right = (5.0 * edge / 2.0)
         * Math.sqrt(Math.pow(height, 2.0) + Math.pow(fraction, 2.0));
      area = left + right;
      return area;
   }
   /**
   *Calculates the volume of a pentagonal pyramid.
   *@return volume
   */
   public double volume() {
      double volume = 0.0;
      volume = (5.0 / 12.0) * Math.tan(Math.toRadians(54))
         * height * Math.pow(edge, 2.0);
      return volume;
   }
   /**
   *Converts information about pyramid into a string.
   *@return output
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0######");
      String output = "";
      output = "PentagonalPyramid \"" + label + "\" with base edge = " + edge
         + " and height = " + height + " units has:\n\tsurface area = "
         + df.format(surfaceArea()) + " square units\n\tvolume = "
         + df.format(volume()) + " cubic units";
      return output;
   }
   
   /**
   *Returns the number of PentagonalPyramids created.
   *@return count
   */
   public static int getCount() {
      return count;
   }
   
   /**
   *Resets count to zero.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   *Determines is corresponding edge and height are equal.
   *@param obj for PentagonalPyramid to compare
   *@return true if corresponding sides are equal
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof PentagonalPyramid)) {
         return false;
      }
      else {
         PentagonalPyramid d = (PentagonalPyramid) obj;
         return (label.equalsIgnoreCase(d.getLabel()))
            && (Math.abs(edge - d.getBaseEdge()) < 0.000001)
            && (Math.abs(height - d.getHeight()) < 0.000001);
      }
   }
   
   /**
   *@return 0 for no hashcode
   */
   public int hashCode() {
      return 0;
   }
}