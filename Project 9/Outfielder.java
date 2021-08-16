/**
*This program defines the child Outfielder class
*and its methods.
*
*Project 9
*@author Matthew Bankson
*@version April 3, 2019
*/
public class Outfielder extends SoftballPlayer {
//Fields
   private double outfielderFieldingAvg;
   
   //Constructor
   /**
   *Creates an Outfielder object.
   *@param numberIn for number
   *@param nameIn for name
   *@param positionIn for position
   *@param specializationIn for specialization
   *@param battingIn for batting
   *@param fieldingIn for outfielderFieldingAvg
   */
   public Outfielder(String numberIn, String nameIn, String positionIn, 
      double specializationIn, double battingIn, double fieldingIn) {
      super(numberIn, nameIn, positionIn, specializationIn, battingIn);
      outfielderFieldingAvg = fieldingIn;
   }
   
   //Methods
   /**
   *Gets fielding avg for player.
   *@return outfielderFieldingAvg
   */
   public double getOutfielderFieldingAvg() {
      return outfielderFieldingAvg;
   }
   
   /**
   *Sets fielding avg of player.
   *@param fieldingIn for outfielderFieldingAvg
   */
   public void setOutfielderFieldingAvg(double fieldingIn) {
      outfielderFieldingAvg = fieldingIn;
   }
   
   /**
   *Calculates the rating of an Outfielder.
   *@return rating
   */
   public double rating() {
      return BASE_RATING * specialization * batting * outfielderFieldingAvg;
   }
}