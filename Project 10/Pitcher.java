/**
*This program defines the Pitcher class
*and its methods.
*
*Project 10
*@author Matthew Bankson
*@version April 10, 2019
*/
public class Pitcher extends SoftballPlayer {
//Fields
   protected int wins;
   protected int losses;
   protected double era;
   
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
   */
   public Pitcher(String numberIn, String nameIn, String positionIn, 
      double specializationIn, double battingIn, int winsIn, int lossesIn,
      double eraIn) {
      super(numberIn, nameIn, positionIn, specializationIn, battingIn);
      wins = winsIn;
      losses = lossesIn;
      era = eraIn;
   }
   
   //Methods
   /**
   *Gets number of wins.
   *@return wins
   */
   public int getWins() {
      return wins;
   }
   
   /**
   *Sets number of wins.
   *@param winsIn for wins
   */
   public void setWins(int winsIn) {
      wins = winsIn;
   }
   
   /**
   *Gets number of losses.
   *@return losses
   */
   public int getLosses() {
      return losses;
   }
   
   /**
   *Sets number of losses.
   *@param lossesIn for losses
   */
   public void setLosses(int lossesIn) {
      losses = lossesIn;
   }
   
   /**
   *Gets era.
   *@return era
   */
   public double getEra() {
      return era;
   }
   
   /**
   *Sets era.
   *@param eraIn for era
   */
   public void setEra(double eraIn) {
      era = eraIn;
   }
   
   /**
   *Calculates rating of pitcher.
   *@return rating
   */
   public double rating() {
      return BASE_RATING * specialization 
         * (1 / (1 + era)) * ((wins - losses) / 25.0);
   }
   
   /**
   *Makes string of pitcher's stats.
   *@return stats of pitcher
   */
   public String stats() {
      return wins + " wins, " + losses + " losses, " + era + " ERA";
   }
}