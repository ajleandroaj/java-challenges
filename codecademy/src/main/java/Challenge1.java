import java.awt.datatransfer.StringSelection;
import java.util.Comparator;

/**
 * Description:
 * 1. Write a Java program to reverse a string without using the reverse method of Java's String class
 * This exercise will teach you about how Java handles strings. First, you should create a class with a main method that accepts a string and then returns a string where the characters are in reverse order. But, you can't use the reverse method of the String class because that’d be cheating.
 */
public class Challenge1 {

    static String reverseString(String toReverse) {
        StringBuilder result = new StringBuilder();
        for (char character : toReverse.toCharArray()) {
            result.insert(0, character);
        }

        return result.toString();
    }

    /* Cheating way
    static String reverseString(String toReverse) {
        return new StringBuilder(toReverse)
                .reverse()
                .toString();
    }
    */

    /* Pig way
    static String reverseString(String toReverse){
        String result = "";
        for (int i = toReverse.length(); i != 0; i -= 1){
            char character =  toReverse.charAt(i - 1);
            result = result.concat(String.valueOf(character));
        }

        return result;
    }
    */
}
