package Practice1;

import java.util.Scanner;

class swapwo 
{  
	 public static void main(String arg[]) 
	 {  
	   
	  int x, y;
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter any 2 swap numbers:");
	  x = input.nextInt();
	  y = input.nextInt();
	  
	  System.out.println("Before swapping");  
	  System.out.println("value of x:" + x);  
	  System.out.println("value of y:" + y);  
	  
	  System.out.println("After swapping");  
	  x = x + y;  
	  y = x - y;  
	  x = x - y;  
	  System.out.println("value of x:" + x);  
	  System.out.println("value of y:" + y); 
	  input.close();
	  
	 }  
} 
