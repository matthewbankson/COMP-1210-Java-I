/**
*This program defines the child Infielder class
*and its methods.
*
*Project 10
*@author Matthew Bankson
*@version April 10, 2019
*/
public class Infielder extends SoftballPlayer {
//Fields
   private double infielderFieldingAvg;
   
   //Constructor
   /**
   *Creates an Outfielder object.
   *@param numberIn for number
   *@param nameIn for name
   *@param positionIn for position
   *@param specializationIn for specialization
   *@param battingIn for batting
   *@param fieldingIn for infielderFieldingAvg
   */
   public Infielder(String numberIn, String nameIn, String positionIn, 
      double specializationIn, double battingIn, double fieldingIn) {
      super(numberIn, nameIn, positionIn, specializationIn, battingIn);
      infielderFieldingAvg = fieldingIn;
   }
   
   //Methods
   /**
   *Gets fielding avg for player.
   *@return infielderFieldingAvg
   */
   public double getInfielderFieldingAvg() {
      return infielderFieldingAvg;
   }
   
   /**
   *Sets fielding avg of player.
   *@param fieldingIn for infielderFieldingAvg
   */
   public void setInfielderFieldingAvg(double fieldingIn) {
      infielderFieldingAvg = fieldingIn;
   }
   
   /**
   *Calculates the rating of an Infielder.
   *@return rating
   */
   public double rating() {
      return BASE_RATING * specialization * batting * infielderFieldingAvg;
   }
}