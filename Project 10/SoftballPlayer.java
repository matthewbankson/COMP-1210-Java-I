import java.text.DecimalFormat;
/**
*This program defins the SoftballPlayer parent
*class and its methods.
*
*Project 10
*@author Matthew Bankson
*@version April 10, 2019
*/
public abstract class SoftballPlayer implements Comparable<SoftballPlayer> {
//Fields
   protected String number;
   protected String name;
   protected String position;
   protected double specialization;
   protected double batting;
   protected static int count = 0;
   /**
   *Base rating for all SoftballPlayers.
   */
   public static final int BASE_RATING = 10;
   
   //Constructor
   /**
   *Creates a SoftballPlayer object.
   *@param numberIn for number
   *@param nameIn for name
   *@param positionIn for position
   *@param specializationIn for specialization
   *@param battingIn for batting
   */
   public SoftballPlayer(String numberIn, String nameIn, 
      String positionIn, double specializationIn, double battingIn) {
      number = numberIn;
      name = nameIn;
      position = positionIn;
      specialization = specializationIn;
      batting = battingIn;
      count++;
   }
   
   //Methods
   /**
   *Gets number of player.
   *@return number
   */
   public String getNumber() {
      return number;
   }
   
   /**
   *Sets number of player.
   *@param numberIn for number
   */
   public void setNumber(String numberIn) {
      number = numberIn;
   }
   
   /**
   *Gets name of player.
   *@return name
   */
   public String getName() {
      return name;
   }
   
   /**
   *Sets name of player.
   *@param nameIn for name
   */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
   *Gets position of player.
   *@return position
   */
   public String getPosition() {
      return position;
   }
   
   /**
   *Sets position of player.
   *@param positionIn for position
   */
   public void setPosition(String positionIn) {
      position = positionIn;
   }
   
   /**
   *Gets batting average of player.
   *@return batting
   */
   public double getBattingAvg() {
      return batting;
   }
   
   /**
   *Sets batting average of player.
   *@param battingIn for batting
   */
   public void setBattingAvg(double battingIn) {
      batting = battingIn;
   }
   
   /**
   *Gets specialization factor of player.
   *@return specialization
   */
   public double getSpecializationFactor() {
      return specialization;
   }
   
   /**
   *Sets specialization factor of player.
   *@param specializationIn for specialization
   */
   public void setSpecializationFactor(double specializationIn) {
      specialization = specializationIn;
   }
   
   /**
   *Gets the number of SoftballPlayers.
   *@return count
   */
   public static int getCount() {
      return count;
   }
   
   /**
   *Sets number of SoftballPlayers to 0.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   *Formats the batting average of SoftballPlayer.
   *@return batting
   */
   public String stats() {
      DecimalFormat df = new DecimalFormat(".000");
      return df.format(batting);
   }
   
   /**
   *Converts information about SoftballPlayer to a string.
   *@return info
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat(".000");
      return number + " " + name + " (" + position + ") " + stats()
         + "\nSpecialization Factor: " + specialization
         + " (" + getClass() + ") Rating: " + df.format(rating());
   }
   
   /**
   *Calculates rating of player.
   *@return rating
   */
   public abstract double rating();
   
   /**
   *Compares the number of softball player to number
   *of softball player passed in.
   *@param sp for SoftballPlayer passed in
   *@return int for comparing
   */
   public int compareTo(SoftballPlayer sp) {
      return getNumber().compareTo(sp.getNumber());
   }
}