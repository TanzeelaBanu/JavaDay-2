package tanzeela;

import java.util.Scanner;

public class PositiveNegative 
{
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number: ");
	        int number = scanner.nextInt();

	        if (number > 0) 
		  {
	            System.out.println("Number is positive");
	        } 
		  else if (number < 0) 
		  {
	            System.out.println("Number is negative");
	        }
		  else
		  {
			System.out.println("Invalid input");
		  }

	        scanner.close();
	    }
}
