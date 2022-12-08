// ****************************************************************
// Factorials.java
//
// Reads integers from the user and prints the factorial of each.
//          
// ****************************************************************

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;

public class Factorials{
    public static void main(String[] args){
	    try {
	    	Scanner scanner = new Scanner(System.in);
		char keepGoing = 'y';
	
		while (keepGoing == 'y' || keepGoing == 'Y')
		    {
			System.out.print("Enter an integer: ");
			int val = scanner.nextInt();
			if(val >16) {
				System.out.println("input again");
				continue;
			}
			System.out.println("Factorial(" + val + ") = " 
					   + MathUtils.factorial(val));
			System.out.print("Another factorial? (y/n) ");
			keepGoing = scanner.next().charAt(0);
		    }
	    } catch (InputMismatchException e) {
	    	System.out.println("input int");
	    }
    }
}
