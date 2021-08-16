import java.util.Comparator;
/**
*This program is to sort the ratings of the SoftballPlayers.
*
*Activity 11
*@author Matthew Bankson
*@version April 22, 2019
*/
public class RatingComparator implements Comparator<SoftballPlayer> {
/**
*Compares ratings of SoftballPlayers and sorts from highest to lowest.
*@param p1 for SoftballPlayer
*@param p2 for SoftballPlayer to be compared to
*@return an int based on order of ratings
*/
   public int compare(SoftballPlayer p1, SoftballPlayer p2) {
      return (int) (p2.rating() * 10000 - p1.rating() * 10000);
   }
}