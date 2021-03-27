/**
 * Using recursion to find the nth number in the Fibonacci series.
 */
import static java.lang.System.*;

public class Exercise1 {

    //Method to find the nth number in the fibonacci series(taken from lab7 pdf).
    public static int fib(int n){
        if (n == 0) return 0;

        if (n == 1 ) return 1;

        if ( n > 1) return fib(n-1)+ fib(n-2);
        return fib(n-1)+ fib(n-2);
    }

    public static void main (String [] args){

        //Print the 20 values in the fibonacci series.
        for (int i = 0; i < 20 ; i++){
            if(i == 19) out.print(fib(i));
            else{
                out.print(fib(i)+ ",");
            }
        }
    }
}
