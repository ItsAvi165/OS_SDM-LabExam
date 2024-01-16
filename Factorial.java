import java.io.*;
import java.util.*;

public class Factorial {

	// Method to calculate factorial
	static int factorial(int n)
	{

		// Handling base case
		// If value of n=1 or n=0, it returns 1
		if (n == 0 || n == 1)
			return 1;

		// Generic case : Otherwise we do n*(n-1)!
		return n * factorial(n - 1);
	}


	// main driver method
	public static void main(String[] args)
	{
		int ans = factorial(5);
		System.out.println("Factorial of 5 is :" + ans);
	}
}
