package Practice1;

import java.util.Scanner;

public class Fibo 
{
	
	    // Function to print the fibonacci series
	    public static int fib(int n)
	    {
	        // Base Case
	        if (n <= 1)
	            return n;
	  
	        // Recursive call
	        return fib(n - 1)
	            + fib(n - 2);
	    }
	  
	    // Driver Code
	    public static void
	    main(String args[])
	    {
	        // Given Number N
	        int N ;
	        try (Scanner input = new Scanner(System.in)) {
				System.out.println("Enter the Value:");
				N = input.nextInt();
			}
	        // Print the first N numbers
	        for (int i = 0; i < N; i++) {
	  
	            System.out.print(fib(i) + " ");
	        }
	    }

}
