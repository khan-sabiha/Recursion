/**
 * Using recursion tp print numbers n through 1.
 */
import java.util.Scanner;
import static java.lang.System.*;
public class Exercise2 {
    //Method for printing numbers n through 1.
    public static void countDown2(int n){
        if (n == 2 ) out.print(n);
        if ( n == 1) out.print(n);

        //If n is even , print the evn numbers.
        if (n % 2 == 0 && n > 2){
            out.print(n + "   ");
            countDown2(n-2);
        }
        //If n is odd, print the odd numbers.
        if (n % 2 != 0 && n > 1){
            out.print(n + "   ");
            countDown2(n-2);
        }
    }

    public static void main (String [] args){

        Scanner kb = new Scanner(in);

        int i = 0;
        //Printing the numbers n through 1.
        while (i < 2) {
            out.println("Enter an integer:" );
            int n = kb.nextInt();
            countDown2(n);
            out.println("   BlastOff!");
            i++;
        }
    }
}
