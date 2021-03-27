/**
 * Using recursion to print digits of an integer vertically, one per line.
 */
import java.util.Scanner;
import static java.lang.System.*;
public class Exercise3 {
    //Method to print digits of an integer vertically, one per line.
    public static void writeVertical(int n) {
        if (n == 1) out.println(1);
        if (n > 1) {
            writeVertical(n / 10);
            out.println(n % 10);
        }
    }
        public static void main (String [] args){
        //Final input and output.
        Scanner kb = new Scanner(in);
        int i = 0;
        while (i < 2){
            out.println("Enter an integer:");
            int n = kb.nextInt();
            writeVertical(n);
            i++;
        }
    }
}
