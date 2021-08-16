/**
*This program defines the InvalidCategoryException.
*
*Project 11
*@author Matthew Bankson
*@version April 22, 2019
*/
public class InvalidCategoryException extends Exception {
/**
*Creates the exception.
*@param category for type of invalid data
*/
   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category + "\"");
   }
}