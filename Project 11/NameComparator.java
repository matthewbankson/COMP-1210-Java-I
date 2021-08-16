import java.util.Comparator;

/**
*This program is to sort the names of the SoftballPlayers.
*
*Activity 11
*@author Matthew Bankson
*@version April 22, 2019
*/
public class NameComparator implements Comparator<SoftballPlayer> {
/**
*Sorts compares the last names of players followed by first names.
*@param p1 for SoftballPlayer
*@param p2 for SoftballPlayer compared to
*@return an int to designate order of names
*/
   public int compare(SoftballPlayer p1, SoftballPlayer p2) {
      String p1name = p1.getName();
      String p2name = p2.getName();
      int p1space = p1name.indexOf(' ');
      int p2space = p2name.indexOf(' ');
      String p1newName = p1name.substring(p1space) 
         + p1name.substring(0, p1space);
      String p2newName = p2name.substring(p2space) 
         + p2name.substring(0, p2space);
      return p1newName.toUpperCase().compareTo(p2newName.toUpperCase());
   }
}