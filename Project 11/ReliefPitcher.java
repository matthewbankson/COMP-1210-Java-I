/**
*This program defines the Pitcher class
*and its methods.
*
*Project 11
*@author Matthew Bankson
*@version April 22, 2019
*/
public class ReliefPitcher extends Pitcher {
//Fields
   private int saves;
   
   //Constructor
   /**
   *Creats a Pitcher object.
   *@param numberIn for number
   *@param nameIn for name
   *@param positionIn for position
   *@param specializationIn for specialization
   *@param battingIn for batting
   *@param winsIn for wins
   *@param lossesIn for losses
   *@param eraIn for era
   *@param savesIn for saves
   */
   public ReliefPitcher(String numberIn, String nameIn, String positionIn, 
      double specializationIn, double battingIn, int winsIn, int lossesIn,
      double eraIn, int savesIn) {
      super(numberIn, nameIn, positionIn, specializationIn, battingIn,
         winsIn, lossesIn, eraIn);
      saves = savesIn;
   }
   
   //Methods
   /**
   *Gets number of saves.
   *@return saves
   */
   public int getSaves() {
      return saves;
   }
   
   /**
   *Sets number of saves.
   *@param savesIn for saves
   */
   public void setSaves(int savesIn) {
      saves = savesIn;
   }
   
   /**
   *Calculates rating of relief pitcher.
   *@return rating
   */
   public double rating() {
      return BASE_RATING * specialization
         * (1 / (1 + era)) * ((wins - losses + saves) / 30.0);
   }
   
   /**
   *Makes string of relief pitcher's stats.
   *@return stats of relief pitcher
   */
   public String stats() {
      return wins + " wins, " + losses + " losses, " 
         + saves + " saves, " + era + " ERA";
   }
}