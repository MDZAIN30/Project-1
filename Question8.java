package assignment1;

import java.util.Scanner;

public class Question8 {
	 public static void main(String[] args) 
	 {
	        Scanner s = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int Number = s.nextInt();

	        if (Number % 2 == 0) 
	        {
	            System.out.println("even number:"+Number);
	        }
	        else 
	        {
	            System.out.println( "odd number :"+ Number);
	        }
	    }

}
