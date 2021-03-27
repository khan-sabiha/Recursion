/**
 * Sabiha Khan
 * Using recursion - to find sum of the squares of all the digits up to an integer inputted.
 * Using recursion - to find the reverse of a string starting from a specified index.
 */
import static java.lang.System.*;
public class RecursionExercises {

    //Method to find sum of the squares of all the digits up to an integer inputted.
    public static int squares(int n ){
        if(n == 0) return 0;
        if (n == 1) return 1;
        if (n > 1) return n * n + squares(n - 1);
        return 0;
    }

    //Method to find the reverse of a string starting from a specified index.
    public static String reverseString(String n, int i){
        if(i >= 0 && i < n.length()){
          return reverseString(n.substring(1), i) + n.charAt(0);
        }
        return "";
    }
    public static void main(String [] args){
       //Final output.
       out.println( "The sum of the squares up to 5 is: " + squares(5) + ".");
       out.println( "The sum of the squares up to 9 is: " + squares(9) + ".");
       out.println("Starting word is Hello, reversed from index 2 is " + reverseString("Hello", 2) + ".");
       out.println("Starting word is Bamsi, reversed from index 0 is " + reverseString("Bamsi", 0) + ".");
    }


}
