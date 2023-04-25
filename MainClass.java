/**
 * Fibonacci sequence
 */

package Pck1;
import java.util.*;

public class MainClass {

	 public static int fibonacci(int nth)
	    {
/**
 * Adds two values.
 *
 * @param operand1 - first numeric value for the ADD operation fibonacci(nth-1
 * @param operand2 -  second numeric value for same purposes fibonacci(nth-2)
 * @return nth sum value
 */
	    if (nth <= 1)
	       return nth;
	    
	    return fibonacci(nth-1) + fibonacci(nth-2);
	    }
	    
	    public static void main (String args[])
	    {
	    
	    int number;
	    
	    Scanner scanner=new Scanner(System.in);
	   
	    System.out.println("Enther nth number to find its Fibonacci sequence: ");
	    number=scanner.nextInt();
	   
	    System.out.println("The "+ number +"th term of the Fibonacci sequence is "+ fibonacci(number));
	    scanner.close();
	    }
	}